package dao.impls;

import dao.api.ProductDAO;
import dao.entity.Parameter;
import dao.entity.Product;
import dao.exceptions.ProductException;

import java.util.List;

public class ProductApp extends GenericDAOImpl<Product, Integer> implements ProductDAO {

    // TODO: 26.08.2016
    @Override
    public Product getProductByParameters(Parameter parameter) throws ProductException {
        return null;
    }

    @Override
    public List<Product> findProductsByCategory(int categoryId) throws ProductException {
        return null;
    }
}
