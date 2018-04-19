package com.gmail.herman.uladzimir.model.functional;

import com.gmail.herman.uladzimir.model.entity.Tariff;

public class TariffSorter<T extends Comparable<T>> {

    public void sortBySubscriptionFee() {
        Tariff tariffsArray[] = TariffWorker.getInstance().getAllTariff();
        Tariff tempTariff;
        int iteration = tariffsArray.length - 1;
        boolean sort;

        for (int j = iteration; j > 0; j--) {
            sort = false;

            for (int i = 0; i < j; i++) {
                if (tariffsArray[i].compareTo(tariffsArray[i + 1]) > 0) {
                    tempTariff = tariffsArray[i];
                    tariffsArray[i] = tariffsArray[i + 1];
                    tariffsArray[i + 1] = tempTariff;
                    sort = true;
                }
            }

            if (!sort) {
                break;
            }
        }

        TariffWorker.getInstance().clear();
        TariffWorker.getInstance().addTariff(tariffsArray);
    }

}