package com.company;

import java.time.LocalTime;

public class TV {
    Channel channels[];
    int count = 0;



    public TV() {
        this.channels = new Channel[5];

    }
    void addChannel(Channel channel) {
        this.channels[count] = channel;
        count ++;
    }
    void showProgramnow (int channelNumber) {
        if (channels[channelNumber] == null) {
            System.out.println("ïùïùïùùïùï");
        }
        else {
            for (int k = 0;k < channels[channelNumber].count; k++) {
            if (channels[channelNumber].programs[k].isGoingNow()) {
                System.out.println(channels[channelNumber].programs[k].name);
            }


        }
        }//return channel.programs[].name;
    }





}


