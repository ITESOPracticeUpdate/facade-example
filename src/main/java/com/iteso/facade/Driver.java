package com.iteso.facade;

import com.iteso.facade.interfaces.*;
import com.iteso.facade.interfaces.impl.*;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class Driver {


    public static void main (String[] args){
        GameConsole ps4 = new PS4();
        GameConsole xboxOne = new XBOXOne();
        GameController dualShock = new DualShock();
        Lights lights = new EcoLights();
        SoundSystem bose = new Bose();
        TV tv = new SonyBravia();

        PlayMovie playMovie = new PlayMovie(tv, ps4,dualShock,bose,lights);

        playMovie.playMovie("Avengers");

        playMovie.stopPlayingMovie();

         playMovie = new PlayMovie(tv, xboxOne,dualShock,bose, lights);

        playMovie.playMovie("Captain America: Civil War");

    }

}
