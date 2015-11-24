package com.iteso.facade.interfaces.impl;
import com.iteso.facade.interfaces.Snacks;
/**
 * Created by Nizath on 11/24/2015.
 */
public class Sabritas implements Snacks {
   public void get(){
       System.out.println("Sabritas Snacks are ready");
    }
    public void serve(){
        System.out.println("Sabritas Snacks are served in a bowl");
    }
}
