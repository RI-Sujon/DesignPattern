
package ObserverDesignPattern;


public class Rajshahi implements IObserver {
    Subject subject ;

    public Rajshahi(Subject subject){
        this.subject = subject ;
    }

    @Override
    public void getNotification(Controller controller, String bidder) {
        controller.setLabelRR(bidder);
    }

    @Override
    public void notifyOthers(Controller controller){
        subject.bid(controller, "Rajshahi bidding");
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
