package com.monkeygang.javafx_clock;

import java.time.LocalDateTime;


public class getTime {

    LocalDateTime currentTime = LocalDateTime.now();

    int currentTimeSeconds;

    int currentTimeMinutes;

    int currentTimeHours;



    public int getSeconds(){
    currentTimeSeconds = currentTime.getSecond();

    return currentTimeSeconds;

    }

    public int getMinutes(){

        currentTimeMinutes = currentTime.getMinute();


     return currentTimeMinutes;
    }

    public int getHours(){
     currentTimeHours = currentTime.getHour();

     return currentTimeHours;

    }

}
