package service.impls;

import dao.entity.Client;
import dao.exceptions.ClientException;
import dao.exceptions.EntityException;
import dao.impls.ClientApp;
import service.api.ClientService;

public class ClientServiceImpl implements ClientService {

    private ClientApp clientApp = new ClientApp();

    @Override
    public boolean createClient(Client client) throws ClientException {

        try {

            clientApp.save(client);

        } catch (EntityException e) {
            throw new ClientException("Cant save client", e);
        }

        return true;
    }
}
