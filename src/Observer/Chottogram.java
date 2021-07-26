/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Asus
 */
public class Chottogram implements IObserver {

    @Override
    public void getNotification(Controller controller) {
        controller.setLabelCC();
    }
    
}
