package com.iteso.facade;

import com.iteso.facade.interfaces.*;
import com.iteso.facade.interfaces.impl.*;

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
    private Sofa sofa;
    private PCMonitor monitor;

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

    public VideoGameFacade(PCMonitor monitor,
                           GameConsole console,
                           GameController controller,
                           SoundSystem soundSystem,
                           Lights lights,
                           Sofa sofa){
        this.setMonitor(monitor);
        this.setConsole(console);
        this.setController(controller);
        this.setSoundSystem(soundSystem);
        this.setLights(lights);
        this.setSofa(sofa);
    }
    public VideoGameFacade(TV tv,
                           GameConsole console,
                           SoundSystem soundSystem,
                           Router router,
                           Lights lights){
        this.setTv(tv);
        this.setConsole(console);
        this.setSoundSystem(soundSystem);
        this.setRouter(router);
        this.setLights(lights);
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

    public void playMovieOnPCMonitor(String movieName){
        System.out.println("Turning the movie player ON, this may take some time");
        System.out.println();
        setMovie(new DVDMovie(movieName));
        VideoGame facadeMovie = new MovieAdapter(getMovie());
        TV facadeMonitor = new PCMonitorAdapter(getMonitor());

        facadeMonitor.on();
        facadeMonitor.toHDMI();

        getConsole().on();
        getConsole().insertGame(facadeMovie);

        getSoundSystem().on();
        getSoundSystem().toOpticalEntry();

        getLights().off();

        getSofa().beConfortable();

        getMovie().play();
        System.out.println();
    }

    public void stopPlayingMovieOnPCMonitor(){
        System.out.println();
        System.out.println("Turning the system OFF, this may take some time");
        System.out.println();
        getLights().on();
        getMonitor().off();
        getConsole().off();
        getSoundSystem().off();
    }

    public void playOnlineMovie(String movieName){
        System.out.println("Turning the movie player ON, this may take some time");
        System.out.println();
        Movie movie = new OnlineMovie(movieName);

        getTv().on();
        getTv().toHDMI();

        getConsole().on();
        getConsole().runOnlineVideoStreaming(movie);

        getSoundSystem().on();
        getSoundSystem().toOpticalEntry();

        getRouter().on();
        getRouter().checkInternet();

        getLights().off();

        System.out.println();
    }

    public void stopPlayingOnlineMovie(){
        System.out.println();
        System.out.println("Turning the system OFF, this may take some time");
        System.out.println();
        getLights().on();
        getTv().off();
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

    public Sofa getSofa() { return sofa; }

    public void setSofa(Sofa sofa) { this.sofa = sofa; }

    public PCMonitor getMonitor() { return monitor; }

    public void setMonitor(PCMonitor monitor) { this.monitor = monitor; }
}
