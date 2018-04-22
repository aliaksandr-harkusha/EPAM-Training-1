//имя-фамилию - не добавляем в название пакета
//gmail - проект вы делаете в компании epam, а не gmail
package com.gmail.herman.uladzimir.controller;

import com.gmail.herman.uladzimir.model.entity.*;
import com.gmail.herman.uladzimir.model.functional.*;
import com.gmail.herman.uladzimir.view.View;

public class StartTask {
    public static void main(String[] args) {

        //tariff initialization
        TariffManager tariffManager = new TariffManager();

        //много параметров в конструкторе - можно перепутать их порядок при инициализации
        //лучше вызови последовательно set методы для инициализации полей объекта
        CorporateTariff corporateTariff1 = new CorporateTariff("Corporation",
                "Maintain communication between colleagues", false,
                50, 100, 0.03, 0, 0.04,
                1024, 0.01, 10000, 0.05);
        tariffManager.addTariff(corporateTariff1);

        CorporateTariff corporateTariff2 = new CorporateTariff("Small Business",
                "For small business", false, 35,
                100, 0.05, 0, 0.05, 1024,
                0.01, 1000, 0.02);
        tariffManager.addTariff(corporateTariff2);

        PersonalTariff personalTariff1 = new PersonalTariff("Smart++", "On every day",
                false, 9.5, 250, 0.02, 25,
                0.03, 3072, 0.01, 0, 0.75);
        tariffManager.addTariff(personalTariff1);

        PersonalTariff personalTariff2 = new PersonalTariff("Comfort", "For a better life",
                true, 11.75, 500, 0.07, 50,
                0.05, 512, 0.08, 10, 0.95);
        tariffManager.addTariff(personalTariff2);

        PersonalTariff personalTariff3 = new PersonalTariff("Online", "For Internet users",
                false, 11, 100, 0.08, 0,
                0.1, 5120, 0.02, 0, 0.8);
        tariffManager.addTariff(personalTariff3);

        //creating customers
        ClientManager clientManager = new ClientManager();

        CorporateClient corporateClient1 = new CorporateClient("Hrodna", "Masherava", 12,
                "JSC Network technologies", "office@nt.by");
        clientManager.addClient(corporateClient1);

        IndividualClient individualClient1 = new IndividualClient("Brest", "Shauchenki", 17,
                "Mikita", "Navavilenski", "MP2478184");
        clientManager.addClient(individualClient1);

        IndividualClient individualClient2 = new IndividualClient("Minsk", "Nyamiha", 6,
                "Hanna", "Panyauskaya", "MP3157920");
        clientManager.addClient(individualClient2);

        IndividualClient individualClient3 = new IndividualClient("Homel", "Pramyslovaya", 103,
                "Raman", "Barun", "MP2430182");
        clientManager.addClient(individualClient3);

        IndividualClient individualClient4 = new IndividualClient("Vitebsk", "Paunochnaya", 32,
                "Nastasya", "Arabun", "MP3256237");
        clientManager.addClient(individualClient4);

        IndividualClient individualClient5 = new IndividualClient("Mahilyou", "Alifyorava", 7,
                "Barys", "Yakavitski", "MP2127968");
        clientManager.addClient(individualClient5);

        //creating subscribers
        SubscriberManager subscriberManager = new SubscriberManager();

        Subscriber subscriber1 = new Subscriber("+375291501257", "15/03/2018",
                clientManager.getByIndex(0), tariffManager.getByIndex(1));
        subscriberManager.addSubscriber(subscriber1);

        Subscriber subscriber2 = new Subscriber("+375291501258", "15/03/2018",
                clientManager.getByIndex(0), tariffManager.getByIndex(1));
        subscriberManager.addSubscriber(subscriber2);

        Subscriber subscriber3 = new Subscriber("+375291501259", "15/03/2018",
                clientManager.getByIndex(0), tariffManager.getByIndex(1));
        subscriberManager.addSubscriber(subscriber3);

        Subscriber subscriber4 = new Subscriber("+375291501275", "17/03/2018",
                clientManager.getByIndex(1), tariffManager.getByIndex(4));
        subscriberManager.addSubscriber(subscriber4);

        Subscriber subscriber5 = new Subscriber("+375291501278", "21/03/2018",
                clientManager.getByIndex(2), tariffManager.getByIndex(3));
        subscriberManager.addSubscriber(subscriber5);

        Subscriber subscriber6 = new Subscriber("+375291501285", "22/03/2018",
                clientManager.getByIndex(3), tariffManager.getByIndex(2));
        subscriberManager.addSubscriber(subscriber6);

        Subscriber subscriber7 = new Subscriber("+375291501286", "22/03/2018",
                clientManager.getByIndex(4), tariffManager.getByIndex(3));
        subscriberManager.addSubscriber(subscriber7);

        Subscriber subscriber8 = new Subscriber("+375291501287", "23/03/2018",
                clientManager.getByIndex(5), tariffManager.getByIndex(2));
        subscriberManager.addSubscriber(subscriber8);

        //company tariffs
        View.print("COMPANY TARIFFS:\n" + tariffManager.showAllTariff());

        //company tariffs sorted by subscription fee
        TariffSorter tariffSorter = new TariffSorter();
        tariffSorter.sortBySubscriptionFee();
        View.print("SORTED COMPANY TARIFFS:\n" + tariffManager.showAllTariff());

        //personal tariffs of the company in a given range of subscription fees
        TariffSearcher tariffSearcher = new TariffSearcher();
        double min = 5, max = 11.5;
        Tariff[] resultTariff = tariffSearcher.searchPersonalTariffBySubscriptionFeeDiapason(min, max);
        View.print("PERSONAL TARIFFS WITH SUBSCRIPTION FEE $" + min + " - $" + max + ":");
        for (int i = 0; i < resultTariff.length; i++) {
            View.print(resultTariff[i].toString());
        }

        //company clients
        View.print("\n" + clientManager.getAllClient().length + " CLIENTS OF THE COMPANY :\n" +
                clientManager.showAllClient());

        //subscribers info
        View.print(subscriberManager.getAllSubscriber().length + " SUBSCRIBERS OF THE COMPANY :\n" +
                subscriberManager.showAllSubscriber());

    }
}
