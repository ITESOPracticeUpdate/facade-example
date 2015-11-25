package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Movie;
import com.iteso.facade.interfaces.PCMonitor;
import com.iteso.facade.interfaces.TV;
import com.iteso.facade.interfaces.VideoGame;

/**
 * Created by Carlos on 24/11/2015.
 */
public class PCMonitorAdapter implements TV {
    PCMonitor monitor;

    public PCMonitorAdapter(PCMonitor monitor){
        this.monitor = monitor;
    }

    public void on() {
        System.out.println("The PC Monitor is ON");
    }

    public void off() {
        System.out.println("The PC Monitor is ON");
    }

    public void toHDMI() {
        System.out.println("Using my HDMI to VGA adapter to use mi PC Monitor as a TV");
    }
}
