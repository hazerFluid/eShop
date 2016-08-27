import dao.entity.Client;
import dao.exceptions.EntityException;
import dao.impls.ClientApp;


public class Main {

    public static void main(String[] args) {

        ClientApp app = new ClientApp();

        try {

            Client client = new Client();

            app.create(client);

        } catch (EntityException e) {
            e.printStackTrace();
        }

    }
}
