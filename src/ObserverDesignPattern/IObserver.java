package ObserverDesignPattern;

public interface IObserver {
    public void getNotification(Controller controller, String bidder) ;

    public void notifyOthers(Controller controller) ;

    public void subscribeForBidding() ;

    public void unSubscribeForBidding() ;
}
