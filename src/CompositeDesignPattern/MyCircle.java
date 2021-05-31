
package CompositeDesignPattern;


import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class MyCircle implements IShape{

    double centerX ;
    double centerY ;
    double radius ;
    AnchorPane pane ;

    public MyCircle(double centerX, double centerY, double radius, AnchorPane pane) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.pane = pane;
    }

    @Override
    public void draw() {
        System.out.println("Circle");
        Circle circle = new Circle() ;

        circle.setCenterX(centerX);
        circle.setCenterY(centerY);
        circle.setRadius(radius);
        circle.setStroke(Color.RED);
        circle.setFill(Color.WHITE);

        pane.getChildren().addAll(circle) ;
    }
}
