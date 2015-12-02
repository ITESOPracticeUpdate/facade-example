package com.iteso.facade;

import com.iteso.facade.interfaces.*;
import com.iteso.facade.interfaces.impl.DVDMovie;
import com.iteso.facade.interfaces.impl.PS3Game;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 8:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class VideoGameFacade {
     TV tv;
     GameConsole console;
     GameController controller;
     SoundSystem soundSystem;
     Router router;
     Lights lights;
     VideoGame game;
     Movie movie;
     USB usb;


    public VideoGameFacade(TV tv,
                           GameConsole console,
                           GameController controller,
                           SoundSystem soundSystem,
                           Router router,
                           Lights lights,
                           USB usb){
        this.tv = tv;
        this.console = console;
        this.controller = controller;
        this.soundSystem = soundSystem;
        this.router = router;
        this.lights = lights;
        this.usb = usb;
    }

    public void playMovies(String movieName){
        System.out.println("Turning the system ON, this may take some time");

        tv.on();
        tv.toHDMI();

        console.on();
        controller.on();
        movie = new DVDMovie(movieName);
        console.insertMovie(movie);

        soundSystem.on();
        soundSystem.toOpticalEntry();

        lights.off();

        movie.setMovie();
        movie.play();

    }


    public void playOnlineGame(String gameName){

        System.out.println("Turning the system ON, this may take some time");
        System.out.println();

        tv.on();
        tv.toHDMI();

        console.on();
        controller.on();
        game = new PS3Game(gameName);
        console.insertGame(game);

        soundSystem.on();
        soundSystem.toOpticalEntry();

        router.on();
        router.checkInternet();

        lights.off();

        game.setOnlineMode();
        game.play();
        System.out.println();


    }

    public void stopPlayingmovie(){
        System.out.println("Turning the system OFF, this may take some time");

        lights.on();
        tv.off();
        controller.off();
        console.off();
        soundSystem.off();
    }

    public void stopPlayingGame(){

        System.out.println();
        System.out.println("Turning the system OFF, this may take some time");
        System.out.println();
        lights.on();
        tv.off();
        controller.off();
        console.off();
        soundSystem.off();
        router.off();


    }


}
