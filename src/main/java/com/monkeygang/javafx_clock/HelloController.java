package com.monkeygang.javafx_clock;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class HelloController {


    getTime getTimeObject = new getTime();


    @FXML
    private Circle cTest;

    @FXML
    private Line sTest;


    public void RootateSecondLine(){


    }


    public void initialize(){

        getTimeObject.getSeconds();
        System.out.println("Seconds: " + getTimeObject.getSeconds());
        getTimeObject.getMinutes();
        System.out.println("Minutes: " + getTimeObject.getMinutes());
        getTimeObject.getHours();
        System.out.println("Hours: " + getTimeObject.getHours());


    }

}