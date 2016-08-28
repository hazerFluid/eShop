package dao.api;

import dao.entity.Parameter;
import dao.entity.Product;
import dao.exceptions.ProductException;

import java.util.List;

public interface ProductDAO extends GenericDAO<Product, Integer>{

    List<Product> getProductByParameters(Parameter parameter) throws ProductException;

    List<Product> getProductsByCategory(String categoryName) throws ProductException;

}
