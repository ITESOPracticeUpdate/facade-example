package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.TV;

/**
 * Created by jose luis on 24/11/2015.
 */
public class PcMonitor implements TV {
    @Override
    public void on() {
        System.out.println("Pc Monitor is ON");
    }

    @Override
    public void off() {
        System.out.println("Pc Monitor is OFF");
    }

    @Override
    public void toHDMI() {
        System.out.println("Changing Pc Monitor input to HDMI");
    }
}

