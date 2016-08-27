package dao.api;

import dao.entity.Parameter;
import dao.entity.Product;
import dao.exceptions.ProductException;

import java.util.List;

public interface ProductDAO {

    Product getProductByParameters(Parameter parameter) throws ProductException;

    List<Product> findProductsByCategory(int categoryId) throws ProductException;

}
