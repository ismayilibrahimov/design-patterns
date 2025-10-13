package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {
    private List<Subscriber> subscribers;
    private String data;

    public void subscribe(Subscriber subscriber) {
        if (subscribers == null) subscribers = new ArrayList<>();
        subscribers.add(subscriber);
        System.out.println( "Subscribed to news");
    }

    public void unSubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println( "Unsubscribed from news");
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(data);
        }
        System.out.println( "Subscribers notified");
    }

    public void setData(String data) {
        this.data = data;
    }
}
