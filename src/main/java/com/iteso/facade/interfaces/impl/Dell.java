package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.PCMonitor;

/**
 * Created by Nizath on 11/24/2015.
 */
public class Dell implements PCMonitor {
    public void on(){System.out.println("Dell is ON");}
    public void off(){System.out.println("Dell is OFF");}
    public void toHDMI(){System.out.println("Changing Dell input to HDMI");}
    public void toVGA(){
        System.out.println("Changing Dell input to VGA");
    }
}
