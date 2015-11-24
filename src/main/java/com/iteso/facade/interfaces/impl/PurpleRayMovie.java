package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Movies;

/**
 * Created by WolfBloodDude on 24/11/15.
 */
public class PurpleRayMovie implements Movies {
    private String name;

    public PurpleRayMovie(String name) {
        setName(name);
    }

    @Override
    public void play() {
        System.out.println("Playing " + getName() + " movie");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
