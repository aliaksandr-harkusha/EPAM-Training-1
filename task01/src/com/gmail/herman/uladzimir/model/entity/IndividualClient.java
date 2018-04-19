package com.gmail.herman.uladzimir.model.entity;

import java.util.Objects;

public class IndividualClient extends Client {

    private String name;
    private String surname;
    private String passportNumber;

    public IndividualClient() {
    }

    public IndividualClient(String city, String street, int houseNumber,
                            String name, String surname, String passportNumber) {
        super(city, street, houseNumber);
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
    }

    public IndividualClient(IndividualClient o) {
        super(o.getCity(), o.getStreet(), o.getHouseNumber());
        this.name = o.name;
        this.surname = o.surname;
        this.passportNumber = o.passportNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        IndividualClient that = (IndividualClient) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(passportNumber, that.passportNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), name, surname, passportNumber);
    }

    @Override
    public String toString() {
        return name + " " + surname + ", PASSPORT: " + passportNumber + ", ADDRESS: " +
                super.getCity() + ", " + super.getStreet() + " str., " + super.getHouseNumber();
    }

}