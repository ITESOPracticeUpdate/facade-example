package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.PCMonitor;
import com.iteso.facade.interfaces.TV;

/**
 * Created by ShaSkills on 24/11/2015.
 */
public class PCMonitorAdapter implements TV {

    PCMonitor monitor;

    public PCMonitorAdapter(PCMonitor monitor){
        this.monitor = monitor;
    }

    public void on() {
        monitor.on();
    }

    public void off() {
        monitor.off();
    }

    public void toHDMI() {
        monitor.toVGA();
    }


}
