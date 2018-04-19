package com.gmail.herman.uladzimir.model.functional;

import com.gmail.herman.uladzimir.model.entity.Tariff;

import java.util.ArrayList;

public class TariffWorker {

    private static TariffWorker unique;
    private ArrayList<Tariff> tariffs;

    private TariffWorker() {
        tariffs = new ArrayList<>();
    }

    public static TariffWorker getInstance() {
        if (null == unique) {
            unique = new TariffWorker();
        }
        return unique;
    }

    public Tariff[] getAllTariff() {
        Tariff[] tariffArray = new Tariff[tariffs.size()];

        for (int i = 0; i < tariffArray.length; i++) {
            tariffArray[i] = tariffs.get(i);
        }

        return tariffArray;
    }

    public int countTariff() {
        return tariffs.size();
    }

    public boolean isEmpty() {
        return tariffs.isEmpty();
    }

    public Tariff getByIndex(int index) {
        return tariffs.get(index);
    }

    public void addTariff(Tariff tariff) {
        tariffs.add(tariff);
    }

    public void addTariff(Tariff... tariff) {
        for (int i = 0; i < tariff.length; i++) {
            tariffs.add(tariff[i]);
        }
    }

    public void removeByIndex(int index) {
        tariffs.remove(index);
    }

    public void clear() {
        tariffs.clear();
    }

}