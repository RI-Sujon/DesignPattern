package CompositeDesignPattern;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Option extends AnchorPane {

    AnchorPane pane = new AnchorPane() ;
    AnchorPane pane2 = new AnchorPane() ;
    Button [] optionButton = new Button[5];
    Button allClear = new Button("CLEAR");
    Button [] submit = new Button[5] ;
    Rectangle rectangle1,rectangle2 ;

    public Option(){
        rectangle1 = new Rectangle() ;
        rectangle1.setHeight(500);
        rectangle1.setWidth(1400);
        pane.setTranslateX(50);
        pane.setTranslateY(50);
        rectangle1.setFill(Color.WHITE);

        pane.setMaxHeight(500);
        pane.setMaxWidth(1400);

        rectangle2 = new Rectangle() ;
        rectangle2.setHeight(1000);
        rectangle2.setWidth(1500);
        rectangle2.setX(0);
        rectangle2.setY(0);
        rectangle2.setFill(Color.BLACK);
        pane2.getChildren().addAll(rectangle2);
        pane.getChildren().addAll(rectangle1);
        pane2.getChildren().addAll(allClear);

        allClear.setTranslateX(1400);
        allClear.setTranslateY(20);

        allClear.setOnMouseClicked(event -> {
            pane.getChildren().clear();
            pane.getChildren().add(rectangle1);
        });
        optionButton[0]  = new Button("Line") ;
        optionButton[1]  = new Button("Circle") ;
        optionButton[2]  = new Button("Rectangle") ;
        optionButton[3]  = new Button("Triangle") ;
        optionButton[4]  = new Button("Flag") ;
        double x = 100 , y =600 ;

        for(int i=0 ; i <5 ; i++){
            optionButton[i].setMinSize(100,20);
            optionButton[i].setTranslateX(x);
            optionButton[i].setTranslateY(y);

            submit[i] = new Button("Submit") ;

            pane2.getChildren().addAll(optionButton[i]);
            x = x + 300 ;
        }

        optionButton[0].setOnMouseClicked(event -> drawLine());
        optionButton[1].setOnMouseClicked(event -> drawCircle());
        optionButton[2].setOnMouseClicked(event -> drawRectangle());
        optionButton[3].setOnMouseClicked(event -> drawTriangle());
        optionButton[4].setOnMouseClicked(event -> drawFlag());


        pane2.minHeight(850) ;
        pane2.minWidth(1450) ;

        getChildren().add(pane2) ;
        pane2.getChildren().add(pane) ;
    }

    public void drawLine(){
        TextField [] lineTextField = new TextField[4] ;
        Label [] lineLabel = new Label[4] ;
        double x = 100 , y =650 ;

        for(int i =0 ; i< 4 ; i++){
            lineTextField[i] = new TextField() ;
            lineLabel[i] = new Label() ;
        }

        lineLabel[0].setText("StartX");
        lineLabel[1].setText("StartY");
        lineLabel[2].setText("EndX");
        lineLabel[3].setText("EndY");

        for(int i=0 ; i <4 ; i++){
            lineLabel[i].setMinSize(70,20);
            lineLabel[i].setTranslateX(x-30);
            lineLabel[i].setTranslateY(y);

            lineTextField[i].setMaxSize(50,20);
            lineTextField[i].setTranslateX(x+25);
            lineTextField[i].setTranslateY(y);

            pane2.getChildren().addAll(lineLabel[i],lineTextField[i]);
            y = y + 50 ;
        }

        submit[0].setTranslateX(x);
        submit[0].setTranslateY(y);
        pane2.getChildren().add(submit[0]) ;

        submit[0].setOnMouseClicked(event -> {

            double startX = Double.valueOf((lineTextField[0].getText()));
            double startY = Double.valueOf((lineTextField[1].getText())) ;
            double endX = Double.valueOf((lineTextField[2].getText()));
            double endY = Double.valueOf((lineTextField[3].getText()));

            MyLine line = new MyLine(startX,startY,endX,endY,pane) ;
            line.draw();
        });
    }

    public void drawCircle(){

        TextField [] circleTextField = new TextField[3] ;
        Label [] circleLabel = new Label[3] ;
        double x = 400 , y =650 ;

        for(int i =0 ; i< 3 ; i++){
            circleTextField[i] = new TextField() ;
            circleLabel[i] = new Label() ;
        }

        circleLabel[0].setText("CenterX");
        circleLabel[1].setText("CenterY");
        circleLabel[2].setText("Radius");

        for(int i=0 ; i <3 ; i++){
            circleLabel[i].setMinSize(70,20);
            circleLabel[i].setTranslateX(x-30);
            circleLabel[i].setTranslateY(y);

            circleTextField[i].setMaxSize(50,20);
            circleTextField[i].setTranslateX(x+25);
            circleTextField[i].setTranslateY(y);

            pane2.getChildren().addAll(circleLabel[i],circleTextField[i]);
            y = y + 50 ;
        }

        submit[1].setTranslateX(x);
        submit[1].setTranslateY(y);
        pane2.getChildren().add(submit[1]) ;

        submit[1].setOnMouseClicked(event -> {

            double centerX = Double.valueOf((circleTextField[0].getText()));
            double centerY = Double.valueOf((circleTextField[1].getText())) ;
            double radius = Double.valueOf((circleTextField[2].getText()));


            //MyCircle circle = new MyCircle(centerX,centerY,radius,pane) ;
            IShape circle = new MyCircle(centerX,centerY,radius,pane) ;
            circle.draw();
        });

    }

    public void drawRectangle(){
        TextField [] rectangleTextField = new TextField[4] ;
        Label [] rectangleLabel = new Label[4] ;
        double x = 700 , y =650 ;

        for(int i =0 ; i< 4 ; i++){
            rectangleTextField[i] = new TextField() ;
            rectangleLabel[i] = new Label() ;
        }

        rectangleLabel[0].setText("StartX");
        rectangleLabel[1].setText("StartY");
        rectangleLabel[2].setText("Height");
        rectangleLabel[3].setText("Width");

        for(int i=0 ; i <4 ; i++){
            rectangleLabel[i].setMinSize(70,20);
            rectangleLabel[i].setTranslateX(x-30);
            rectangleLabel[i].setTranslateY(y);

            rectangleTextField[i].setMaxSize(50,20);
            rectangleTextField[i].setTranslateX(x+25);
            rectangleTextField[i].setTranslateY(y);

            pane2.getChildren().addAll(rectangleLabel[i],rectangleTextField[i]);
            y = y + 50 ;
        }

        submit[2].setTranslateX(x);
        submit[2].setTranslateY(y);
        pane2.getChildren().add(submit[2]) ;

        submit[2].setOnMouseClicked(event -> {

            double startX = Double.valueOf((rectangleTextField[0].getText()));
            double startY = Double.valueOf((rectangleTextField[1].getText())) ;
            double height = Double.valueOf((rectangleTextField[2].getText()));
            double width = Double.valueOf((rectangleTextField[3].getText()));

            //MyRectangle rectangle = new MyRectangle(startX,startY,height,width,pane) ;
            IShape rectangle = new MyRectangle(startX,startY,height,width,pane) ;
            rectangle.draw();
        });


    }

    public void drawTriangle(){
        TextField [] triangleTextField = new TextField[6] ;
        Label [] triangleLabel = new Label[6] ;
        double x = 1000 , y =650 ;

        for(int i =0 ; i< 6 ; i++){
            triangleTextField[i] = new TextField() ;
            triangleLabel[i] = new Label() ;
        }

        triangleLabel[0].setText("X1");
        triangleLabel[1].setText("Y1");
        triangleLabel[2].setText("X2");
        triangleLabel[3].setText("Y2");
        triangleLabel[4].setText("X3");
        triangleLabel[5].setText("Y3");

        for(int i=0 ; i <6 ; i++){
            triangleLabel[i].setMinSize(70,20);
            triangleLabel[i].setTranslateX(x-30);
            triangleLabel[i].setTranslateY(y);

            triangleTextField[i].setMaxSize(50,20);
            triangleTextField[i].setTranslateX(x+25);
            triangleTextField[i].setTranslateY(y);

            pane2.getChildren().addAll(triangleLabel[i],triangleTextField[i]);
            y = y + 40 ;
        }

        submit[3].setTranslateX(x);
        submit[3].setTranslateY(y);
        pane2.getChildren().add(submit[3]) ;

        submit[3].setOnMouseClicked(event -> {

            double X1 = Double.valueOf((triangleTextField[0].getText()));
            double Y1 = Double.valueOf((triangleTextField[1].getText())) ;
            double X2 = Double.valueOf((triangleTextField[2].getText()));
            double Y2 = Double.valueOf((triangleTextField[3].getText()));
            double X3 = Double.valueOf((triangleTextField[4].getText()));
            double Y3 = Double.valueOf((triangleTextField[5].getText()));

            //MyTriangle triangle = new MyTriangle(X1,Y1,X2,Y2,X3,Y3,pane) ;
            IShape triangle = new MyTriangle(X1,Y1,X2,Y2,X3,Y3,pane) ;
            triangle.draw();
        });



    }

    public void drawFlag(){
        System.out.println("Hoy na ken");
        TextField [] flagTextField = new TextField[3] ;
        Label [] flagLabel = new Label[3] ;
        double x = 1300 , y =650 ;

        for(int i =0 ; i< 3 ; i++){
            flagTextField[i] = new TextField() ;
            flagLabel[i] = new Label() ;
        }
        System.out.println("Hoy na ken2");
        flagLabel[0].setText("StartX");
        flagLabel[1].setText("StartY");
        flagLabel[2].setText("Length");

        for(int i=0 ; i <3 ; i++){
            flagLabel[i].setMinSize(70,20);
            flagLabel[i].setTranslateX(x-30);
            flagLabel[i].setTranslateY(y);

            flagTextField[i].setMaxSize(50,20);
            flagTextField[i].setTranslateX(x+25);
            flagTextField[i].setTranslateY(y);

            pane2.getChildren().addAll(flagTextField[i],flagLabel[i]);
            y = y + 50 ;
        }

        System.out.println("Hoy na ken3");
        submit[4].setTranslateX(x);
        submit[4].setTranslateY(y);
        pane2.getChildren().add(submit[4]) ;

        submit[4].setOnMouseClicked(event -> {

            double startX = Double.valueOf((flagTextField[0].getText()));
            double startY = Double.valueOf((flagTextField[1].getText())) ;
            double length = Double.valueOf((flagTextField[2].getText()));

            //Flag flag = new Flag(startX,startY,length,pane) ;
            IShape flag = new Flag(startX,startY,length,pane) ;
            flag.draw();
        });

        System.out.println("Hoy na ken4");
    }
}
