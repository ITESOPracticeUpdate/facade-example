package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.LaserLights;
import com.iteso.facade.interfaces.Lights;

/**
 * Created by Feelpaa on 24/11/2015.
 */


//add//////////////////////////////////////////////////

    /*
    El adapter es como sobre escribir un metodo de lo que implementa, es decir
    toma los metodos de la interfaz que implementa , en este caso de luces
    y le da la funcionalidad de laserlights a las de lucess
     */
public class LaserLigthsAdaptador implements Lights {
    LaserLights laserlights;

    public LaserLigthsAdaptador(LaserLights laserlights){
        this.laserlights = laserlights;
    }



    @Override
    public void on() {
        laserlights.kill();

    }

    @Override
    public void off() {
        laserlights.NoKill();

    }
}//LLAdapter
