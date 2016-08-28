package service.api;

import dao.entity.Client;
import dao.exceptions.ClientException;

/**
 * Service, providing methods to work with user data and entity
 */
public interface ClientService {

    public boolean createClient(Client client) throws ClientException;
}
