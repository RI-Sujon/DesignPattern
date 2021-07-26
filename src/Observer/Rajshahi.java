
package Observer;


public class Rajshahi implements IObserver{

    @Override
    public void getNotification(Controller controller) {
        controller.setLabelRR();
        //System.out.println("Account Notification");
    }
    
}
