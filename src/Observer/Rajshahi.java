
package Observer;


public class Rajshahi extends IObserver{

    @Override
    public void getNotification(Controller controller) {
        controller.setLabelRR();
        //System.out.println("Account Notification");
    }
    
}
