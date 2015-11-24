package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.GameConsole;
import com.iteso.facade.interfaces.Movie;
import com.iteso.facade.interfaces.VideoGame;

/**
 * Created by Paloma on 24/11/2015.
 */
public class XBOXOne implements GameConsole {
    public void on() {
        System.out.println("XBOX ONE is ON");
    }

    public void off() {
        System.out.println("XBOX ONE is OFF");
    }

    public void insertGame(VideoGame videoGame) {
        System.out.println(videoGame.getName() + " has been inserted into XBOX ONE");
    }

    public void insertMovie(Movie movie) {
        System.out.println(movie.getName() + " can't be played in XBOX ONE");
    }

}
