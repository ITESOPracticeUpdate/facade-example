package com.iteso.facade;

import com.iteso.facade.interfaces.*;
import com.iteso.facade.interfaces.Movie;
import com.iteso.facade.interfaces.impl.DVDMovie;
import com.iteso.facade.interfaces.impl.PS3Game;
import com.iteso.facade.interfaces.impl.Popcorn;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 8:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class VideoGameFacade {
    private TV tv;
    private GameConsole console;
    private GameController controller;
    private SoundSystem soundSystem;
    private Router router;
    private Lights lights;
    private VideoGame game;
    private Movie movie;
    private Snack snack;


    public VideoGameFacade(TV tv,
                           GameConsole console,
                           GameController controller,
                           SoundSystem soundSystem,
                           Router router,
                           Lights lights){
        this.setTv(tv);
        this.setConsole(console);
        this.setController(controller);
        this.setSoundSystem(soundSystem);
        this.setRouter(router);
        this.setLights(lights);
    }

    public VideoGameFacade(TV tv,
                           GameConsole console,
                           GameController controller,
                           SoundSystem soundSystem,
                           Lights lights){
        this.setTv(tv);
        this.setConsole(console);
        this.setController(controller);
        this.setSoundSystem(soundSystem);
        this.setLights(lights);
    }

    public VideoGameFacade(TV tv,
                           GameConsole console,
                           GameController controller,
                           SoundSystem soundSystem,
                           Router router){
        this.setTv(tv);
        this.setConsole(console);
        this.setController(controller);
        this.setSoundSystem(soundSystem);
        this.setRouter(router);
    }

    public void playOnlineGame(String gameName){

        System.out.println("Turning the system ON, this may take some time");
        System.out.println();

        getTv().on();
        getTv().toHDMI();

        getConsole().on();
        getController().on();
        setGame(new PS3Game(gameName));
        getConsole().insertGame(getGame());

        getSoundSystem().on();
        getSoundSystem().toOpticalEntry();

        getRouter().on();
        getRouter().checkInternet();

        getLights().off();

        getGame().setOnlineMode();
        getGame().play();
        System.out.println();


    }



    public void stopPlayingGame(){

        System.out.println();
        System.out.println("Turning the system OFF, this may take some time");
        System.out.println();
        getLights().on();
        getTv().off();
        getController().off();
        getConsole().off();
        getSoundSystem().off();
        getRouter().off();


    }

    public void playMovie(String movieName, String PopcornType){

        System.out.println("Turning the system ON, this may take some time");
        System.out.println();

        getTv().on();
        getTv().toHDMI();

        getConsole().on();
        getController().on();
        setMovie(new DVDMovie(movieName));
        getConsole().insertMovie(getMovie());

        setSnack(new Popcorn(PopcornType));
        getSoundSystem().on();
        getSoundSystem().toOpticalEntry();

        getLights().off();

        getSnack().refill();

        getMovie().play();
        System.out.println();


    }


    public void stopPlayingMovie(){

        System.out.println();
        System.out.println("Turning the system OFF, this may take some time");
        System.out.println();
        getLights().on();
        getTv().off();
        getController().off();
        getConsole().off();
        getSoundSystem().off();
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public GameConsole getConsole() {
        return console;
    }

    public void setConsole(GameConsole console) {
        this.console = console;
    }

    public GameController getController() {
        return controller;
    }

    public void setController(GameController controller) {
        this.controller = controller;
    }

    public SoundSystem getSoundSystem() {
        return soundSystem;
    }

    public void setSoundSystem(SoundSystem soundSystem) {
        this.soundSystem = soundSystem;
    }

    public Router getRouter() {
        return router;
    }

    public void setRouter(Router router) {
        this.router = router;
    }

    public Lights getLights() {
        return lights;
    }

    public void setLights(Lights lights) {
        this.lights = lights;
    }

    public VideoGame getGame() {
        return game;
    }

    public void setGame(VideoGame game) {
        this.game = game;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Snack getSnack() {
        return snack;
    }

    public void setSnack(Snack snack) {
        this.snack = snack;
    }
}
