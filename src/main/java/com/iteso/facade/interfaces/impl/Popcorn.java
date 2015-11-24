package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Snack;

/**
 * Created by Paloma on 24/11/2015.
 */
public class Popcorn implements Snack {
String name;

    public Popcorn (String PopcornType){
        this.name = PopcornType + " popcorn";
    }
    public String getName() {
        return name;
    }

    public void refill() {
        System.out.println("Refilling " + name);
    }
}
