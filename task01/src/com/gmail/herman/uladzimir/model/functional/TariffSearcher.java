package com.gmail.herman.uladzimir.model.functional;

import com.gmail.herman.uladzimir.model.entity.PersonalTariff;
import com.gmail.herman.uladzimir.model.entity.Tariff;

import java.util.ArrayList;

public class TariffSearcher {

    public Tariff[] searchPersonalTariffBySubscriptionFeeDiapason(double min, double max) {
        Tariff[] tariffs = TariffWorker.getInstance().getAllTariff();
        ArrayList<Tariff> listTariff = new ArrayList<>();

        for (int i = 0; i < tariffs.length; i++) {
            if (tariffs[i] instanceof PersonalTariff) {
                if (tariffs[i].getSubscriptionFee() >= min &&
                        tariffs[i].getSubscriptionFee() <= max) {
                    listTariff.add(tariffs[i]);
                }
            }
        }

        Tariff[] resultTariffs = new Tariff[listTariff.size()];

        for (int i = 0; i < resultTariffs.length; i++) {
            resultTariffs[i] = listTariff.get(i);
        }

        return resultTariffs;
    }

}