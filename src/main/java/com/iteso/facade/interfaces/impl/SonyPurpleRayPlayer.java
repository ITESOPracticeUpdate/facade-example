package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Movies;
import com.iteso.facade.interfaces.PurpleRayPlayer;

/**
 * Created by WolfBloodDude on 24/11/15.
 */
public class SonyPurpleRayPlayer implements PurpleRayPlayer{

    @Override
    public void on() {
        System.out.println("Sony Purple-Ray Player is ON");
    }

    @Override
    public void off() {
        System.out.println("Sony Purple-Ray Player is OFF");
    }

    @Override
    public void insertMovie(Movies movie) {
        System.out.println(movie.getName() + " has been inserted in the Sony Purple-Ray Player");
    }
}
