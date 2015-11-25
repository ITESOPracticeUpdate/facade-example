package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.PlayMovie;
import com.iteso.facade.interfaces.VideoGame;

/**
 * Created by Nizath on 11/24/2015.
 */
public class Movie2GameAdapter implements VideoGame {
    PlayMovie Movie;
    String name;
    public Movie2GameAdapter(PlayMovie Movie){
        this.name = Movie.getName();

    }


    public void setOnlineMode() {
        System.out.println("" );
    }


    public void play(){Movie.play();}


    public String getName() {
        return this.name;
    }
}
