package dao.api;

import dao.entity.Cart;
import dao.entity.Product;
import dao.exceptions.CartException;

public interface CartDAO extends GenericDAO<Cart, Integer>  {

    void addProduct(Cart cart, Product product) throws CartException;

    void removeProduct(Cart cart, Product product) throws CartException;

    void clearProductList(Cart cart) throws CartException;

}
