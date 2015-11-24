package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.TV;

/**
 * Created by GGGK4 on 24/11/2015.
 */
public class MonitorAdapter implements TV {

    public void on() {
        System.out.println("This Monitor is On");
    }

    public void off() {
        System.out.println("This Monitor is Off");
    }

    public void toHDMI() {
        System.out.println("Changing Monitor input to HDMI");
    }
}
