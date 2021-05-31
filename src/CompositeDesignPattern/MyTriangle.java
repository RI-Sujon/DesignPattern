
package CompositeDesignPattern;


import javafx.scene.layout.AnchorPane;

public class MyTriangle extends Composite{

    double X1,Y1,X2,Y2,X3,Y3 ;
    AnchorPane pane ;

    public MyTriangle(double x1, double y1, double x2, double y2, double x3, double y3,AnchorPane pane) {
        X1 = x1;
        Y1 = y1;
        X2 = x2;
        Y2 = y2;
        X3 = x3;
        Y3 = y3;
        this.pane = pane ;
    }

    @Override
    public void build() {
        iShape.add(new MyLine(X1,Y1,X2,Y2,pane));
        iShape.add(new MyLine(X2,Y2,X3,Y3,pane));
        iShape.add(new MyLine(X3,Y3,X1,Y1,pane));
    }
    
    
}
