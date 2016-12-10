/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loudgames.GoldFish.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.loudgames.GoldFish.model.Actors;
import com.loudgames.GoldFish.model.BackGround;
import com.loudgames.GoldFish.model.GoldFish;

/**
 *
 * @author Michael
 */
public class BoardDrawer {
//    private OrthographicCamera camera;
    
    private SpriteBatch batch;
    private Texture fish;
    private Texture fish1;
    private Texture fish2;
    private Texture iceberg;
    private Texture plank;
    private Texture coin;
    private Texture background;
    
    private String name;
    
    private BackGround thebackground;
    private String ocean;
    private GoldFish theFish;
    
    
    
    private static int count=0;
    private static int countfish=0;
    
    private TextureAtlas oceanAtlas;
    private Animation animation;
    private float elapsedTime = 0;
    
    private TextureAtlas fishAtlas;
    private Animation animationFish;
    
    //
    private BitmapFont score; 
    
    public BoardDrawer(boolean debug){
//        camera=new OrthographicCamera(1200,700 );
//        camera.position.set(camera.viewportWidth / 2f, camera.viewportHeight / 2f, 0);
//        camera.update();
        theFish=BoardLoad.theFish;
        batch=new SpriteBatch();
        thebackground=BoardLoad.backGround;
//      this.debug=debug;
        loadTextures();
        startScoreBoard();
    }

    private void loadTextures() {
        iceberg=new Texture("iceberg.png");
        plank=new Texture("plank.png");
        coin=new Texture("coins.png");
        
        oceanAtlas = new TextureAtlas("ocean.pack");
        animation = new Animation(1/7f, oceanAtlas.getRegions());
        fishAtlas = new TextureAtlas("fish.pack");
        animationFish = new Animation(1/7f, fishAtlas.getRegions());
    }
    
     public void paint(){
     batch.begin();
     BoardLoad.createObstacle();
     drawBackground();
     drawGoldFish();
     drawIceberg();
     drawCoin();
     drawPlank();
     drawScore();
     batch.end();
//     if(debug)
//         paintLines();
     
    }
     
     private void assignfish(){
           countfish++;
      if(countfish<=15)
      {
      fish=new Texture("fish1.png");
      }
      else if(countfish>15 && countfish<30)
     {
     fish=new Texture("fish2.png");
     }
     else
     {
     countfish=0;
     }
     }
     
    public void drawGoldFish(){  
        if(theFish.isOnScreen()){
            assignfish();
        batch.draw(fish, theFish.getPosition().x, theFish.getPosition().y, 
            theFish.getWIDTH(), theFish.getHEIGHT());

//        batch.draw(animationFish.getKeyFrame(timepassed, true),theFish.getPosition().x,theFish.getPosition().y,
//                theFish.getWIDTH(),theFish.getHEIGHT());
        theFish.move();}
        
    }

    
    public void drawBackground(){
        elapsedTime += Gdx.graphics.getDeltaTime();
        batch.draw(animation.getKeyFrame(elapsedTime, true),0,0,this.thebackground.getHEIGHT(),this.thebackground.getWIDTH());
    
    }

    
    private void drawIceberg() {
        for(Actors x:BoardLoad.icebergs){
            if(x.isOnScreen()){
        batch.draw(iceberg, x.getPosition().x, x.getPosition().y, 
            x.getWIDTH(), x.getHEIGHT());
            x.move();
        }    
        } 
    }
    
     private void drawPlank() {
        for(Actors x:BoardLoad.planks){
            if(x.isOnScreen()){
        batch.draw(plank, x.getPosition().x, x.getPosition().y, 
            x.getWIDTH(), x.getHEIGHT());
            x.move();
        }
        } 
    }
    
    private void drawCoin() {
        for(Actors x:BoardLoad.coins){
            if(x.isOnScreen()){
        batch.draw(coin, x.getPosition().x, x.getPosition().y, 
            x.getWIDTH(), x.getHEIGHT());
            x.move();
            }
             
        } 
    }
    
  

    private void drawScore() {
        score.draw(batch, "Score= "+BoardLoad.coinPoints, 10, BoardLoad.boardHeight-10);
    }

    private void startScoreBoard() {
        score=new BitmapFont();
        score.setColor(Color.WHITE);
    }

  
}
