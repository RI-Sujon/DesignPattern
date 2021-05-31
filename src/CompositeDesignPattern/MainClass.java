package CompositeDesignPattern;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Option root = new Option() ;

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.setMinHeight(1000);
        primaryStage.setMinWidth(1500);
        primaryStage.setAlwaysOnTop(true);
    }

    public static void main(String[] args) {

        launch(args);
    }
}
