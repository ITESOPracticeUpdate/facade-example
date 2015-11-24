package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.PCMonitor;

/**
 * Created by Paloma on 24/11/2015.
 */
public class BenQ implements PCMonitor {

    public void on() {
        System.out.println("BenQ monitor is ON");
    }

    public void off() {
        System.out.println("BenQ monitor is OFF");
    }

    public void toHDMI() {
        System.out.println("Changing BenQ monitor input to HDMI");
    }
}
