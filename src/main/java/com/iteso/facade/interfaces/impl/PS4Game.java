package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.VideoGame;

/**
 * Created by Feelpaa on 24/11/2015.
 */
public class PS4Game implements VideoGame {

    String name = "" ;

    public PS4Game(String name){
        this.name = name;
    }

    @Override
    public void setOnlineMode() {
        System.out.println("Setting Online mode on " + name);
    }

    @Override
    public void play() {
        System.out.println("Playing " + name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
