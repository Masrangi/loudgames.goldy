/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loudgames.GoldFish.model;

import com.badlogic.gdx.math.Vector2;

/**
 *
 * @author Michael
 */
public class BackGround extends Actors{

    //constructor
    public BackGround(Vector2 position){
       super(position);
       setWIDTH(700);
       setHEIGHT(1200);
    }

    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
