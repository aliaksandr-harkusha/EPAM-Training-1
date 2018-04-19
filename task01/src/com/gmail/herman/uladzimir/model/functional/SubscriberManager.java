package com.gmail.herman.uladzimir.model.functional;

import com.gmail.herman.uladzimir.model.entity.Subscriber;

public class SubscriberManager {

    public Subscriber[] getAllSubscriber() {
        return SubscriberWorker.getInstance().getAllSubscriber();
    }

    public String showAllSubscriber() {
        String result = "";
        Subscriber subscribers[] = SubscriberWorker.getInstance().getAllSubscriber();

        for (int i = 0; i < subscribers.length; i++) {
            result += subscribers[i].toString() + "\n";
        }

        return result;
    }

    public void addSubscriber(Subscriber subscriber) {
        SubscriberWorker.getInstance().addSubscriber(subscriber);
    }

    public Subscriber getByIndex(int index) {
        return SubscriberWorker.getInstance().getByIndex(index);
    }

    public Subscriber cloneSubscriber(Subscriber subscriber) {
        return new Subscriber(subscriber);
    }

    public void removeByIndex(int index) {
        SubscriberWorker.getInstance().removeByIndex(index);
    }

    public void clear() {
        SubscriberWorker.getInstance().clear();
    }

}