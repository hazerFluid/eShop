package dao.api;

import dao.entity.Parameter;
import dao.entity.Product;

import java.util.List;

public interface ProductDAO {

    void updateProduct(Product product);

    void createProduct(Product product);

    Product getProductByParameters(Parameter parameter);

    List<Product> findProductsByCategory(int categoryId);

    Product findProductById(int productId);


}
