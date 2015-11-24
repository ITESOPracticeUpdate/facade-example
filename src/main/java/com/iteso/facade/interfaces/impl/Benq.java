package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.PCMonitor;

/**
 * Created by Nizath on 11/24/2015.
 */
public class Benq implements PCMonitor{
    public void on(){System.out.println("Benq is ON");}
    public void off(){System.out.println("Benq is OFF");}
    public void toHDMI(){System.out.println("Changing Benq input to HDMI");}
    public void toVGA(){
        System.out.println("Changing Benq input to VGA");
    }
}
