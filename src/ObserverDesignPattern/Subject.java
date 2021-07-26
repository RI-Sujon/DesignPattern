
package ObserverDesignPattern;

import java.util.ArrayList;


public class Subject {
    ArrayList<IObserver> list = new ArrayList<>() ;

    public void subscribe(IObserver e){
        list.add(e) ;
    }

    public void unSubscribe(IObserver e){
        list.remove(e) ;
    }

    public void notifyUser(Controller controller, String bidder){
        for(IObserver io:list){
            io.getNotification(controller, bidder);
        }
    }
    
    public void bid(Controller controller, String bidder){
        notifyUser(controller, bidder);
    }
}
