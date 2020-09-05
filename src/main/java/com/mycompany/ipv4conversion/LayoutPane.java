package com.mycompany.ipv4conversion;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/** Represents a layout pane which is part of User Interface.
 * @author Daljeet Singh (Dev-Daljeet)
 * @version 1.0
 */
public class LayoutPane {
    private StackPane paneForHeader = new StackPane();
    private BorderPane paneForIpToDecimal = new BorderPane();
    private BorderPane paneForDecimalToIp = new BorderPane();
    private BorderPane paneForLayout = new BorderPane();

    /** Gets the pane for Layout of User interface.
     * @return A BorderPane representing the pane for layout.
     */
    public BorderPane getPaneForLayout() {
        // Make a Text object which acts as a heading of Application.
        Text heading = new Text();
        heading.setText("IPv4 Converter");
        heading.setFill(Color.WHITE);
        heading.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR,25));

        // Make a Rectangle object which acts as background for heading of Application.
        Rectangle backgroundForHeading = new Rectangle();
        backgroundForHeading.setWidth(430);
        backgroundForHeading.setHeight(60);
        backgroundForHeading.setArcWidth(10);
        backgroundForHeading.setArcHeight(10);
        backgroundForHeading.setFill(Color.GREEN);

        // Add the Text object (heading) and Rectangle object (backgroundForHeading) in StackPane object (paneForHeader).
        paneForHeader.getChildren().addAll(backgroundForHeading,heading);
        paneForHeader.setPadding(new Insets(10,0,0,0));

        // Make a Text object which acts as a heading of IP to Decimal.
        Text headingOfIpToDecimal = new Text();
        headingOfIpToDecimal.setText("IP to Decimal");
        headingOfIpToDecimal.setFill(Color.WHITE);
        headingOfIpToDecimal.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR,16));

        // Make a Rectangle object which acts as background for heading of IP to Decimal.
        Rectangle backgroundForHeadingOfIpToDecimal = new Rectangle();
        backgroundForHeadingOfIpToDecimal.setWidth(430);
        backgroundForHeadingOfIpToDecimal.setHeight(30);
        backgroundForHeadingOfIpToDecimal.setFill(Color.GREEN);

        /* Make a StackPane object (paneForHeadingOfIpToDecimal) and add the Text object (headingOfIpTODecimal) and
           Rectangle object (backgroundForHeadingOfIpToDecimal) in it. */
        StackPane paneForHeadingOfIpToDecimal = new StackPane();
        paneForHeadingOfIpToDecimal.getChildren().addAll(backgroundForHeadingOfIpToDecimal,headingOfIpToDecimal);
        paneForHeadingOfIpToDecimal.setPadding(new Insets(10,0,0,0));

        // Make a Label object which acts as label for IP address.
        Label lbForIpAddress = new Label();
        lbForIpAddress.setText("IP address:");
        lbForIpAddress.setFont(Font.font("Helvetica",15));

        // Make a TextField object which takes IP address as input from users.
        TextField txtFldForIpAddress = new TextField();
        txtFldForIpAddress.setPrefWidth(335);

        // Make a Button object for IP to Decimal conversion.
        Button btnToConvertIpToDecimal = new Button();
        btnToConvertIpToDecimal.setText("Convert");
        btnToConvertIpToDecimal.setFont(Font.font("Helvetica"));
        btnToConvertIpToDecimal.setTextFill(Color.GREEN);

        /* Make a GridPane object (paneForLbTxtFldAndBTnIp) for adding the Label object (lbForIPAddress), TextField (txtFldForIpAddress)
           and Button object (btnToConvertIpToDecimal) in it. */
        GridPane paneForLbTxtFldAndBtnIP = new GridPane();
        paneForLbTxtFldAndBtnIP.add(lbForIpAddress,0,0);
        paneForLbTxtFldAndBtnIP.add(txtFldForIpAddress,1,0);
        paneForLbTxtFldAndBtnIP.add(btnToConvertIpToDecimal,0,1);
        paneForLbTxtFldAndBtnIP.setHgap(10);
        paneForLbTxtFldAndBtnIP.setVgap(12);
        paneForLbTxtFldAndBtnIP.setPadding(new Insets(15,0,0,20));

        // Make a TextArea object which acts as result of IP to Decimal conversion.
        TextArea resultOfIpToDecimal = new TextArea();
        resultOfIpToDecimal.setEditable(false);
        resultOfIpToDecimal.setPrefHeight(70);
        resultOfIpToDecimal.setPadding(new Insets(6));
        resultOfIpToDecimal.setText("Result:");

        /* Add the StackPane object (paneForHeadingOfIpToDecimal), GridPane object (paneForLbTxtFldAndBtnIP) and TextArea object
           (resultOfIpToDecimal) in BorderPane object (paneForIpToDecimal). */
        paneForIpToDecimal.setTop(paneForHeadingOfIpToDecimal);
        paneForIpToDecimal.setCenter(paneForLbTxtFldAndBtnIP);
        paneForIpToDecimal.setBottom(resultOfIpToDecimal);

        // Make a Text object which acts as heading of Decimal to Ip.
        Text headingOfDecimalToIp = new Text();
        headingOfDecimalToIp.setText(" Decimal to IP");
        headingOfDecimalToIp.setFill(Color.WHITE);
        headingOfDecimalToIp.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR,16));

        // Make a Rectangle object which acts as background for heading of Decimal To Ip.
        Rectangle backgroundForHeadingOfDecimalToIp = new Rectangle();
        backgroundForHeadingOfDecimalToIp.setWidth(430);
        backgroundForHeadingOfDecimalToIp.setHeight(30);
        backgroundForHeadingOfDecimalToIp.setFill(Color.GREEN);

        /* Make a StackPane object (paneForHeadingOfDecimalToIp) and add the Text object (headingOfDecimalToIp) and
           Rectangle object (backgroundForHeadingOfDecimalToIp) in it. */
        StackPane paneForHeadingOfDecimalToIp = new StackPane();
        paneForHeadingOfDecimalToIp.getChildren().addAll(backgroundForHeadingOfDecimalToIp,headingOfDecimalToIp);
        paneForHeadingOfDecimalToIp.setPadding(new Insets(10,0,0,0));

        // Make a Label object which acts as label for IP decimal.
        Label lbForIpDecimal = new Label();
        lbForIpDecimal.setText("IP Decimal:");
        lbForIpDecimal.setFont(Font.font("Helvetica",15));

        // Make a TextField object which takes IP decimal as input from users.
        TextField txtFldForIpDecimal = new TextField();
        txtFldForIpDecimal.setPrefWidth(335);

        // Make a Button object for Decimal To Ip conversion.
        Button btnToConvertDecimalToIp = new Button();
        btnToConvertDecimalToIp.setText("Convert");
        btnToConvertDecimalToIp.setFont(Font.font("Helvetica"));
        btnToConvertDecimalToIp.setTextFill(Color.WHITE);
        btnToConvertDecimalToIp.setTextFill(Color.GREEN);

        /* Make a GridPane object for adding the Label object (lbForIPAddress), TextField (txtFldForIpAddress) and
           Button object (btnToConvertIpToDecimal) in it. */
        GridPane paneForLbTxtFldAndBtnDec = new GridPane();
        paneForLbTxtFldAndBtnDec.add(lbForIpDecimal,0,0);
        paneForLbTxtFldAndBtnDec.add(txtFldForIpDecimal,1,0);
        paneForLbTxtFldAndBtnDec.add(btnToConvertDecimalToIp,0,1);
        paneForLbTxtFldAndBtnDec.setHgap(10);
        paneForLbTxtFldAndBtnDec.setVgap(12);
        paneForLbTxtFldAndBtnDec.setPadding(new Insets(15,0,25,20));

        // Make a TextArea object which acts as result of Decimal to Ip conversion.
        TextArea resultOfDecimalToIp = new TextArea();
        resultOfDecimalToIp.setEditable(false);
        resultOfDecimalToIp.setPrefHeight(70);
        resultOfDecimalToIp.setPadding(new Insets(6));
        resultOfDecimalToIp.setText("Result:");

        /* Add the StackPane object (paneForHeadingOfDecimalToIp), GridPane object (paneForLbTxtFldAndBtnDec) and
           TextArea object (resultOfDecimalToIp) in BorderPane object (paneForDecimalToIp). */
        paneForDecimalToIp.setTop(paneForHeadingOfDecimalToIp);
        paneForDecimalToIp.setCenter(paneForLbTxtFldAndBtnDec);
        paneForDecimalToIp.setBottom(resultOfDecimalToIp);

        /* Add the StackPane object (paneForHeader), BorderPane object (paneForIpToDecimal) and BorderPane object
           (paneForDecimalToIp) in BorderPane object (paneForLayout). */
        paneForLayout.setTop(paneForHeader);
        paneForLayout.setCenter(paneForIpToDecimal);
        paneForLayout.setBottom(paneForDecimalToIp);

        /* Make an action event handler/handling for Button object (btnToConvertIpToDecimal). When button is clicked,
           it converts the IP address to IP decimal and display the result in TextArea object (resultOfIpToDecimal).*/
        IpToDecimalConverter ipToDecimalConverter = IpToDecimalConverter.getInstance();
        btnToConvertIpToDecimal.setOnAction(e -> {
            String result = ipToDecimalConverter.ipToDecimal(txtFldForIpAddress.getText());
            resultOfIpToDecimal.setText("Result: "+result);
        });

         /* Make an action event handler/handling for Button object (btnToConvertDecimalToIp). When button is clicked,
           it converts the IP decimal to IP address and display the result in TextArea object (resultOfDecimalToIp).*/
        DecimalToIpConverter decimalToIpConverter = DecimalToIpConverter.getInstance();
        btnToConvertDecimalToIp.setOnAction(e -> {
            String result = decimalToIpConverter.decimalToIp(txtFldForIpDecimal.getText());
            resultOfDecimalToIp.setText("Result: "+result);
        });
        return paneForLayout;
    }
}
