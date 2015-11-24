package com.iteso.facade;

import com.iteso.facade.interfaces.*;
import com.iteso.facade.interfaces.impl.PS4Game;
import com.iteso.facade.interfaces.impl.PurpleRayMovie;

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
    private PurpleRayPlayer purpleRayPlayer;
    private Movies movies;

    public VideoGameFacade(TV tv,
                           GameConsole console,
                           GameController controller,
                           SoundSystem soundSystem,
                           Router router,
                           Lights lights) {
        this.setTv(tv);
        this.setConsole(console);
        this.setController(controller);
        this.setSoundSystem(soundSystem);
        this.setRouter(router);
        this.setLights(lights);
    }

    public VideoGameFacade(TV tv, PurpleRayPlayer purpleRayPlayer, SoundSystem soundSystem, Lights lights) {
        setTv(tv);
        setPurpleRayPlayer(purpleRayPlayer);
        setSoundSystem(soundSystem);
        setLights(lights);
    }

    public VideoGameFacade(TV tv, PurpleRayPlayer purpleRayPlayer) {
        setTv(tv);
        setPurpleRayPlayer(purpleRayPlayer);


    }


    public void playOnlineGame(String gameName) {

        System.out.println("Turning the system ON, this may take some time");
        System.out.println();

        getTv().on();
        getTv().toHDMI();

        getConsole().on();
        getController().on();
        setGame(new PS4Game(gameName));
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

    public void stopPlayingGame() {

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

    public void playMovies(String movieName) {
        System.out.println("Turning the system ON, this may take some time");
        System.out.println();

        getTv().on();
        getTv().toHDMI();

        getPurpleRayPlayer().on();
        setMovies(new PurpleRayMovie(movieName));
        getPurpleRayPlayer().insertMovie(getMovies());

        getSoundSystem().on();
        getSoundSystem().toOpticalEntry();

        getLights().off();

        getMovies().play();
        System.out.println();
    }

    public void stopPlayingMovies() {
        System.out.println();
        System.out.println("Turning the system OFF, this may take some time");
        System.out.println();

        getLights().on();
        getTv().off();
        getPurpleRayPlayer().off();
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

    public PurpleRayPlayer getPurpleRayPlayer() {
        return purpleRayPlayer;
    }

    public void setPurpleRayPlayer(PurpleRayPlayer purpleRayPlayer) {
        this.purpleRayPlayer = purpleRayPlayer;
    }

    public Movies getMovies() {
        return movies;
    }

    public void setMovies(Movies movies) {
        this.movies = movies;
    }
}
