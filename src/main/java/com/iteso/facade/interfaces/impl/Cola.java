package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Snacks;

/**
 * Created by Nizath on 11/24/2015.
 */
public class Cola implements Snacks {
    public void get(){
        System.out.println("Cola is ready and cold");
    }
    public void serve(){
        System.out.println("Cola are served in a cup");
    }
}
