package dao.api;

import dao.entity.Order;

import java.util.List;

public interface OrderDAO {

    void createOrder(Order order);
    List<Order> findAllOrdersByClientId(int clientId);
    List<Order> findAllOrders();
    void orderAgain(int orderID);

}
