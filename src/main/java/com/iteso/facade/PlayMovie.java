package com.iteso.facade;

import com.iteso.facade.interfaces.*;
import com.iteso.facade.interfaces.impl.BlueRayConsole;
import com.iteso.facade.interfaces.impl.PS3Game;

/**
 * Created by JoseFranco on 24/11/2015.
 */

    public class PlayMovie {
        TV tv;
        Movie movie;
        GameConsole console;
        GameController controller;
        SoundSystem soundSystem;
        Router router;
        Lights lights;


        public PlayMovie(TV tv,
                               GameConsole console,
                               GameController controller,
                               SoundSystem soundSystem,
                               Lights lights) {
            this.tv = tv;
            this.console = console;
            this.controller = controller;
            this.soundSystem = soundSystem;
            this.lights = lights;
        }


        public void playMovie(String movieName) {

            System.out.println("Turning the system ON, this may take some time");
            System.out.println();

            tv.on();
            tv.toHDMI();

            console.on();
            controller.on();
            movie =  new BlueRayConsole(movieName);
            console.insertMovie(movie);

            soundSystem.on();
            soundSystem.toOpticalEntry();


            lights.off();


            movie.play();
            System.out.println();


        }

    public void stopPlayingMovie(){

        System.out.println();
        System.out.println("Turning the system OFF, this may take some time");
        System.out.println();
        lights.on();
        tv.off();
        controller.off();
        console.off();
        soundSystem.off();



    }
    }
