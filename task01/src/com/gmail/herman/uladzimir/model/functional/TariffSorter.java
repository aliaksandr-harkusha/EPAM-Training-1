package com.gmail.herman.uladzimir.model.functional;

import com.gmail.herman.uladzimir.model.entity.Tariff;

public class TariffSorter<T extends Comparable<T>> {

    public void sortBySubscriptionFee() {
        //пока синглтоны не будем использовать
        //лучше создавай объекты пока по старинке: TariffWorker tariffWorker = new TariffWorker(); 
        Tariff tariffsArray[] = TariffWorker.getInstance().getAllTariff();
        Tariff tempTariff;
        int iteration = tariffsArray.length - 1;
        boolean sort;
        //для сортировки в java используется метод: Collection.sort();
        //свою сортировку не нужно изобретать
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
