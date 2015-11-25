package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Movie;
import com.iteso.facade.interfaces.VideoGame;

/**
 * Created by Carlos on 24/11/2015.
 */
public class MovieAdapter implements VideoGame {
    Movie movie;


    public MovieAdapter(Movie movie) {
        this.movie = movie;
    }


    public void setOnlineMode() {
        System.out.println("Online mode is off");
    }

    public void play() {
            System.out.println("Playing the movie " + movie.getName());
    }

    public String getName() {
        return movie.getName();
    }
}
