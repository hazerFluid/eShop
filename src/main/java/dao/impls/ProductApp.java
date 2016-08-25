package dao.impls;

import dao.api.DAO;
import dao.api.ProductDAO;
import dao.entity.Product;
import hibernate.HibernateUtil;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductApp implements ProductDAO, DAO<Product> {

    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    Logger logger = LoggerFactory.getLogger(Product.class);

    @Override
    public Product get(Class clazz, int id) {
        return null;
    }

    @Override
    public void create(Product object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
        logger.info("Object created" + object.toString());
    }

    @Override
    public void update(Product object) {

    }

    @Override
    public void delete(Product object) {

    }
}
