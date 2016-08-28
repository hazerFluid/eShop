import dao.entity.Cart;
import dao.entity.Client;
import dao.exceptions.ClientException;
import service.impls.ClientServiceImpl;


public class Main {

    public static void main(String[] args) {

        ClientServiceImpl clientService = new ClientServiceImpl();

        try {

            Client client = new Client();
            Cart cart = new Cart();

            client.setFirstName("Dimonn");
            client.setLastName("Eltsin");

            cart.setClient(client);
            client.setCart(cart);

            clientService.createClient(client);

        } catch (ClientException e) {

            e.printStackTrace();

        }

    }
}
