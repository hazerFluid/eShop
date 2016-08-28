package dao.impls;

import dao.api.ClientDAO;
import dao.entity.Client;
import dao.entity.Order;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.List;

public class ClientApp extends GenericDAOImpl<Client, Integer> implements ClientDAO {

    public ClientApp() {
        super(Client.class);
    }

    @Override
    public boolean checkAvailable(String email) {

        Query query =
        entityManager.createQuery("select count(*) from Client c where c.email = :email")
                .setParameter("email", email);

        int count = (int)query.getSingleResult();

        return (count < 1);
    }

    @Override
    public Client getClientByEmail(String email) {

        Client client = null;

        try {
            Query query = entityManager.createQuery("select c from Client c where c.email = :mail");
            query.setParameter("mail", email);
            client = (Client) query.getSingleResult();
        } catch (NoResultException ex) {
            //do nothing
        }

        return client;
    }

    @Override
    public List<Order> getOrders(Client client) {

        Query query = entityManager.createQuery("select o from Order o where o.cart.visitor = :visitor");
        query.setParameter("visitor", client);
        return query.getResultList();

    }
}
