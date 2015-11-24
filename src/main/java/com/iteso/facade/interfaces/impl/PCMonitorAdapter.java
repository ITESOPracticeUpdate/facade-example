package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.PCMonitor;
import com.iteso.facade.interfaces.TV;

/**
 * Created by Paloma on 24/11/2015.
 */
public class PCMonitorAdapter implements TV {

    PCMonitor pcMonitor;

    public  PCMonitorAdapter(PCMonitor pcMonitor){
        this.pcMonitor = pcMonitor;
    }

    public void on() {
        pcMonitor.on();
    }

    public void off() {
        pcMonitor.off();
    }

    public void toHDMI() {
        pcMonitor.toHDMI();
    }

}
