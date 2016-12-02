/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loudgames.GoldFish.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.TimeUtils;
import com.loudgames.GoldFish.model.Actors;
import com.loudgames.GoldFish.model.BackGround;
import com.loudgames.GoldFish.model.Coins;
import com.loudgames.GoldFish.model.GoldFish;
import com.loudgames.GoldFish.model.Iceberg;
import com.loudgames.GoldFish.model.Plank;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Michael
 */
public class BoardLoad {
    public static ArrayList<Actors> icebergs=new ArrayList();
    public static ArrayList<Actors> planks=new ArrayList();
    public static ArrayList<Actors> coins=new ArrayList();
    public static ArrayList<String> actors=new ArrayList();
    public static GoldFish theFish;
    public static int boardWidth;
    public static int boardHeight;
    public static BackGround backGround;
    public static int[] positionLevels =new int[3];
    public static int coinPoints=0;
    static long startTime = 0;

    
    
    public BoardLoad(){
        boardWidth=Gdx.graphics.getWidth();
        boardHeight=Gdx.graphics.getHeight();
        positionLevels[0]=boardHeight-boardHeight/4;
        positionLevels[1]=boardHeight/2;
        positionLevels[2]=boardHeight/4;
        theFish=new GoldFish(new Vector2(0,positionLevels[1]));
        backGround=new BackGround(new Vector2(0,0));
        
        addActors();
        startTime = TimeUtils.nanoTime();
    }
    
      private void addActors(){
        actors.add("Nothing");
        actors.add("Nothing");
        actors.add("Coin");
        actors.add("Iceberg");
        actors.add("Coin");
        actors.add("Plank");
//        actors.add("Nothing");
//        actors.add("Coin");

    }
      
      public static void createObstacle() {
        if (TimeUtils.timeSinceNanos(startTime) > 1000000000) 
        { 
        BoardLoad.createActors(BoardLoad.actors.get(new Random().nextInt(actors.size())));
        BoardLoad.coinPoints+=1;
        startTime = TimeUtils.nanoTime();
        }
        
    }
      
      private static void createActors(String name){
        if(name.equals("Iceberg"))
            createIceberg();
        else if(name.equals("Coin"))
            createCoin();
        else if(name.equals("Plank"))
            createPlank();
    }
      
    private static void createCoin() {
       coins.add(new Coins(new Vector2(1250,positionLevels[(new Random()).nextInt(positionLevels.length)])));
    }
    
    private static void createIceberg(){
        icebergs.add(new Iceberg(new Vector2(1250,positionLevels[(new Random()).nextInt(positionLevels.length)])));
    }
    
    private static void createPlank(){
        planks.add(new Plank(new Vector2(1250,positionLevels[(new Random()).nextInt(positionLevels.length)])));
    }
    
//    public void createVolcano(){
//        planks.add(new Plank(new Vector2(1250,positionLevels[(new Random()).nextInt(positionLevels.length)])));
//    }
 
    public int getBoardWidth() {
        return boardWidth;
    }

    public int getBoardHeight() {
        return boardHeight;
    }
}
