package com.company;

import java.time.format.DateTimeFormatter;

public class Channel {
    Program programs[];
    int count = 0;
    String name;
    public Channel(String name){
        this.name = name;
        this.programs = new Program[5];
    }
    void addProgram(Program program){
        this.programs[count] = program;
        count ++;
    }
    void showallPrograms(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm");
        for (int i = 0; i<count;i++){
            System.out.println(programs[i].startTime.format(formatter) + " : " + programs[i].finishTime.format(formatter) + " - "+programs[i].name);
        }
    }

}
