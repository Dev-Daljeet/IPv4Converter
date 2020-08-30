package com.mycompany.convertipv4todecimal;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UserInterface extends Application
{
    LayoutPane layoutPane = new LayoutPane();

    public void start(Stage primaryStage)
    {
        Scene scene = new Scene(layoutPane.getPaneForLayout(),450,500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
