package com.mycompany.ipv4conversion;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** Represents the User Interface of application/project.
 * @author Daljeet Singh (Dev-Daljeet)
 * @version 1.0
 */
public class UserInterface extends Application
{
    LayoutPane layoutPane = new LayoutPane();

    /** Runs the program or starting point of execution.
     * (Note: The main method is only needed for the IDE with limited JavaFX support.
     *  Not needed for running from the command line.)
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

    /** Displays the GUI and overrides the start() method of class Application.
     * @param stage An instance of class stage which consists the scene to display GUI.
     */
    public void start(Stage stage)
    {
        Scene scene = new Scene(layoutPane.getPaneForLayout(),450,500);
        stage.setTitle("IPv4 Converter");
        stage.setScene(scene);
        stage.show();
    }
}
