package com.gmail.herman.uladzimir.model.functional;

import com.gmail.herman.uladzimir.model.entity.Client;
import com.gmail.herman.uladzimir.model.entity.CorporateClient;
import com.gmail.herman.uladzimir.model.entity.IndividualClient;

public class ClientManager {

    public Client[] getAllClient() {
        return ClientWorker.getInstance().getAllClient();
    }

    public String showAllClient() {
        String result = "";
        Client clients[] = ClientWorker.getInstance().getAllClient();

        for (int i = 0; i < clients.length; i++) {
            result += clients[i].toString() + "\n";
        }

        return result;
    }

    public void addClient(Client client) {
        ClientWorker.getInstance().addTariff(client);
    }

    public Client getByIndex(int index) {
        return ClientWorker.getInstance().getByIndex(index);
    }

    public Client cloneClient(Client client) {

        if (client instanceof IndividualClient) {
            return new IndividualClient((IndividualClient) client);
        } else {
            return new CorporateClient((CorporateClient) client);
        }

    }

    public void removeByIndex(int index) {
        ClientWorker.getInstance().removeByIndex(index);
    }

    public void clear() {
        ClientWorker.getInstance().clear();
    }

}