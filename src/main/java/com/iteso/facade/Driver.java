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
        GameConsole xbox = new XBOXOne();
        GameController dualShock = new DualShock();
        PCController razer = new Razer();
        PCMonitor monitor = new SonyMonitor();
        PCMonitorAdapter monitorAdapter;
        PCControllerAdapter controllerAdapter;
        Lights lights = new EcoLights();
        Router linksys = new Linksys();
        SoundSystem bose = new Bose();
        TV tv = new SonyBravia();

        VideoGameFacade videoGameFacade = new VideoGameFacade(tv, ps4,dualShock,bose,linksys,lights);
        videoGameFacade.playOnlineGame("Fifa 14");
        videoGameFacade.stopPlayingGame();

        videoGameFacade = new VideoGameFacade(tv, xbox,dualShock,bose,linksys,lights);
        videoGameFacade.playOnlineGame("Gears Of Wars");

        videoGameFacade = new VideoGameFacade(tv, ps4,bose,lights,dualShock);
        videoGameFacade.playMovies("Inception");


        monitorAdapter = new PCMonitorAdapter(monitor);
        videoGameFacade = new VideoGameFacade(monitorAdapter, ps4,bose,lights, dualShock);
        videoGameFacade.playMovies("La vida es bella");


        controllerAdapter = new PCControllerAdapter(razer);
        videoGameFacade = new VideoGameFacade(tv, xbox,controllerAdapter,bose);
        videoGameFacade.playOnlineGame("Call of Duty");







    }

}
