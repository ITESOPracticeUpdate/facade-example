package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.PCMonitor;

/**
 * Created by Carlos on 24/11/2015.
 */
public class SONYMonitor implements PCMonitor {
    public void on() {
        System.out.println("SONY monitor is ON");
    }

    public void off() {
        System.out.println("SONY monitor is OFF");
    }

    public void toVGA() {
        System.out.println("SONY monitor is connected by VGA");
    }
}
