package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.awt.*;
import java.io.FileInputStream;

public class Main extends Application {

    @Override
    public void start (javafx.stage.Stage primaryStage) throws Exception {
        primaryStage.setTitle("Avatar the last Air bender");
        FileInputStream input1 = new FileInputStream("/Users/niyatsiyum/Downloads/Aang firebending.jpg");
        Image image1 = new Image(input1);
        ImageView View1 = new ImageView(image1);
        View1.setFitHeight(400); View1.setFitWidth(400);

        FileInputStream input2 = new FileInputStream("/Users/niyatsiyum/Downloads/Aang airbending.png");
        Image image2= new Image(input2);
        ImageView View2 = new ImageView(image2);
        View2.setFitHeight(400); View2.setFitWidth(400);

        FileInputStream input3 = new FileInputStream("/Users/niyatsiyum/Downloads/Aang earthbending.png");
        Image image3 = new Image(input3);
        ImageView View3 = new ImageView(image3);

        FileInputStream input4 = new FileInputStream("/Users/niyatsiyum/Downloads/aang waterbending.jpg");
        Image image4 = new Image(input4);
        ImageView View4 = new ImageView(image4);

        FileInputStream input5 = new FileInputStream ("/Users/niyatsiyum/Downloads/Avatar state.jpg");
        Image image5 = new Image(input5);
        ImageView View5 = new ImageView(image5);

        //MenuButton
        MenuItem menuItem1 = new MenuItem ("Water bending");
        MenuItem menuItem2 = new MenuItem ("Air bending");
        MenuItem menuItem3 = new MenuItem ("Earth bending");
        MenuItem menuItem4 = new MenuItem ("Fire bending");
        MenuItem menuItem5 = new MenuItem("Avatar state");
        MenuButton menuButton = new MenuButton ("Options", null, menuItem1, menuItem2, menuItem3, menuItem4, menuItem5);
        menuItem3.setOnAction(actionEvent -> {

            View2.setImage(image3);
        });
        menuItem2.setOnAction(actionEvent -> {

            View2.setImage(image2);
        });
        menuItem1.setOnAction(actionEvent -> {

            View2.setImage(image4);
        });
        menuItem5.setOnAction(actionEvent -> {

            View2.setImage(image5);
        });
        menuItem4.setOnAction(actionEvent -> {

            View2.setImage(image1);
        });
        // checkboxes
        CheckBox myFirstCheckBox = new CheckBox("Water Bending");
        CheckBox option1 = new CheckBox("Fire Bending");
        CheckBox option2 = new CheckBox("Earth Bending");
        CheckBox option3 = new CheckBox("Air Bending");
        CheckBox option4 = new CheckBox("Avatar State");
        myFirstCheckBox.setOnAction(actionEvent -> {
            View1.setImage(image4);


                    //handleCheckboxOptions(option1, option2, option3, option4);
        });
        HBox hbox = new HBox(View1, View2);
        VBox vbox= new VBox( hbox, menuButton, myFirstCheckBox,option1, option2, option3, option4 );
                Scene scene = new Scene(vbox, 1000,650);
                primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main (String [] args) {
        Application.launch(args);
    }
}







