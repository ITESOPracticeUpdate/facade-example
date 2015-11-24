package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Movie;

/**
 * Created by Sacrp on 11/24/15.
 */
public class BluRayMovie implements Movie {

    String name;

    public BluRayMovie(String name){this.name = name;}


    @Override
    public void play() {
        System.out.println("Playing movie " + getName());
    }

    @Override
    public String getName() {
        return this.name;
    }
}
