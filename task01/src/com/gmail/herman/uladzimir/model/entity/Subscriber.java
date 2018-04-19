package com.gmail.herman.uladzimir.model.entity;

import java.util.Objects;

public class Subscriber {

    private String phoneNumber;
    private String connectionDate;
    private Client client;
    private Tariff tariff;

    public Subscriber() {
    }

    public Subscriber(String phoneNumber, String connectionDate,
                      Client client, Tariff tariff) {
        this.phoneNumber = phoneNumber;
        this.connectionDate = connectionDate;
        this.client = client;
        this.tariff = tariff;
    }

    public Subscriber(Subscriber o) {
        this.phoneNumber = o.phoneNumber;
        this.connectionDate = o.connectionDate;
        this.client = o.client;
        this.tariff = o.tariff;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getConnectionDate() {
        return connectionDate;
    }

    public void setConnectionDate(String connectionDate) {
        this.connectionDate = connectionDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscriber that = (Subscriber) o;
        return Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(connectionDate, that.connectionDate) &&
                Objects.equals(client, that.client) &&
                Objects.equals(tariff, that.tariff);
    }

    @Override
    public int hashCode() {

        return Objects.hash(phoneNumber, connectionDate, client, tariff);
    }

    @Override
    public String toString() {
        return phoneNumber + ", TARIFF: " + tariff.getName() + ", CONNECTION: " + connectionDate +
                ", CLIENTS: " + client;
    }

}