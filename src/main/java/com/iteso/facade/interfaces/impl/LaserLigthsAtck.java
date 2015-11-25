package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.LaserLights;

/**
 * Created by Feelpaa on 24/11/2015.
 */
public class LaserLigthsAtck implements LaserLights{

    @Override
    public void kill() {
        System.out.println("LaserLights It's Killing to everybody");

    }

    @Override
    public void NoKill() {
        System.out.println("LaserLights It's Killing to everybody Again");


    }

    @Override
    public void ColorfullRoom() {
        System.out.println("LaserLights It's Killing to everybody again again and Paint the room");

    }
}
