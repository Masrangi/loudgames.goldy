/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loudgames.GoldFish.model;

import com.badlogic.gdx.math.Vector2;
import com.loudgames.GoldFish.view.BoardLoad;

/**
 *
 * @author Michael
 */
public class GoldFish extends Actors{
    
    private static boolean movingState;
    
    //constructor
    public GoldFish(Vector2 position){
        super(position);
        setWIDTH(110);
        setHEIGHT(90);
        this.setSpeed(2);
    }
    

    @Override
    public void move(){
        
    }
    
    

    public void setPositionUp() {
       if(BoardLoad.positionLevels[2]==getPosition().y)
       {
       getPosition().y=BoardLoad.positionLevels[1];
       }
       else if(BoardLoad.positionLevels[1]==getPosition().y)
       {
       getPosition().y=BoardLoad.positionLevels[0];
       }
    }

    public void setPositionDown() {
       if(BoardLoad.positionLevels[0]==getPosition().y)
       {
       getPosition().y=BoardLoad.positionLevels[1];
       }
       else if(BoardLoad.positionLevels[1]==getPosition().y)
       {
       getPosition().y=BoardLoad.positionLevels[2];
       }
    }
    
    public void setPositionForward() {
       getPosition().x+=getSpeed();
    }
    
    public void setPositionBackward() {
      getPosition().x-=getSpeed();
    }
 
    
    public boolean getMovingState() {
        return movingState;
    }

    public void setMovingState(boolean aMovingState) {
        movingState = aMovingState;
    }
}
