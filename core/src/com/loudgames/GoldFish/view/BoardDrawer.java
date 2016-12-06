/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loudgames.GoldFish.view;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
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
    
//    private TextureAtlas fishAtlas;
//    private Animation animation;
    //
    long startTime = 0;
    int timepassed=0;
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
//        animation=new Animation(1/60f,fishAtlas.getRegions());
        
        
    }

    private void loadTextures() {
        fish=new Texture("fish1.png");
        iceberg=new Texture("iceberg.png");
        plank=new Texture("plank.png");
        background=new Texture("ocean.png");
        coin=new Texture("coins.png");
//        fishAtlas=new TextureAtlas("chalkFish.atlas");
    }
    
     public void paint(){
//     batch.setProjectionMatrix(camera.combined);
     batch.begin();
//   setCamera();  
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
     
     private void assignOcean(){
         count+=1;
      name="ocean"+count+".png";
      if(count==6)
      {
      count=0;
      }
     if(timepassed%10==0)
     {
     background=new Texture(name);
     }
     timepassed+=1;
     
     }
     
    public void drawGoldFish(){  
        if(theFish.isOnScreen()){
            assignfish();
        batch.draw(fish, theFish.getPosition().x, theFish.getPosition().y, 
            theFish.getWIDTH(), theFish.getHEIGHT());}

//    timepassed+=Gdx.graphics.getDeltaTime();
//        batch.draw(animation.getKeyFrame(timepassed, true),theFish.getPosition().x,theFish.getPosition().y);
        theFish.move();
    }

    
    public void drawBackground(){
    assignOcean();
        batch.draw(this.background,thebackground.getPosition().x,thebackground.getPosition().y,
            BoardLoad.boardWidth,BoardLoad.boardHeight);
    
    }

//    private void setCamera() {
////     if(theFish.getMovingState())
////        {   
////     camera.translate(2,0);
////     camera.update();
////    }
//////     thebackground.increasePosition();
//    }
    
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
