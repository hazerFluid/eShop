package dao.api;

import dao.entity.Client;
import dao.entity.Order;

import java.util.List;

/**
 * Data Access Object interface to work with Client entity database operations
 */
public interface ClientDAO extends GenericDAO<Client, Integer>{

    boolean checkAvailable(String email);

    Client getClientByEmail(String email);

    List<Order> getOrders(Client client);

}
