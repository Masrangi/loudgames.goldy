/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loudgames.GoldFish.model;

import com.badlogic.gdx.math.Vector2;
import com.loudgames.GoldFish.view.BoardLoad;
import java.awt.Rectangle;

/**
 *
 * @author Michael
 */
public class Plank extends Actors{
    
    
    public Plank(Vector2 position){
    super(position);
    setWIDTH(80);
    setHEIGHT(60);
    setSpeed(2);
    }

    @Override
    public void move() {
        if(isOnScreen()){
        setBounds();   
        BoardLoad.theFish.setBounds();
        Rectangle fishBounds=BoardLoad.theFish.getBounds();
        if(fishBounds.intersects(getBounds())){
        setOnScreen(false);
        BoardLoad.theFish.setPosition(Vector2.Zero);
        BoardLoad.theFish.setOnScreen(false);
        }
        else{
        getPosition().x-=getSpeed();
        }
        }
        
        if(getPosition().x<=-getWIDTH())
        {
         setOnScreen(false);
        }
    }
}
