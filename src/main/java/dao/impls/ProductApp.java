package dao.impls;

import dao.api.ProductDAO;
import dao.entity.Parameter;
import dao.entity.Product;
import dao.exceptions.ProductException;

import javax.persistence.Query;
import java.util.List;

public class ProductApp extends GenericDAOImpl<Product, Integer> implements ProductDAO { //

    @Override
    public List<Product> getProductByParameters(Parameter parameter) throws ProductException {

        Query query =  entityManager.createQuery("select p from Product p where p.parameter = :parameter");
        query.setParameter("parameter", parameter);
        return query.getResultList();

    }

    @Override
    public List<Product> getProductsByCategory(String categoryName) throws ProductException {

        Query query =  entityManager.createQuery("select p from Product p where p.category.name = :name");
        query.setParameter("name", categoryName);
        return query.getResultList();

    }


}
