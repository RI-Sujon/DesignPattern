
package ObserverDesignPattern;


public class Dhaka implements IObserver {
    Subject subject ;

    public Dhaka(Subject subject){
        this.subject = subject ;
    }

    @Override
    public void getNotification(Controller controller, String bidder) {
        controller.setLabelDP(bidder);
    }

    @Override
    public void notifyOthers(Controller controller){
        subject.bid(controller, "Dhaka bidding");
    }

    @Override
    public void subscribeForBidding() {
        subject.subscribe(this);
    }

    @Override
    public void unSubscribeForBidding() {
        subject.unSubscribe(this);
    }
}
