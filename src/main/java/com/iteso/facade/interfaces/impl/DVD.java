package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Movie;

/**
 * Created by ShaSkills on 24/11/2015.
 */
public class DVD implements Movie {

    String name;

    public DVD(String name){

        this.name = name;
    }

    public void play() {
        System.out.println("You are watching " + this.name);
    }

    public void stopMovie() {
        System.out.println("The movie " + this.name+ " stop");
    }

    public String getName() {
        return this.name;
    }
}
