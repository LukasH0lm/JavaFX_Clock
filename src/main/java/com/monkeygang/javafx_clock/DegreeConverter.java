package com.monkeygang.javafx_clock;

public class DegreeConverter {

    double convertTimeToDegrees(int seconds){
        return (360.0 / 60) * seconds;
    }

    double convertMinutesToDegrees(int minutes){
        return (360.0 / 60) * minutes;

    }

    double convertHoursToDegrees(int hours){
        return (360.0 / 12) * hours;

    }

}
