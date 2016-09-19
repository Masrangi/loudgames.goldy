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
public class BackGround {
    
    private Vector2 position = new Vector2();
    Vector2 velocity=new Vector2();
    private Rectangle bounds = new Rectangle();
    private boolean onScreen=true;

    private float movingAngle=0;
    
    private int boardWidth;
    private int boardHeight;
    private static final int HEIGHT=700;
    private static final int WIDTH=1200;
    
    
    //constructor
    public BackGround(Vector2 position){
       bounds.height=HEIGHT;
       bounds.width=WIDTH;
       
       boardWidth=BoardLoad.boardWidth;
       boardHeight=BoardLoad.boardHeight;
       
       this.velocity.add(3,0);
       this.position=position;
    }
    
    public void increasePosition(){
        position.x-=2;
    }

    public Vector2 getPosition() {
        return position;
    }
    
}
