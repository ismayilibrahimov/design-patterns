package observer;

public class SecondSubscriber implements Subscriber {
    @Override
    public void update(String message) {
        System.out.println("Second TV breaking news: " + message);
    }
}
