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
        GameController dualShock = new DualShock();
        Lights lights = new EcoLights();
        Router linksys = new Linksys();
        SoundSystem bose = new Bose();
        TV tv = new SonyBravia();

        //agregar ps4 y xbox one
        GameConsole ps4 = new PS4();
        GameConsole xboxOne = new XBOXONE();



        VideoGameFacade videoGameFacade = new VideoGameFacade(tv, ps3,dualShock,bose,linksys,lights);

        videoGameFacade.playOnlineGame("Fifa 14");

        videoGameFacade.stopPlayingGame();

         videoGameFacade = new VideoGameFacade(tv, xbox,dualShock,bose,linksys,lights);

        videoGameFacade.playOnlineGame("Gears Of Wars");

    }

}
