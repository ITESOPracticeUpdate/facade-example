package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.GameController;
import com.iteso.facade.interfaces.PCController;

/**
 * Created by ShaSkills on 24/11/2015.
 */
public class PCControllerAdapter implements GameController {

    PCController pc;

    public PCControllerAdapter(PCController pc){
        this.pc = pc;
    }


    public void on() {
        pc.on();
    }

    public void off() {
        pc.off();
    }
}
