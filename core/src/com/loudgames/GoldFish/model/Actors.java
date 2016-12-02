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
public abstract class Actors {    
    private Vector2 position = new Vector2();
    private Rectangle bounds = new Rectangle();
    
    private boolean onScreen=true;
    
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    private static int boardWidth;
    private static int boardHeight;
    private int HEIGHT;
    private int WIDTH;
    
    public Actors(Vector2 position){
    this.position=position;
    boardWidth=BoardLoad.boardWidth;
    boardHeight=BoardLoad.boardHeight;
    }

    /**
     *
     */
    public abstract void move();

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public void setBounds(Rectangle bounds) {
        this.bounds = bounds;
    }
    
    public void setBounds() {
        bounds.width=WIDTH;
        bounds.height=HEIGHT;
        bounds.x=(int)this.position.x;
        bounds.y=(int) this.position.y; 
        
    }
    
    public boolean isOnScreen() {
        return onScreen;
    }

    public void setOnScreen(boolean onScreen) {
        this.onScreen = onScreen;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public void setHEIGHT(int HEIGHT) {
        this.HEIGHT = HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public void setWIDTH(int WIDTH) {
        this.WIDTH = WIDTH;
    }
    
        public static int getBoardWidth() {
        return boardWidth;
    }

    public static void setBoardWidth(int aBoardWidth) {
        boardWidth = aBoardWidth;
    }

    public static int getBoardHeight() {
        return boardHeight;
    }

    public static void setBoardHeight(int aBoardHeight) {
        boardHeight = aBoardHeight;
    }
    
}
