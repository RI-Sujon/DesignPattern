package Observer;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label labelDP , labelCC , labelRR, biddingAmountLabel ;

    @FXML
    private Button bid, isBiddingButtonDP, isBiddingButtonCC , isBiddingButtonRR ;

    private boolean dp=false,cc=false,rr=false ;

    private int amount = 0 ;

    Subject subject = new Subject();
    IObserver DP = new Dhaka() ;
    IObserver CC = new Chottogram() ;
    IObserver RR = new Rajshahi() ;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void bidding(MouseEvent event){
        if(dp==false && rr==false && cc==false) return;

        amount = amount + 200 ;
        biddingAmountLabel.setText(String.valueOf(amount) + "$...");
        subject.bid(this);
    }

    public void subscribeDP(MouseEvent event){
        if(!dp){
            subject.subscribe(DP);
            dp = true ;
            labelDP.setText("IN BIDDING");
            labelDP.setFont(new Font("Times New Roman Bold Italic",20));
            labelDP.setStyle("-fx-background-color: lime");
            labelDP.setAlignment(Pos.CENTER);
            isBiddingButtonDP.setText("STOP BIDDING");
            isBiddingButtonDP.setStyle("-fx-background-color: RED");
        }
        else{
            subject.unSubscribe(DP);
            dp = false ;
            labelDP.setText("NOT IN BIDDING");
            labelDP.setFont(new Font("Times New Roman Bold Italic",20));
            labelDP.setStyle("-fx-background-color: gray");
            labelDP.setAlignment(Pos.CENTER);
            isBiddingButtonDP.setText("START BIDDING");
            isBiddingButtonDP.setStyle("-fx-background-color: green");
        }
    }

    public void subscribeCC(MouseEvent event){
        if(!cc){
            subject.subscribe(CC);
            cc = true ;
            labelCC.setText("IN BIDDING");
            labelCC.setFont(new Font("Times New Roman Bold Italic",20));
            labelCC.setStyle("-fx-background-color: lime");
            labelCC.setAlignment(Pos.CENTER);
            isBiddingButtonCC.setText("STOP BIDDING");
            isBiddingButtonCC.setStyle("-fx-background-color: RED");
        }
        else{
            subject.unSubscribe(CC);
            cc = false ;
            labelCC.setText("NOT IN BIDDING");
            labelCC.setFont(new Font("Times New Roman Bold Italic",20));
            labelCC.setStyle("-fx-background-color: gray");
            labelCC.setAlignment(Pos.CENTER);
            isBiddingButtonCC.setText("START BIDDING");
            isBiddingButtonCC.setStyle("-fx-background-color: green");
        }

    }

    public void subscribeRR(MouseEvent event){
        if(!rr){
            subject.subscribe(RR);
            rr = true ;
            labelRR.setText("IN BIDDING");
            labelRR.setFont(new Font("Times New Roman Bold Italic",20));
            labelRR.setStyle("-fx-background-color: lime");
            labelRR.setAlignment(Pos.CENTER);
            isBiddingButtonRR.setText("STOP BIDDING");
            isBiddingButtonRR.setStyle("-fx-background-color: RED");
        }
        else{
            subject.unSubscribe(RR);
            rr = false ;
            labelRR.setText("NOT IN BIDDING");
            labelRR.setFont(new Font("Times New Roman Bold Italic",20));
            labelRR.setStyle("-fx-background-color: gray");
            labelRR.setAlignment(Pos.CENTER);
            isBiddingButtonRR.setText("START BIDDING");
            isBiddingButtonRR.setStyle("-fx-background-color: green");
        }
    }

    public void setLabelDP() { labelDP.setText(String.valueOf(amount)); }

    public void setLabelCC() {
        labelCC.setText(String.valueOf(amount));
    }

    public void setLabelRR() {
        labelRR.setText(String.valueOf(amount));
    }
}
