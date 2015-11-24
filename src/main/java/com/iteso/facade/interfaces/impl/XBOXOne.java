package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.GameConsole;
import com.iteso.facade.interfaces.Movie;
import com.iteso.facade.interfaces.VideoGame;

/**
 * Created by JoseFranco on 24/11/2015.
 */
public class XBOXOne implements GameConsole {
    @Override
    public void on() {
        System.out.println("XBOX ONE is ON");
    }

    @Override
    public void off() {
        System.out.println("XBOX ONE is OFF");
    }

    @Override
    public void insertGame(VideoGame videoGame) {
        System.out.println(videoGame.getName() + " has been inserted into XBOX One");

    }

    @Override
    public void insertMovie(Movie movie) {
        System.out.println(movie.getName() + " has been inserted into XBOX One as a Movie");

    }
}
