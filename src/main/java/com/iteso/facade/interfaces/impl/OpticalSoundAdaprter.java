package com.iteso.facade.interfaces.impl;
import com.iteso.facade.interfaces.OpticalSound;


/**
 * Created by jose luis on 01/12/2015.
 */
public class OpticalSoundAdaprter implements OpticalSound {
OpticalSound opticalsound;

    public void on() {
        opticalsound.on();
    }

    public void off() {
        opticalsound.off();
    }

    public void toOpticalPort() {
        opticalsound.toOpticalPort();
    }

    }
