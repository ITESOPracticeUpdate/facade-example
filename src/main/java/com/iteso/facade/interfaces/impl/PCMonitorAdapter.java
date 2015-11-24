package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.PCMonitor;
import com.iteso.facade.interfaces.TV;

/**
 * Created by Nizath on 11/24/2015.
 */
public class PCMonitorAdapter implements TV{
    private PCMonitor Monitor;
    public void on(){Monitor.on();}
    public void off(){Monitor.off();}
    public void toHDMI(){Monitor.toHDMI();}
}
