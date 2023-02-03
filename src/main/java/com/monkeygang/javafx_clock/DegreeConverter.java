package com.monkeygang.javafx_clock;

public class DegreeConverter {

    double convertSecondsToDegrees(int seconds){
        return 360.0 / seconds;
    }

    double convertMinutesToDegrees(int minutes){
        int seconds = minutes * 60;
        return convertSecondsToDegrees(seconds);
    }

    double convertHoursToDegrees(int hours){
        int minutes = hours * 60;
        return convertMinutesToDegrees(minutes);
    }

}
