package com.monkeygang.javafx_clock;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;

public class ClockController {





    @FXML
    private Circle cTest;

    @FXML
    private Line sTest;

    public void test(){

        System.out.println("test");
    }

    Rotate rotate = new Rotate();
    double up = 0.0;

    public void RootateSecondLine(){

        getTime getTimeObject = new getTime();



        rotate.setAngle(getTimeObject.getSeconds() * 6);
        System.out.println(getTimeObject.getSeconds());
        rotate.setPivotX(18);
        rotate.setPivotY(2);
        sTest.getTransforms().addAll(rotate);



    }


    public void initialize(){
        /*
        getTimeObject.getSeconds();
        System.out.println("Seconds: " + getTimeObject.getSeconds());
        getTimeObject.getMinutes();
        System.out.println("Minutes: " + getTimeObject.getMinutes());
        getTimeObject.getHours();
        System.out.println("Hours: " + getTimeObject.getHours());
        */
        RootateSecondLine();
    }

}