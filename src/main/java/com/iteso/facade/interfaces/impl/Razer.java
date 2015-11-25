package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.PCController;

/**
 * Created by ShaSkills on 24/11/2015.
 */
public class Razer implements PCController {


    public void on() {
        System.out.println("Razer wireless controller is ON");
    }

    public void off() {
        System.out.println("Razer wireless controller is OFF");
    }
}
