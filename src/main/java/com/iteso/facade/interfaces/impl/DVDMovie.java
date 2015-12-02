package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Movie;

/**
 * Created by jose luis on 01/12/2015.
 */
public class DVDMovie implements Movie {
    String name;

    public DVDMovie(String name){this.name = name;}


    public void setMovie() {
        System.out.println("Setting" + name + "movie");
    }


    public void play() {
        System.out.println("Now, playing" + name);
    }

    public void stop() {
        System.out.println("Stop playing" + name);
    }

        public String getName() {
        return this.name;
    }
}

