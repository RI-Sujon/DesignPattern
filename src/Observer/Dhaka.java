
package Observer;


public class Dhaka extends IObserver {
    public void getNotification(Controller controller) {

        controller.setLabelDP();
        //System.out.println("SMS notification");
    }
}
