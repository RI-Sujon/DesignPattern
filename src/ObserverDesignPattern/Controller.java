package ObserverDesignPattern;

import ObserverDesignPattern.Chottogram;
import ObserverDesignPattern.Dhaka;
import ObserverDesignPattern.IObserver;
import ObserverDesignPattern.Rajshahi;
import ObserverDesignPattern.Subject;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label labelDP , labelCC , labelRR, biddingAmountLabel ;

    @FXML
    private Button bid, isBiddingButtonDP, isBiddingButtonCC , isBiddingButtonRR, bidDP, bidCC, bidRR ;

    private boolean dp=false,cc=false,rr=false ;

    private int amount = 0 ;

    Subject subject = new Subject();
    IObserver DP = new Dhaka(subject) ;
    IObserver CC = new Chottogram(subject) ;
    IObserver RR = new Rajshahi(subject) ;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void bidding(MouseEvent event){
        //if(dp==false && rr==false && cc==false) return;
        //if(dp==false && rr==false || rr==false && cc==false || dp==false && cc==false) return;

        //amount = amount + 200 ;
        //biddingAmountLabel.setText(String.valueOf(amount) + "$...");
        //subject.bid(this, "");
    }

    public void biddingDP(MouseEvent event){
        if(dp==false && rr==false && cc==false) return;
        //if(dp==false && rr==false || rr==false && cc==false || dp==false && cc==false) return;
        if(dp==false) return;

        amount = amount + 200 ;
        biddingAmountLabel.setText(String.valueOf(amount) + "$...");
        //subject.bid(this, "Dhaka Bidding");
        //Dhaka dhaka = new Dhaka(subject) ;
        DP.notifyOthers(this);
    }

    public void biddingCC(MouseEvent event){
        if(dp==false && rr==false && cc==false) return;
        if(dp==false && rr==false || rr==false && cc==false || dp==false && cc==false) return;
        if(cc==false) return;

        amount = amount + 200 ;
        biddingAmountLabel.setText(String.valueOf(amount) + "$...");
        //subject.bid(this, "Chottogram Bidding");
        //Chottogram chottogram = new Chottogram(subject) ;
        CC.notifyOthers(this);
    }

    public void biddingRR(MouseEvent event){
        if(dp==false && rr==false && cc==false) return;
        if(dp==false && rr==false || rr==false && cc==false || dp==false && cc==false) return;
        if(rr==false) return;

        amount = amount + 200 ;
        biddingAmountLabel.setText(String.valueOf(amount) + "$...");
        //subject.bid(this, "Rajshahi Bidding");
        //Rajshahi rajshahi = new Rajshahi(subject) ;
        RR.notifyOthers(this);
    }

    public void subscribeDP(MouseEvent event){
        if(!dp){
            //subject.subscribe(DP);
            DP.subscribeForBidding();
            dp = true ;
            labelDP.setText("IN BIDDING");
            labelDP.setFont(new Font("Times New Roman Bold Italic",20));
            labelDP.setStyle("-fx-background-color: lime");
            labelDP.setAlignment(Pos.CENTER);
            isBiddingButtonDP.setText("STOP BIDDING");
            isBiddingButtonDP.setStyle("-fx-background-color: RED");
        }
        else{
            //subject.unSubscribe(DP);
            DP.unSubscribeForBidding();
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
            //subject.subscribe(CC);
            CC.subscribeForBidding();
            cc = true ;
            labelCC.setText("IN BIDDING");
            labelCC.setFont(new Font("Times New Roman Bold Italic",20));
            labelCC.setStyle("-fx-background-color: lime");
            labelCC.setAlignment(Pos.CENTER);
            isBiddingButtonCC.setText("STOP BIDDING");
            isBiddingButtonCC.setStyle("-fx-background-color: RED");
        }
        else{
            //subject.unSubscribe(CC);
            CC.unSubscribeForBidding();
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
            //subject.subscribe(RR);
            RR.subscribeForBidding();
            rr = true ;
            labelRR.setText("IN BIDDING");
            labelRR.setFont(new Font("Times New Roman Bold Italic",20));
            labelRR.setStyle("-fx-background-color: lime");
            labelRR.setAlignment(Pos.CENTER);
            isBiddingButtonRR.setText("STOP BIDDING");
            isBiddingButtonRR.setStyle("-fx-background-color: RED");
        }
        else{
            //subject.unSubscribe(RR);
            RR.unSubscribeForBidding();
            rr = false ;
            labelRR.setText("NOT IN BIDDING");
            labelRR.setFont(new Font("Times New Roman Bold Italic",20));
            labelRR.setStyle("-fx-background-color: gray");
            labelRR.setAlignment(Pos.CENTER);
            isBiddingButtonRR.setText("START BIDDING");
            isBiddingButtonRR.setStyle("-fx-background-color: green");
        }
    }

    public void setLabelDP(String bidder) { labelDP.setText( bidder + "\n" + String.valueOf(amount)); }

    public void setLabelCC(String bidder) {
        labelCC.setText(bidder + "\n" + String.valueOf(amount));
    }

    public void setLabelRR(String bidder) {
        labelRR.setText(bidder + "\n" + String.valueOf(amount));
    }
}
