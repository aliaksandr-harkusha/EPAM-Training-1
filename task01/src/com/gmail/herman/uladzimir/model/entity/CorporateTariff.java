package com.gmail.herman.uladzimir.model.entity;

import java.util.Objects;

public class CorporateTariff extends Tariff {

    private int freeColleagueMinute;
    private double costColleagueMinute;

    public CorporateTariff() {
    }

    public CorporateTariff(String name, String description, boolean inArchive,
                           double subscriptionFee, int freeMinute, double costMinute,
                           int freeSms, double costSms, int freeInternet,
                           double costInternet, int freeColleagueMinute,
                           double costColleagueMinute) {
        super(name, description, inArchive, subscriptionFee, freeMinute, costMinute,
                freeSms, costSms, freeInternet, costInternet);
        this.freeColleagueMinute = freeColleagueMinute;
        this.costColleagueMinute = costColleagueMinute;
    }

    //похоже на клонирование объекта - за это отвечает метод clone- класса Object
    //таких конструкторов не должно быть
    public CorporateTariff(CorporateTariff o) {
        super(o.getName(), o.getDescription(), o.isInArchive(), o.getSubscriptionFee(),
                o.getFreeMinute(), o.getCostMinute(), o.getFreeSms(), o.getCostSms(),
                o.getFreeInternet(), o.getCostInternet());
        this.freeColleagueMinute = o.freeColleagueMinute;
        this.costColleagueMinute = o.costColleagueMinute;
    }

    public int getFreeColleagueMinute() {
        return freeColleagueMinute;
    }

    public void setFreeColleagueMinute(int freeColleagueMinute) {
        this.freeColleagueMinute = freeColleagueMinute;
    }

    public double getCostColleagueMinute() {
        return costColleagueMinute;
    }

    public void setCostColleagueMinute(double costColleagueMinute) {
        this.costColleagueMinute = costColleagueMinute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CorporateTariff tariff = (CorporateTariff) o;
        return freeColleagueMinute == tariff.freeColleagueMinute &&
                Double.compare(tariff.costColleagueMinute, costColleagueMinute) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), freeColleagueMinute, costColleagueMinute);
    }

    @Override
    public String toString() {
        return "TARIFF: " + super.getName() + ", TYPE: Corporate" + ", IN ARCHIVE: " +
                super.isInArchive() + ", PRICE: $" + super.getSubscriptionFee() +
                "\nDETAILS: $" + super.getCostMinute() + " per min + " +
                super.getFreeMinute() + " min free, $" + costColleagueMinute +
                " per min with colleagues + " + freeColleagueMinute + " min free, $" +
                super.getCostSms() + " per sms + " + super.getFreeSms() + " sms free, $" +
                super.getCostInternet() + " for 1MB + " + super.getFreeInternet() + " MB free!";
    }

}
