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
public class GoldFish {


     Vector2 position = new Vector2();
    Vector2 velocity=new Vector2();
    private Rectangle bounds = new Rectangle();
    
    private boolean onScreen=true;

    private float movingAngle=0;
    
    private int boardWidth;
    private int boardHeight;
    private static final int HEIGHT=80;
    private static final int WIDTH=100;
    
    private float positionYLL;
    private static boolean movingState;
    
    //constructor
    public GoldFish(Vector2 position){
       bounds.height=HEIGHT;
       bounds.width=WIDTH;
       
       boardWidth=BoardLoad.boardWidth;
       boardHeight=BoardLoad.boardHeight;
       
       this.velocity.add(3,0);
       this.position=position;
       this.positionYLL=boardHeight/4;
    }
    
    public void increaseXPos(double incAmt){this.position.x+=incAmt;}
//    public void increaseYPos(double incAmt){this.position.y+=incAmt;}
    
    public void increaseXVelocity(double incVelocity){
            this.velocity.x+=incVelocity;}
//    public void increaseYVelocity(double incVelocity){
//            this.velocity.y+=incVelocity;}
    
    public void move(){
        increaseXPos(this.velocity.x);
    }
    
    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public Vector2 getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector2 velocity) {
        this.velocity = velocity;
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public void setBounds(Rectangle bounds) {
        this.bounds = bounds;
    }

    public boolean isOnScreen() {
        return onScreen;
    }

    public void setOnScreen(boolean onScreen) {
        this.onScreen = onScreen;
    }

    public float getMovingAngle() {
        return movingAngle;
    }

    public void setMovingAngle(float movingAngle) {
        this.movingAngle = movingAngle;
    }

    public int getBoardWidth() {
        return boardWidth;
    }

    public void setBoardWidth(int boardWidth) {
        this.boardWidth = boardWidth;
    }

    public int getBoardHeight() {
        return boardHeight;
    }

    public void setBoardHeight(int boardHeight) {
        this.boardHeight = boardHeight;
    }
    
    public int getHEIGHT() {
        return HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public void setPositionUp() {
        if(this.position.y<(positionYLL*3))
        {
            this.position.y+=positionYLL;}
    }

    public void setPositionDown() {
        if(this.position.y>positionYLL)
        {this.position.y-=positionYLL;}
    }

    public float getPositionYBoundary() {
        return positionYLL;
    }

    public void setPositionYBoundary(float positionYBoundary) {
        this.positionYLL = positionYBoundary;
    }
    
    public boolean getMovingState() {
        return movingState;
    }

    public void setMovingState(boolean aMovingState) {
        movingState = aMovingState;
    }
}
