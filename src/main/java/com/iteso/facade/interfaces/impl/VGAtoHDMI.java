package com.iteso.facade.interfaces.impl;


import com.iteso.facade.interfaces.Monitor;
import com.iteso.facade.interfaces.TV;

/**
 * Created by jose luis on 01/12/2015.
 */
public class VGAtoHDMI implements TV {
    Monitor monitor;

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