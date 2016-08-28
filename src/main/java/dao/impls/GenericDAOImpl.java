package dao.impls;

import dao.HibernateUtil;
import dao.api.GenericDAO;
import dao.exceptions.EntityException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Provides common generic implementation of GenericDAO interface methods.
 * To be extended.
 *
 * @param <T> Generic Entity type
 * @param <PK> Generic entity primary key
 */

public abstract class GenericDAOImpl<T, PK> implements GenericDAO<T, PK> {

    //private static final Logger logger = LoggerFactory.getLogger(GenericDAOImpl.class);
    protected EntityManager entityManager = HibernateUtil.getEntityManager();
    private Class<T> aClass;

    public GenericDAOImpl(Class<T> aClass) {
        this.aClass = aClass;
    }

    @SuppressWarnings("unchecked")
    public GenericDAOImpl() {
       this.aClass =  (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public Class<T> getaClass() {
        return aClass;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<T> findAll() {
        return entityManager.createQuery("FROM " + aClass.getSimpleName() + " t").getResultList();
    }

    @Override
    public T save(T object) throws EntityException {

        EntityTransaction transaction = entityManager.getTransaction();

        try {

            transaction.begin();
            entityManager.persist(object);
            transaction.commit();

        } catch (Exception ex) {

            throw new EntityException("Create method", ex);

        } finally {

            if(transaction.isActive()){

                transaction.rollback();

            }
        }
        return object;
    }

    @Override
    public void delete(T object) throws EntityException {

        EntityTransaction transaction = entityManager.getTransaction();

        try {

           transaction.begin();

            object = entityManager.merge(object);
            entityManager.remove(object);

            transaction.commit();

        } catch (Exception ex) {

            throw new EntityException("Delete method", ex);

        } finally {

            if(transaction.isActive()){

                transaction.rollback();

            }

        }
    }

    @Override
    public T findById(PK id) throws EntityException {

        try {

            return entityManager.find(getaClass(), id);

        } catch (Exception ex) {

            throw new EntityException("Read method", ex);

        }
    }

    @Override
    public T update(T object) throws EntityException {

        EntityTransaction transaction = entityManager.getTransaction();
        T mergedEntity;

        try {

            transaction.begin();
            mergedEntity = entityManager.merge(object);
            transaction.commit();

        } catch (Exception ex) {

            throw new EntityException("Update method", ex);

        } finally {

            if(transaction.isActive()){

                transaction.rollback();

            }
        }
        return mergedEntity;
    }

}
