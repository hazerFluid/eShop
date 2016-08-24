package dao.impls;

import dao.api.DAO;
import dao.api.ProductDAO;
import dao.entity.Product;
import hibernate.HibernateUtil;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductDAOImpl implements ProductDAO, DAO {

    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    Logger logger = LoggerFactory.getLogger(Product.class);

    @Override
    public void create(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
        logger.info("Object created" + object.toString());
    }

    @Override
    public Object get(Class clazz, int id) {
        return null;
    }

    @Override
    public void update(Object object) {

    }

    @Override
    public void delete(Object object) {

    }
}
