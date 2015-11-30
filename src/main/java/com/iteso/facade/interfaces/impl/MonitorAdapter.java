package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.PCMonitor;
import com.iteso.facade.interfaces.TV;

/**
 * Created by GGGK4 on 24/11/2015.
 */
public class MonitorAdapter implements TV {
    PCMonitor monitor;

    public void on() {
        monitor.on();
        monitor.settings();
    }

    public void off() {
        monitor.off();
    }

    public void toHDMI() {
        monitor.toHDMI();
        monitor.toVGA();
    }
}
