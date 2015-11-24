package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.PCMonitor;
import com.iteso.facade.interfaces.TV;

/**
 * Created by WolfBloodDude on 24/11/15.
 */
public class PCMonitorAdapter implements TV {
    PCMonitor pcMonitor;

    public PCMonitorAdapter(PCMonitor pcMonitor) {
        this.pcMonitor = pcMonitor;
    }
    @Override
    public void on() {
        pcMonitor.on();
    }

    @Override
    public void off() {
        pcMonitor.off();
    }

    @Override
    public void toHDMI() {
        pcMonitor.toHDMI();
    }
}
