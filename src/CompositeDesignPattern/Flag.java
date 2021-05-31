package CompositeDesignPattern;

import javafx.scene.layout.AnchorPane;

public class Flag extends Composite{

    double startX ;
    double startY ;
    double length ;

    AnchorPane pane ;

    public Flag(double startX, double startY, double length, AnchorPane pane) {
        this.startX = startX;
        this.startY = startY;
        this.length = length;
        this.pane = pane;
    }

    @Override
    public void build(){

        double width = length*6/10 ;


        iShape.add(new MyRectangle(startX,startY,width,length,pane));
        iShape.add(new MyCircle(startX+length*9/20,startY+width/2 ,length/5,pane));
    }
}
