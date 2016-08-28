import dao.entity.Cart;
import dao.entity.Client;
import dao.exceptions.EntityException;
import dao.impls.ClientApp;


public class Main {

    public static void main(String[] args) {

        ClientApp app = new ClientApp();

        try {

            Client client = new Client();
            Cart cart = new Cart();

            client.setFirstName("Lopat");
            client.setLastName("Asimov");

            cart.setClient(client);
            client.setCart(cart);

            app.save(client);

        } catch (EntityException e) {
            e.printStackTrace();
        }

    }
}
