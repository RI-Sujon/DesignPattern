
package CompositeDesignPattern;


import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;


public class MyLine implements IShape{
    double startX ;
    double startY ;
    double endX ;
    double endY ;
    AnchorPane pane ;

    public MyLine(double startX, double startY, double endX, double endY, AnchorPane pane) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.pane = pane ;
    }

    @Override
    public void draw() {
        Line line = new Line() ;
        line.setStartX(startX);
        line.setStartY(startY);
        line.setEndX(endX);
        line.setEndY(endY);
        line.setStroke(Color.RED);

        line.setStrokeWidth(2);
        pane.getChildren().addAll(line) ;
    }
}
