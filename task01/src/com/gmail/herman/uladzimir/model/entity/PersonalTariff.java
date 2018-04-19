package com.gmail.herman.uladzimir.model.entity;

import java.util.Objects;

public class PersonalTariff extends Tariff {

    private int freeInternationalMinute;
    private double costInternationalMinute;

    public PersonalTariff() {
    }

    public PersonalTariff(String name, String description, boolean inArchive,
                          double subscriptionFee, int freeMinute, double costMinute,
                          int freeSms, double costSms, int freeInternet, double costInternet,
                          int freeInternationalMinute, double costInternationalMinute) {
        super(name, description, inArchive, subscriptionFee, freeMinute, costMinute,
                freeSms, costSms, freeInternet, costInternet);
        this.freeInternationalMinute = freeInternationalMinute;
        this.costInternationalMinute = costInternationalMinute;
    }

    public PersonalTariff(PersonalTariff o) {
        super(o.getName(), o.getDescription(), o.isInArchive(), o.getSubscriptionFee(),
                o.getFreeMinute(), o.getCostMinute(), o.getFreeSms(), o.getCostSms(),
                o.getFreeInternet(), o.getCostInternet());
        this.freeInternationalMinute = o.freeInternationalMinute;
        this.costInternationalMinute = o.costInternationalMinute;
    }

    public int getFreeInternationalMinute() {
        return freeInternationalMinute;
    }

    public void setFreeInternationalMinute(int freeInternationalMinute) {
        this.freeInternationalMinute = freeInternationalMinute;
    }

    public double getCostInternationalMinute() {
        return costInternationalMinute;
    }

    public void setCostInternationalMinute(double costInternationalMinute) {
        this.costInternationalMinute = costInternationalMinute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PersonalTariff that = (PersonalTariff) o;
        return freeInternationalMinute == that.freeInternationalMinute &&
                Double.compare(that.costInternationalMinute, costInternationalMinute) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), freeInternationalMinute, costInternationalMinute);
    }

    @Override
    public String toString() {
        return "TARIFF: " + super.getName() + ", TYPE: Personal" + ", IN ARCHIVE: " +
                super.isInArchive() + ", PRICE: $" + super.getSubscriptionFee() +
                "\nDETAILS: $" + super.getCostMinute() + " per min + " +
                super.getFreeMinute() + " min free, $" + costInternationalMinute +
                " per international min + " + freeInternationalMinute + " international min free, $" +
                super.getCostSms() + " per sms + " + super.getFreeSms() + " sms free, $" +
                super.getCostInternet() + " for 1MB + " + super.getFreeInternet() + " MB free!";
    }

}