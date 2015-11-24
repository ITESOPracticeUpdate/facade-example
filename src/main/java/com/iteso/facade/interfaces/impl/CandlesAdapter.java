package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Candles;
import com.iteso.facade.interfaces.Lights;

/**
 * Created by WolfBloodDude on 24/11/15.
 */
public class CandlesAdapter implements Lights {
    Candles candles;

    public CandlesAdapter(Candles candles) {
        this.candles = candles;
    }

    @Override
    public void on() {
        candles.on();
    }

    @Override
    public void off() {
        candles.off();
    }
}
