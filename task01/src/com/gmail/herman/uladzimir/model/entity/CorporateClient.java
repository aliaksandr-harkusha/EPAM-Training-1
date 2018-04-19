package com.gmail.herman.uladzimir.model.entity;

import java.util.Objects;

public class CorporateClient extends Client {

    private String companyName;
    private String email;

    public CorporateClient() {
    }

    public CorporateClient(String city, String street, int houseNumber,
                           String companyName, String email) {
        super(city, street, houseNumber);
        this.companyName = companyName;
        this.email = email;
    }

    public CorporateClient(CorporateClient o) {
        super(o.getCity(), o.getStreet(), o.getHouseNumber());
        this.companyName = o.companyName;
        this.email = o.email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CorporateClient that = (CorporateClient) o;
        return Objects.equals(companyName, that.companyName) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), companyName, email);
    }

    @Override
    public String toString() {
        return companyName + ", E-MAIL: " + email + ", ADDRESS: " + super.getCity() +
                ", " + super.getStreet() + " str., " + super.getHouseNumber();
    }

}