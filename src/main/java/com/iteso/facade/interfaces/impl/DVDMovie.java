package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Movie;

/**
 * Created by Paloma on 24/11/2015.
 */
public class DVDMovie implements Movie {
    String name;

    public DVDMovie(String name){
        this.name = name;
    }

    public void play() {
        System.out.println("Playing " + name);
    }

    public String getName() {
        return this.name;
    }
}
