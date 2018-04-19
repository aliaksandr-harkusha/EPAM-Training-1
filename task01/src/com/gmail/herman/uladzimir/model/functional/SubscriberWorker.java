package com.gmail.herman.uladzimir.model.functional;

import com.gmail.herman.uladzimir.model.entity.Subscriber;

import java.util.ArrayList;

public class SubscriberWorker {

    private static SubscriberWorker unique;
    private ArrayList<Subscriber> subscribers;

    private SubscriberWorker() {
        subscribers = new ArrayList<>();
    }

    public static SubscriberWorker getInstance() {
        if (null == unique) {
            unique = new SubscriberWorker();
        }
        return unique;
    }

    public Subscriber[] getAllSubscriber() {
        Subscriber[] subscriberArray = new Subscriber[subscribers.size()];

        for (int i = 0; i < subscriberArray.length; i++) {
            subscriberArray[i] = subscribers.get(i);
        }

        return subscriberArray;
    }

    public int countSubscriber() {
        return subscribers.size();
    }

    public boolean isEmpty() {
        return subscribers.isEmpty();
    }

    public Subscriber getByIndex(int index) {
        return subscribers.get(index);
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void addSubscriber(Subscriber... subscriber) {
        for (int i = 0; i < subscriber.length; i++) {
            subscribers.add(subscriber[i]);
        }
    }

    public void removeByIndex(int index) {
        subscribers.remove(index);
    }

    public void clear() {
        subscribers.clear();
    }

}