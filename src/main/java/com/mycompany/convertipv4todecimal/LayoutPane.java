package com.mycompany.convertipv4todecimal;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
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
    private BorderPane paneForInnerContent = new BorderPane();
    private StackPane paneForFooter = new StackPane();
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
        paneForHeader.setPadding(new Insets(15,0,0,0));

        Text headingIpToDecimal = new Text();
        headingIpToDecimal.setText("IP to Decimal");
        headingIpToDecimal.setFill(Color.WHITE);
        headingIpToDecimal.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR,18));

        Rectangle backgroundForHeadingIpToDecimal = new Rectangle();
        backgroundForHeadingIpToDecimal.setWidth(430);
        backgroundForHeadingIpToDecimal.setHeight(30);
        backgroundForHeadingIpToDecimal.setFill(Color.GREEN);

        StackPane paneForHeadingIpToDecimal = new StackPane();
        paneForHeadingIpToDecimal.getChildren().addAll(backgroundForHeadingIpToDecimal,headingIpToDecimal);

        Label lbForIpAddress = new Label();
        lbForIpAddress.setText("IP address:");
        lbForIpAddress.setFont(Font.font("Helvetica",15));

        TextField txtFldForIpAddress = new TextField();

        HBox paneForLbAndTxtFld = new HBox();
        paneForLbAndTxtFld.getChildren().addAll(lbForIpAddress,txtFldForIpAddress);
        paneForLbAndTxtFld.setSpacing(5);

        Button btnForConvertIpToDecimal = new Button();
        btnForConvertIpToDecimal.setText("Convert");
        btnForConvertIpToDecimal.setFont(Font.font("Helvetica"));
        btnForConvertIpToDecimal.setTextFill(Color.WHITE);
        btnForConvertIpToDecimal.setTextFill(Color.GREEN);

        BorderPane paneForIpToDecimal = new BorderPane();
        paneForIpToDecimal.setTop(paneForHeadingIpToDecimal);
        paneForIpToDecimal.setCenter(paneForLbAndTxtFld);
        paneForIpToDecimal.setBottom(btnForConvertIpToDecimal);

        Text headingOfDecimalToIp = new Text();
        headingOfDecimalToIp.setText(" Decimal to IP");
        headingOfDecimalToIp.setFill(Color.WHITE);
        headingOfDecimalToIp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR,18));

        Rectangle backgroundForHeadingOfDecimalToIp = new Rectangle();
        backgroundForHeadingOfDecimalToIp.setWidth(430);
        backgroundForHeadingOfDecimalToIp.setHeight(30);
        backgroundForHeadingOfDecimalToIp.setFill(Color.GREEN);

        StackPane paneForHeadingOfDecimalToIp = new StackPane();
        paneForHeadingOfDecimalToIp.getChildren().addAll(backgroundForHeadingOfDecimalToIp,headingOfDecimalToIp);

        Label lbForIpDecimal = new Label();
        lbForIpDecimal.setText("IP Number/ IP Decimal:");
        lbForIpDecimal.setFont(Font.font("Helvetica",15));

        TextField txtFldForIpDecimal = new TextField();

        HBox paneForLbAndTxtFldDecimal = new HBox();
        paneForLbAndTxtFldDecimal.getChildren().addAll(lbForIpDecimal,txtFldForIpDecimal);
        paneForLbAndTxtFldDecimal.setSpacing(5);

        Button btnForConvertDecimalToIp = new Button();
        btnForConvertDecimalToIp.setText("Convert");
        btnForConvertDecimalToIp.setFont(Font.font("Helvetica"));
        btnForConvertDecimalToIp.setTextFill(Color.WHITE);
        btnForConvertDecimalToIp.setTextFill(Color.GREEN);

        BorderPane paneForDecimalToIp = new BorderPane();
        paneForDecimalToIp.setTop(paneForHeadingOfDecimalToIp);
        paneForDecimalToIp.setCenter(paneForLbAndTxtFldDecimal);
        paneForDecimalToIp.setBottom(btnForConvertDecimalToIp);

        paneForInnerContent.setTop(paneForIpToDecimal);
        paneForInnerContent.setCenter(paneForDecimalToIp);

        TextArea result = new TextArea();
        result.setEditable(false);
        result.setPrefHeight(70);
        result.setPadding(new Insets(6));
        result.setText("Result:");

        paneForFooter.getChildren().add(result);

        paneForLayout.setTop(paneForHeader);
        paneForLayout.setCenter(paneForInnerContent);
        paneForLayout.setBottom(paneForFooter);

        return paneForLayout;
    }
}
