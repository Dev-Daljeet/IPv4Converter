package com.mycompany.convertipv4todecimal;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class LayoutPane {
    private StackPane paneForHeader = new StackPane();
    private BorderPane paneForIpToDecimal = new BorderPane();
    private BorderPane paneForDecimalToIp = new BorderPane();
    private BorderPane paneForLayout = new BorderPane();

    public BorderPane getPaneForLayout() {
        // Make a text object which acts as a heading.
        Text heading = new Text();
        heading.setText("Ipv4 Converter");
        heading.setFill(Color.WHITE);
        heading.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR,25));

        // Make a rectangle object which acts as background for heading.
        Rectangle backgroundForHeading = new Rectangle();
        backgroundForHeading.setWidth(430);
        backgroundForHeading.setHeight(60);
        backgroundForHeading.setArcWidth(10);
        backgroundForHeading.setArcHeight(10);
        backgroundForHeading.setFill(Color.GREEN);

        paneForHeader.getChildren().addAll(backgroundForHeading,heading);
        paneForHeader.setPadding(new Insets(10,0,0,0));

        Text headingOfIpToDecimal = new Text();
        headingOfIpToDecimal.setText("IP to Decimal");
        headingOfIpToDecimal.setFill(Color.WHITE);
        headingOfIpToDecimal.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR,16));

        Rectangle backgroundForHeadingOfIpToDecimal = new Rectangle();
        backgroundForHeadingOfIpToDecimal.setWidth(430);
        backgroundForHeadingOfIpToDecimal.setHeight(30);
        backgroundForHeadingOfIpToDecimal.setFill(Color.GREEN);

        StackPane paneForHeadingIpToDecimal = new StackPane();
        paneForHeadingIpToDecimal.getChildren().addAll(backgroundForHeadingOfIpToDecimal,headingOfIpToDecimal);
        paneForHeadingIpToDecimal.setPadding(new Insets(10,0,0,0));

        Label lbForIpAddress = new Label();
        lbForIpAddress.setText("IP address:");
        lbForIpAddress.setFont(Font.font("Helvetica",15));

        TextField txtFldForIpAddress = new TextField();
        txtFldForIpAddress.setPrefWidth(335);

        Button btnForConvertIpToDecimal = new Button();
        btnForConvertIpToDecimal.setText("Convert");
        btnForConvertIpToDecimal.setFont(Font.font("Helvetica"));
        btnForConvertIpToDecimal.setTextFill(Color.GREEN);

        GridPane paneForLbTxtFldAndBtnIP = new GridPane();
        paneForLbTxtFldAndBtnIP.add(lbForIpAddress,0,0);
        paneForLbTxtFldAndBtnIP.add(txtFldForIpAddress,1,0);
        paneForLbTxtFldAndBtnIP.add(btnForConvertIpToDecimal,0,1);
        paneForLbTxtFldAndBtnIP.setHgap(10);
        paneForLbTxtFldAndBtnIP.setVgap(12);
        paneForLbTxtFldAndBtnIP.setPadding(new Insets(15,0,0,20));

        TextArea resultOfIpToDecimal = new TextArea();
        resultOfIpToDecimal.setEditable(false);
        resultOfIpToDecimal.setPrefHeight(70);
        resultOfIpToDecimal.setPadding(new Insets(6));
        resultOfIpToDecimal.setText("Result:");

        paneForIpToDecimal.setTop(paneForHeadingIpToDecimal);
        paneForIpToDecimal.setCenter(paneForLbTxtFldAndBtnIP);
        paneForIpToDecimal.setBottom(resultOfIpToDecimal);

        Text headingOfDecimalToIp = new Text();
        headingOfDecimalToIp.setText(" Decimal to IP");
        headingOfDecimalToIp.setFill(Color.WHITE);
        headingOfDecimalToIp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR,16));

        Rectangle backgroundForHeadingOfDecimalToIp = new Rectangle();
        backgroundForHeadingOfDecimalToIp.setWidth(430);
        backgroundForHeadingOfDecimalToIp.setHeight(30);
        backgroundForHeadingOfDecimalToIp.setFill(Color.GREEN);

        StackPane paneForHeadingOfDecimalToIp = new StackPane();
        paneForHeadingOfDecimalToIp.getChildren().addAll(backgroundForHeadingOfDecimalToIp,headingOfDecimalToIp);
        paneForHeadingOfDecimalToIp.setPadding(new Insets(10,0,0,0));

        Label lbForIpDecimal = new Label();
        lbForIpDecimal.setText("IP Decimal:");
        lbForIpDecimal.setFont(Font.font("Helvetica",15));

        TextField txtFldForIpDecimal = new TextField();
        txtFldForIpDecimal.setPrefWidth(335);

        Button btnForConvertDecimalToIp = new Button();
        btnForConvertDecimalToIp.setText("Convert");
        btnForConvertDecimalToIp.setFont(Font.font("Helvetica"));
        btnForConvertDecimalToIp.setTextFill(Color.WHITE);
        btnForConvertDecimalToIp.setTextFill(Color.GREEN);

        GridPane paneForLbTxtFldAndBtnDec = new GridPane();
        paneForLbTxtFldAndBtnDec.add(lbForIpDecimal,0,0);
        paneForLbTxtFldAndBtnDec.add(txtFldForIpDecimal,1,0);
        paneForLbTxtFldAndBtnDec.add(btnForConvertDecimalToIp,0,1);
        paneForLbTxtFldAndBtnDec.setHgap(10);
        paneForLbTxtFldAndBtnDec.setVgap(12);
        paneForLbTxtFldAndBtnDec.setPadding(new Insets(15,0,25,20));

        TextArea resultOfDecimalToIp = new TextArea();
        resultOfDecimalToIp.setEditable(false);
        resultOfDecimalToIp.setPrefHeight(70);
        resultOfDecimalToIp.setPadding(new Insets(6));
        resultOfDecimalToIp.setText("Result:");

        paneForDecimalToIp.setTop(paneForHeadingOfDecimalToIp);
        paneForDecimalToIp.setCenter(paneForLbTxtFldAndBtnDec);
        paneForDecimalToIp.setBottom(resultOfDecimalToIp);

        paneForLayout.setTop(paneForHeader);
        paneForLayout.setCenter(paneForIpToDecimal);
        paneForLayout.setBottom(paneForDecimalToIp);

        btnForConvertIpToDecimal.setOnAction(e -> {
            String ipAddress = txtFldForIpAddress.getText();

        });
        return paneForLayout;
    }
}
