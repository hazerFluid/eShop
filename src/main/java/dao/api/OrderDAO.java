package dao.api;

import dao.entity.Order;

import java.util.List;

public interface OrderDAO extends GenericDAO<Order, Integer>{

    List<Order> findAllOrdersByClientId(int clientId);

    void repeat(int orderID);

}
