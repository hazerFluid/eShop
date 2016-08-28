package dao.impls;

import dao.api.OrderDAO;
import dao.entity.Order;

import java.util.List;

public class OrderApp extends GenericDAOImpl<Order, Integer> implements OrderDAO {

    public OrderApp(Class<Order> aClass) {
        super(aClass);
    }

    @Override
    public List<Order> findAllOrdersByClientId(int clientId) {
        return null;
    }

    @Override
    public void repeat(int orderID) {

    }
}
