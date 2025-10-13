package observer;

public class NewsSubscriber implements Subscriber {
    @Override
    public void update(String message) {
        System.out.println("News is available: " + message);
    }
}
