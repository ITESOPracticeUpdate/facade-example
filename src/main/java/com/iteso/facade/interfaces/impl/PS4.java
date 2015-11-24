package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.GameConsole;
import com.iteso.facade.interfaces.PlayMovie;
import com.iteso.facade.interfaces.VideoGame;

/**
 * Created by Nizath on 11/24/2015.
 */
public class PS4  implements GameConsole {
    public void on() {
        System.out.println("Play Station 3 is ON");
    }

    public void off() {
        System.out.println("Play Station 3 is OFF");
    }

    public void insertGame(VideoGame videoGame) {
        System.out.println(videoGame.getName() + " has been inserted into Play Station 3");
    }
    public void playMovie(PlayMovie Movie) {
        System.out.println(Movie.getName() + " has been inserted into PS4");
    }
}
