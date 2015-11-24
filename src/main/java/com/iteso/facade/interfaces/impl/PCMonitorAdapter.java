package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.PCMonitor;
import com.iteso.facade.interfaces.TV;

/**
 * Created by Sacrp on 11/24/15.
 */
public class PCMonitorAdapter implements TV {

    PCMonitor pcmonitor;

    public PCMonitorAdapter(PCMonitor pcmonitor){this.pcmonitor = pcmonitor;}


    @Override
    public void on() {
        pcmonitor.on();
    }

    @Override
    public void off() {
        pcmonitor.off();
    }

    @Override
    public void toHDMI() {
        pcmonitor.toHDMI();
    }
}
