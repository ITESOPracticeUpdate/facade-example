package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Movie;

/**
 * Created by JoseFranco on 24/11/2015.
 */
public class BlueRayConsole implements Movie {
    String name;
    public BlueRayConsole(String name){
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Playing " + name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
