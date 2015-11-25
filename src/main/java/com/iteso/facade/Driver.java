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
        GameConsole ps3 = new PS3();
        GameConsole xbox = new XBOX();
        GameConsole xboxOne = new XBOX_ONE();
        GameConsole ps4 = new PS4();
        GameController dualShock = new DualShock();
        Lights lights = new EcoLights();
        Router linksys = new Linksys();
        SoundSystem bose = new Bose();
        TV tv = new SonyBravia();
        PCMonitor pcMonitor = new SONYMonitor();
        Sofa recliner = new Recliner();

        VideoGameFacade videoGameFacade = new VideoGameFacade(tv, ps3,dualShock,bose,linksys,lights);
        videoGameFacade.playOnlineGame("Fifa 14");
        videoGameFacade.stopPlayingGame();
        videoGameFacade = new VideoGameFacade(tv, xbox,dualShock,bose,linksys,lights);
        videoGameFacade.playOnlineGame("Gears Of Wars");

        VideoGameFacade videoGameFacade1 = new VideoGameFacade(pcMonitor, xboxOne, dualShock, bose, lights, recliner);
        videoGameFacade1.playMovieOnPCMonitor("Star Wars: Episode V! - Return of the Jedi");
        videoGameFacade1.stopPlayingMovieOnPCMonitor();

        VideoGameFacade videoGameFacade2 = new VideoGameFacade(tv, ps4, bose, linksys, lights);
        videoGameFacade2.playOnlineMovie("The Tigger movie");
        videoGameFacade2.stopPlayingOnlineMovie();

    }

}
