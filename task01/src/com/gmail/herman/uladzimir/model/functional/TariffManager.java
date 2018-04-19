package com.gmail.herman.uladzimir.model.functional;

import com.gmail.herman.uladzimir.model.entity.CorporateTariff;
import com.gmail.herman.uladzimir.model.entity.PersonalTariff;
import com.gmail.herman.uladzimir.model.entity.Tariff;

public class TariffManager {

    public Tariff[] getAllTariff() {
        return TariffWorker.getInstance().getAllTariff();
    }

    public String showAllTariff() {
        String result = "";
        Tariff tariffs[] = TariffWorker.getInstance().getAllTariff();

        for (int i = 0; i < tariffs.length; i++) {
            result += tariffs[i].toString() + "\n";
        }

        return result;
    }

    public void addTariff(Tariff tariff) {
        TariffWorker.getInstance().addTariff(tariff);
    }

    public Tariff getByIndex(int index) {
        return TariffWorker.getInstance().getByIndex(index);
    }

    public Tariff cloneTariff(Tariff tariff) {

        if (tariff instanceof PersonalTariff) {
            return new PersonalTariff((PersonalTariff) tariff);
        } else {
            return new CorporateTariff((CorporateTariff) tariff);
        }

    }

    public void removeByIndex(int index) {
        TariffWorker.getInstance().removeByIndex(index);
    }

    public void clear() {
        TariffWorker.getInstance().clear();
    }

}