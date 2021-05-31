
package Observer;

import javafx.fxml.FXMLLoader;

import java.util.ArrayList;


public class Subject {
    ArrayList<IObserver> list = new ArrayList<>() ;
    
    public void subscribe(IObserver e){
        list.add(e) ;
    }
    
    public void unSubscribe(IObserver e){
        list.remove(e) ;
    }
    
    public void notifyUser(Controller controller){
        for(IObserver io:list){
            io.getNotification(controller);
        }
    }
    
    public void bid(Controller controller){
        notifyUser(controller);
    }
}
