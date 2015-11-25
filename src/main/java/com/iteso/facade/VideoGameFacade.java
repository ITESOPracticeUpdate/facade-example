package com.iteso.facade;

import com.iteso.facade.interfaces.*;
import com.iteso.facade.interfaces.impl.DVD;
import com.iteso.facade.interfaces.impl.PS3Game;

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
                           SoundSystem soundSystem,
                           Lights lights,
                           GameController controller){

        this.setTv(tv);
        this.setConsole(console);
        this.setSoundSystem(soundSystem);
        this.setLights(lights);
        this.setController(controller);
    }


    public VideoGameFacade(TV tv,
                           GameConsole console,
                           GameController controller,
                           SoundSystem soundSystem){

        this.setTv(tv);
        this.setConsole(console);
        this.setController(controller);
        this.setSoundSystem(soundSystem);

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

    public void playMovies(String name){
        System.out.println();
        System.out.println("Turning the system ON, lets whatch a movie xD");
        System.out.println();

        getTv().on();
        getTv().toHDMI();

        getConsole().on();
        getController().on();
        setMovie(new DVD(name));

        getSoundSystem().on();
        getSoundSystem().toOpticalEntry();


        getLights().off();

        getMovie().play();

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
}
