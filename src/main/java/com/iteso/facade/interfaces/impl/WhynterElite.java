package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.AirConditioner;

/**
 * Created by ShaSkills on 24/11/2015.
 */
public abstract class WhynterElite implements AirConditioner {

    int level;

    public void on() {

        System.out.println("Whynter conditioner is ON");

    }

    public void off() {
        System.out.println("Whynter conditioner is OFF");
    }

    public void getLevel() {
        System.out.println("The air conditioner level is "+ this.level);

    }

    public int setLevel(int level) {

      return  this.level = level;

    }
}
