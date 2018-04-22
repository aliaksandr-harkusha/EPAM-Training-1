package com.gmail.herman.uladzimir.model.entity;

import java.util.Objects;

//классы клиентов по сути избыточны
//для подсчета общей численности можно использовать поле типа int numberClient - которое будет содержать количество клиентов
public class Client {

    private String city;
    private String street;
    private int houseNumber;

    public Client() {
    }

    public Client(String city, String street, int houseNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public Client(Client o) {
        this.city = o.city;
        this.street = o.street;
        this.houseNumber = o.houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return houseNumber == client.houseNumber &&
                Objects.equals(city, client.city) &&
                Objects.equals(street, client.street);
    }

    @Override
    public int hashCode() {

        return Objects.hash(city, street, houseNumber);
    }

}
