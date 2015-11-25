package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.PCMonitor;

/**
 * Created by ShaSkills on 24/11/2015.
 */
public class SonyMonitor implements PCMonitor {

    public void on() {
       System.out.println("Sony Bravia is ON");
    }

    public void off() {
        System.out.println("Sony Bravia is OFF");
    }

    public void toVGA() {
        System.out.println("SonyMonitor input to VGA");
    }
}
