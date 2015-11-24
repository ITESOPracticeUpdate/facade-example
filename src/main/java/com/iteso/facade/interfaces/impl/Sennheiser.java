package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.SoundSystem;

/**
 * Created by GGGK4 on 24/11/2015.
 */
public class Sennheiser implements SoundSystem {
    public void on() {
        System.out.println("Sennheiser surround system is turning ON");
        System.out.println("Sennheiser surround system is ON");
    }

    public void off() {
        System.out.println("Sennheiser surround system is turning Off");
        System.out.println("Sennheiser surround system is Off");
    }

    public void toOpticalEntry() {
        System.out.println("Changing Sennheiser surround system input to Optical");
    }
}
