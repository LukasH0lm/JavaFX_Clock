package com.monkeygang.javafx_clock;
import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;
import java.time.LocalDateTime;

public class ClockController {

    @FXML
    private Line secLine;

    @FXML
    private Line minLine;

    @FXML
    private Line hourLine;

    @FXML
    private Label am_pmLabel;

    LocalDateTime now;

    Rotate secRotation = new Rotate();
    Rotate minRotation = new Rotate();
    Rotate hourRotation = new Rotate();

    Timeline timeline;

    public void initialize() {
        //setting the pivot points for the lines
        //they should be the same because they are all connected to the center of the clock,
        //but I set them individually just in case
        secRotation.pivotXProperty().bind(secLine.startXProperty());
        secRotation.pivotYProperty().bind(secLine.startYProperty());
        secLine.getTransforms().add(secRotation);

        minRotation.pivotXProperty().bind(minLine.startXProperty());
        minRotation.pivotYProperty().bind(minLine.startYProperty());
        minLine.getTransforms().add(minRotation);

        hourRotation.pivotXProperty().bind(hourLine.startXProperty());
        hourRotation.pivotYProperty().bind(hourLine.startYProperty());
        hourLine.getTransforms().add(hourRotation);


        timeline = new Timeline(new KeyFrame(Duration.seconds(0.25), e -> rotateLines()));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.playFromStart();

    }

    //main loop
    private void rotateLines() {
        now = LocalDateTime.now();
        System.out.println("Time: " + now.getHour() + ":" + now.getMinute() + ":" + now.getSecond());

        if (now.getHour() > 12) {
            am_pmLabel.setText("PM");
        } else {
            am_pmLabel.setText("AM");
        }

        rotateSecLine();
        rotateMinLine();
        rotateHourLine();
    }

    //methods for the individual lines

    public void rotateSecLine() {
        secRotation.setAngle(now.getSecond() * 6.0);
        secLine.setRotate(secRotation.getAngle());
    }

    public void rotateMinLine() {
        minRotation.setAngle(now.getMinute() * 6);
        minLine.setRotate(minRotation.getAngle());
    }


    public void rotateHourLine() {
        hourRotation.setAngle(now.getHour() * 30);
        hourLine.setRotate(hourRotation.getAngle());
    }


}