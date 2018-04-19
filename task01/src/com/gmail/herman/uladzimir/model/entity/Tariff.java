package com.gmail.herman.uladzimir.model.entity;

import java.util.Objects;

public class Tariff implements Comparable<Tariff> {

    private String name;
    private String description;
    private boolean inArchive;
    private double subscriptionFee;
    private int freeMinute;
    private double costMinute;
    private int freeSms;
    private double costSms;
    private int freeInternet;
    private double costInternet;

    public Tariff() {
    }

    public Tariff(String name, String description, boolean inArchive, double subscriptionFee,
                  int freeMinute, double costMinute, int freeSms, double costSms, int freeInternet,
                  double costInternet) {
        this.name = name;
        this.description = description;
        this.inArchive = inArchive;
        this.subscriptionFee = subscriptionFee;
        this.freeMinute = freeMinute;
        this.costMinute = costMinute;
        this.freeSms = freeSms;
        this.costSms = costSms;
        this.freeInternet = freeInternet;
        this.costInternet = costInternet;
    }

    public Tariff(Tariff o) {
        this.name = o.name;
        this.description = o.description;
        this.inArchive = o.inArchive;
        this.subscriptionFee = o.subscriptionFee;
        this.freeMinute = o.freeMinute;
        this.costMinute = o.costMinute;
        this.freeSms = o.freeSms;
        this.costSms = o.costSms;
        this.freeInternet = o.freeInternet;
        this.costInternet = o.costInternet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isInArchive() {
        return inArchive;
    }

    public void setInArchive(boolean inArchive) {
        this.inArchive = inArchive;
    }

    public double getSubscriptionFee() {
        return subscriptionFee;
    }

    public void setSubscriptionFee(float subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }

    public int getFreeMinute() {
        return freeMinute;
    }

    public void setFreeMinute(int freeMinute) {
        this.freeMinute = freeMinute;
    }

    public double getCostMinute() {
        return costMinute;
    }

    public void setCostMinute(float costMinute) {
        this.costMinute = costMinute;
    }

    public int getFreeSms() {
        return freeSms;
    }

    public void setFreeSms(int freeSms) {
        this.freeSms = freeSms;
    }

    public double getCostSms() {
        return costSms;
    }

    public void setCostSms(float costSms) {
        this.costSms = costSms;
    }

    public int getFreeInternet() {
        return freeInternet;
    }

    public void setFreeInternet(int freeInternet) {
        this.freeInternet = freeInternet;
    }

    public double getCostInternet() {
        return costInternet;
    }

    public void setCostInternet(float costInternet) {
        this.costInternet = costInternet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tariff tariff = (Tariff) o;
        return Objects.equals(name, tariff.name) &&
                Objects.equals(description, tariff.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, description);
    }

    @Override
    public int compareTo(Tariff o) {
        return Double.compare(subscriptionFee, o.subscriptionFee);
    }

}