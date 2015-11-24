package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.GameConsole;
import com.iteso.facade.interfaces.VideoGame;

/**
 * Created by Nizath on 11/24/2015.
 */
public class XBOXONE implements GameConsole {
    public void on() {
        System.out.println("XBOX ONE is ON");
    }

    public void off() {
        System.out.println("XBOX ONE is OFF");
    }

    public void insertGame(VideoGame videoGame) {
        System.out.println(videoGame.getName() + " has been inserted into XBOX ONE");
    }
}
