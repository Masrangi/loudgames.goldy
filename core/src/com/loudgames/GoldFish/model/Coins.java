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
public class Coins extends Actors{
    private int bonusPerCoin=1;

    public Coins(Vector2 position){
    super(position);
    setWIDTH(45);
    setHEIGHT(60);
    setSpeed(2);
    }
    
    public int getBonusPerCoin() {
        return bonusPerCoin;
    }

    public void setBonusPerCoin(int bonusPerCoin) {
        bonusPerCoin = bonusPerCoin;
    }
    
    @Override
    public void move(){
        if(isOnScreen()){      
        setBounds();
        BoardLoad.theFish.setBounds();
        Rectangle fishBounds=BoardLoad.theFish.getBounds();
        if(fishBounds.intersects(getBounds())){
        setOnScreen(false);
        System.out.println(isOnScreen());
        BoardLoad.coinPoints+=bonusPerCoin;
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
