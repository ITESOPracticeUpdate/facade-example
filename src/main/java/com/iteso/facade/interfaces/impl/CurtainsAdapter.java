package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Curtains;
import com.iteso.facade.interfaces.Lights;

/**
 * Created by Aldo on 24/11/2015.
 */
public class CurtainsAdapter implements Lights{

    Curtains curtains;

    public CurtainsAdapter(Curtains curtains){this.curtains = curtains;}

    @Override
    public void on() {
        curtains.open();
    }

    @Override
    public void off() {
        curtains.close();
    }
}
