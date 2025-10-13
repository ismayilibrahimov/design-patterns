package observer;


public class NewsAgency extends Publisher  {
    public void postNews(String news) {
        System.out.println( "Posting news");
        this.setData(news);
        notifySubscribers();
    }
}
