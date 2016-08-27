package dao.api;

import dao.entity.Product;
import dao.exceptions.CartException;

public interface CartDAO {

    void addProduct(Product product) throws CartException;

    void addProductById(int id) throws CartException;

    void clearProductList() throws CartException;

}
