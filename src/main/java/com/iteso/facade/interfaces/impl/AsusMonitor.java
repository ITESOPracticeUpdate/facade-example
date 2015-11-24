package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.PCMonitor;

/**
 * Created by Sacrp on 11/24/15.
 */
public class AsusMonitor implements PCMonitor {


    @Override
    public void on() {
        System.out.println("Asus Monitor is ON");
    }

    @Override
    public void off() {
        System.out.println("Asus Monitor is OFF");
    }

    @Override
    public void toHDMI() {
        System.out.println("Changing Asus Monitor input to HDMI");
    }

}
