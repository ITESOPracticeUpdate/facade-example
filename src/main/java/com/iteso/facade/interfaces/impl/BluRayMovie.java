package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Movie;

/**
 * Created by GGGK4 on 30/11/2015.
 */
public class BluRayMovie implements Movie {
    String name;

    public BluRayMovie(String name){this.name = name;}

    @Override
    public void setMovie() {
        System.out.println("Setting" + name + "movie");
    }

    @Override
    public void play() {
        System.out.println("Now, playing" + name);
    }

    @Override
    public void stop() {
        System.out.println("Stop playing" + name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
