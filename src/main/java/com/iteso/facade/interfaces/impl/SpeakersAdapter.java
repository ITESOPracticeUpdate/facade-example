package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.SoundSystem;
import com.iteso.facade.interfaces.Speakers;

/**
 * Created by Paloma on 24/11/2015.
 */
public class SpeakersAdapter implements SoundSystem {
    Speakers speakers;

    public SpeakersAdapter(Speakers speakers){
        this.speakers = speakers;
    }

    public void on() {
        speakers.on();
    }

    public void off() {
        speakers.off();
    }

    public void toOpticalEntry() {
        speakers.toOpticalEntry();
    }
}
