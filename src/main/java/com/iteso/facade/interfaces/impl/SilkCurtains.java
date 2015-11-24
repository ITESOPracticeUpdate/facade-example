package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Curtains;

/**
 * Created by Aldo on 24/11/2015.
 */
public class SilkCurtains implements Curtains{
    @Override
    public void open() {
        System.out.println("Curtains are opened");
    }

    @Override
    public void close() {
        System.out.println("Curtains are closed");

    }
}
