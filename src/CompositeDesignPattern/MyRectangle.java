package CompositeDesignPattern;


import javafx.scene.layout.AnchorPane;

public class MyRectangle extends Composite{

    double startX ;
    double startY ;
    double height ;
    double width ;
    AnchorPane pane ;

    public MyRectangle(double startX, double startY, double height, double width, AnchorPane pane) {
        this.startX = startX;
        this.startY = startY;
        this.height = height;
        this.width = width;
        this.pane = pane;
    }

    @Override
    public void build() {

        double lineStartX, lineStartY, lineEndX, lineEndY ;

        lineStartX = startX ;
        lineStartY = startY ;
        lineEndX = startX + width ;
        lineEndY = startY ;
        iShape.add(new MyLine(lineStartX,lineStartY,lineEndX,lineEndY,pane));

        lineStartX = startX ;
        lineStartY = startY ;
        lineEndX = startX  ;
        lineEndY = startY + height;
        iShape.add(new MyLine(lineStartX,lineStartY,lineEndX,lineEndY,pane));

        lineStartX = startX + width ;
        lineStartY = startY ;
        lineEndX = startX + width ;
        lineEndY = startY + height ;
        iShape.add(new MyLine(lineStartX,lineStartY,lineEndX,lineEndY,pane));

        lineStartX = startX ;
        lineStartY = startY+height ;
        lineEndX = startX + width ;
        lineEndY = startY + height ;
        iShape.add(new MyLine(lineStartX,lineStartY,lineEndX,lineEndY,pane));
    }
}
