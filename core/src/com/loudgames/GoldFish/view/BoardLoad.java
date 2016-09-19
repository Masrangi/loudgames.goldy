/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loudgames.GoldFish.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.loudgames.GoldFish.model.BackGround;
import com.loudgames.GoldFish.model.GoldFish;
import com.loudgames.GoldFish.model.Iceberg;
import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class BoardLoad {
    public static ArrayList<Iceberg> icebergs=new ArrayList();
//    public static ArrayList<Iceberg> asteroids = new ArrayList<Iceberg>(); 
    public static GoldFish theFish;
    public static int boardWidth;
    public static int boardHeight;
    public static BackGround backGround;
    public static BackGround backGround1;


    
    public BoardLoad(){
        boardWidth=Gdx.graphics.getWidth();
        boardHeight=Gdx.graphics.getHeight();
        theFish=new GoldFish(new Vector2(0,boardHeight/2));
        backGround=new BackGround(new Vector2(0,0));
     
    }
    
    public static void createIceberg(){
        System.out.println("1");
        icebergs.add(new Iceberg(new Vector2(1250,boardWidth/4)));
    }
    
    public void createVolcano(){
    
    }
 
    public int getBoardWidth() {
        return boardWidth;
    }

    public int getBoardHeight() {
        return boardHeight;
    }
}
