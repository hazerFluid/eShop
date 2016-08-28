package dao.impls;

import dao.api.CartDAO;
import dao.entity.Cart;
import dao.entity.Product;
import dao.exceptions.CartException;

import javax.persistence.EntityTransaction;

public class CartApp extends GenericDAOImpl<Cart, Integer> implements CartDAO {

    public CartApp(Class<Cart> aClass) {
        super(aClass);
    }

    // TODO: 26.08.2016
    @Override
    public void addProduct(Cart cart, Product product) throws CartException {

        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();



        } catch (Exception ex) {

        }
    }

    @Override
    public void removeProduct(Cart cart, Product product) throws CartException {

        EntityTransaction transaction = entityManager.getTransaction();
    }

    @Override
    public void clearProductList(Cart cart) throws CartException {

        EntityTransaction transaction = entityManager.getTransaction();

    }
}
