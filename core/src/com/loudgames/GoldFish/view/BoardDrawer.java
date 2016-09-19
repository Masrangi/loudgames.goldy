/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loudgames.GoldFish.view;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.loudgames.GoldFish.model.BackGround;
import com.loudgames.GoldFish.model.GoldFish;
import com.loudgames.GoldFish.model.Iceberg;
import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class BoardDrawer {
    private OrthographicCamera camera;
    private GoldFish theFish;
    private SpriteBatch batch;
    private Texture fish;
    private Texture iceberg;
    public static ArrayList<Iceberg> icebergs=new ArrayList();
    private Texture background;
    private Texture background1;
    private BackGround thebackground;
    private BackGround thebackground1;
    private int width;
    private int height;
    
    public BoardDrawer(boolean debug){
//        camera=new OrthographicCamera(1200,700 );
//        camera.position.set(camera.viewportWidth / 2f, camera.viewportHeight / 2f, 0);
//        camera.update();
        theFish=BoardLoad.theFish;
        batch=new SpriteBatch();
        thebackground=BoardLoad.backGround;
        thebackground1=BoardLoad.backGround1;
//        this.debug=debug;
        loadTextures();
    }

    private void loadTextures() {
        
        fish=new Texture("goldfish.png");
        iceberg=new Texture("index.jpg");
        background=new Texture("sea.jpg");
        background1=new Texture("sea1.jpg");
    }
    
     public void paint(){
//     batch.setProjectionMatrix(camera.combined);
     batch.begin();
     
//     setCamera();

        
     drawBackground();
     drawGoldFish();
     createObstacle();
     drawIceberg();
//     setMap();
     batch.end();
//     if(debug)
//         paintLines();
     
    }
     
    public void drawGoldFish(){  
        batch.draw(fish, theFish.getPosition().x, theFish.getPosition().y, 
            theFish.getWIDTH(), theFish.getHEIGHT());
    }
    
    public void drawBackground(){
        batch.draw(this.background,thebackground.getPosition().x,thebackground.getPosition().y,
            BoardLoad.boardWidth,BoardLoad.boardHeight);
    
    }

    private void setCamera() {
     if(theFish.getMovingState())
        {   
     camera.translate(2,0);
     camera.update();
    }
     thebackground.increasePosition();
    }
    
    private void setMap(){
    if(theFish.getMovingState())
        {     
    if(thebackground.getPosition().x<0){
    thebackground1.getPosition().x=1200;
    }
        }
    }

    private void drawIceberg() {
         icebergs=BoardLoad.icebergs;
        for(Iceberg x:icebergs){
        if(x.isOnScreen())
        {
        x.move();
        }
System.out.println(x.getPosition().x);
System.out.println(x.getPosition().y);

        batch.draw(iceberg, x.getPosition().x, x.getPosition().y, 
            x.getWIDTH(), x.getHEIGHT());
        }
         
    }

    private void createObstacle() {
        BoardLoad.createIceberg();
    }
}
