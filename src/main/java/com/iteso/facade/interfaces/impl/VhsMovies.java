package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Movies;

/**
 * Created by Feelpaa on 24/11/2015.
 */

//add ////////////////////////////////////////////////////////
public class VhsMovies implements Movies{

    private String name = "" ;

    public VhsMovies(String name) {
        setName(name);
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo " + getName() + "Pelicula");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}//vhsmovies
