package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Speakers;

/**
 * Created by Paloma on 24/11/2015.
 */
public class LogiTechSpeakers implements Speakers {
    public void on() {
        System.out.println("Logitech Speakers is turning ON");
        System.out.println("Logitech Speakers is ON");
    }

    public void off() {
        System.out.println("Logitech Speakers is turning OFF");
        System.out.println("Logitech Speakers is OFF");

    }

    public void toOpticalEntry() {
        System.out.println("Changing Logitech Speakers input to Optical");
    }
}
