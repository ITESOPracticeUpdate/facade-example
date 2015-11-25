package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.GameConsole;
import com.iteso.facade.interfaces.VideoGame;

/**
 * Created by Feelpaa on 24/11/2015.
 */
public class PS4 implements GameConsole {
    @Override
    public void on() {
        System.out.println("PS 4 is ON");
    }

    @Override
    public void off() {
        System.out.println("PS 4 is OFF");
    }

    @Override
    public void insertGame(VideoGame videoGame) {
        System.out.println(videoGame.getName() + " has been inserted into Play Station 4");
    }
}
