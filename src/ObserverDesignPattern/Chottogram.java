/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverDesignPattern;

/**
 *
 * @author Asus
 */
public class Chottogram implements IObserver {
    Subject subject ;

    public Chottogram(Subject subject){
        this.subject = subject ;
    }

    @Override
    public void getNotification(Controller controller, String bidder) {
        controller.setLabelCC(bidder);
    }

    @Override
    public void notifyOthers(Controller controller){
        subject.bid(controller, "Chottogram bidding");
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
