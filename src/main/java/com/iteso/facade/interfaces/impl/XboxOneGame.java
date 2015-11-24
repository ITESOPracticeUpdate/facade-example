package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.VideoGame;

/**
 * Created by WolfBloodDude on 24/11/15.
 */
public class XboxOneGame implements VideoGame {
    String name;
    public XboxOneGame(String name){
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
