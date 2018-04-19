package com.gmail.herman.uladzimir.model.functional;

import com.gmail.herman.uladzimir.model.entity.Client;

import java.util.ArrayList;

public class ClientWorker {

    private static ClientWorker unique;
    private ArrayList<Client> clients;

    private ClientWorker() {
        clients = new ArrayList<>();
    }

    public static ClientWorker getInstance() {
        if (null == unique) {
            unique = new ClientWorker();
        }
        return unique;
    }

    public Client[] getAllClient() {
        Client[] clientArray = new Client[clients.size()];

        for (int i = 0; i < clientArray.length; i++) {
            clientArray[i] = clients.get(i);
        }

        return clientArray;
    }

    public int countClient() {
        return clients.size();
    }

    public boolean isEmpty() {
        return clients.isEmpty();
    }

    public Client getByIndex(int index) {
        return clients.get(index);
    }

    public void addTariff(Client client) {
        clients.add(client);
    }

    public void addClient(Client... client) {
        for (int i = 0; i < client.length; i++) {
            clients.add(client[i]);
        }
    }

    public void removeByIndex(int index) {
        clients.remove(index);
    }

    public void clear() {
        clients.clear();
    }

}