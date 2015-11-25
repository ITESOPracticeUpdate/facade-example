package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Monitor;
import com.iteso.facade.interfaces.TV;

/**
 * Created by Feelpaa on 24/11/2015.
 */

//add///////////////////////////////////////////////////
    /*
    pasa lo mismo que en laserligths, solo que en este caso adaptamos el monitor a la Tv
    osease, como que sobre escribimos las funcionalidades de TV con las de monitor
    de tal forma que ambas tienen las mismas , pero siguen siendo individuales
     */
public class MonitorAdaptador implements TV{

    Monitor monitor;


    public MonitorAdaptador(Monitor monitor) {
        this.monitor = monitor;
    }


    @Override
    public void on() {
        monitor.on();

    }

    @Override
    public void off() {
        monitor.off();

    }

    @Override
    public void toHDMI() {
        monitor.toHDMI();

    }
}//monitor Adptador
