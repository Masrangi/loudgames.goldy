/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loudgames.GoldFish.model;

import com.badlogic.gdx.math.Vector2;
import java.awt.Rectangle;

/**
 *
 * @author Michael
 */
public class Iceberg{
    private static final int HEIGHT =35; 
    private static final int WIDTH =30;

    public static int getHEIGHT() {
        return HEIGHT;
    }

    public static int getWIDTH() {
        return WIDTH;
    }

    public static int getLevel() {
        return level;
    }
    
     private Vector2 position = new Vector2();
    private Rectangle bounds = new Rectangle();
    
    private boolean onScreen=true;

    private static int level;
    
    public Iceberg(Vector2 position){
       bounds.height=HEIGHT;
       bounds.width=WIDTH;
       
       this.position=position;
    }
    
    public void move(){
        if(onScreen){
     position.x-=3;
        }
        if(position.x<=0)
        {
        onScreen=false;
        }
    }

    public Vector2 getPosition() {
        return position;
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public boolean isOnScreen() {
        return onScreen;
    }
    }
    


