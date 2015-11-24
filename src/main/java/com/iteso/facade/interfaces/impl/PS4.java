package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.GameConsole;
import com.iteso.facade.interfaces.Movie;
import com.iteso.facade.interfaces.VideoGame;

/**
 * Created by Paloma on 24/11/2015.
 */
public class PS4 implements GameConsole {
    public void on() {
        System.out.println("Play Station 4 is ON");
    }

    public void off() {
        System.out.println("Play Station 4 is OFF");
    }

    public void insertGame(VideoGame videoGame) {
        System.out.println(videoGame.getName() + " has been inserted into Play Station 4");
    }

    public void insertMovie(Movie movie) {
        System.out.println(movie.getName() + " has been inserted into Play Station 4");
    }
}
