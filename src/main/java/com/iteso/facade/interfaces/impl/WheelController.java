package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.GameController;

/**
 * Created by jose luis on 24/11/2015.
 */
public class WheelController implements GameController {

    @Override
    public void on() {
        System.out.println("Wheel Controller controller is ON");
    }

    @Override
    public void off() {
        System.out.println("Wheel Controller controller is OFF");
    }


}

