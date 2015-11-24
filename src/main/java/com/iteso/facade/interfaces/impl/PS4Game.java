package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.VideoGame;

/**
 * Created by Paloma on 24/11/2015.
 */
public class PS4Game implements VideoGame {
    String name;
    public PS4Game(String name){
        this.name = name;
    }

    public void setOnlineMode() {
        System.out.println("Setting Online mode on " + name);
    }

    public void play() {
        System.out.println("Playing " + name);
    }

    public String getName() {
        return this.name;
    }
}
