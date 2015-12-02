package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.GameController;

/**
 * Created by jose luis on 24/11/2015.
 */
public class WheelController implements GameController {


    public void on() {
        System.out.println("Wheel Controller controller is ON");
    }


    public void off() {
        System.out.println("Wheel Controller controller is OFF");
    }


}

