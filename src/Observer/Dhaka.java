
package Observer;


public class Dhaka implements IObserver {
    public void getNotification(Controller controller) {

        controller.setLabelDP();
        //System.out.println("SMS notification");
    }
}
