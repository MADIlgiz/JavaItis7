package com.company;

import java.time.LocalTime;

public class Program {
    String name;
    LocalTime startTime;
    LocalTime finishTime;
    public Program() {

    }
    public Program(String name, String startTime, String finishTime) {
        this.name = name;
        this.startTime = LocalTime.parse(startTime);
        this.finishTime = LocalTime.parse(finishTime);
    }
    boolean isGoingNow() {
        LocalTime nowTime = LocalTime.now();
        if (nowTime.isAfter(startTime)&&nowTime.isBefore(finishTime))
        {
            return true;
        } else {
            return false;
        }
    }
}
