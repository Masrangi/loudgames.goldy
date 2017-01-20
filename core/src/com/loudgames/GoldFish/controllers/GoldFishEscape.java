/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loudgames.GoldFish.controllers;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.loudgames.GoldFish.view.GameScreen;
import com.loudgames.GoldFish.view.LoadScreen;
import com.loudgames.GoldFish.view.MenuScreen;



/**
 *
 * @author Michael
 */
public class GoldFishEscape extends Game {

    public SpriteBatch batch;
    @Override
    public void create() {
        batch=new SpriteBatch();
        this.setScreen(new MenuScreen(this));
    }
    
//    public void setGameScreen()
//    {
////        setScreen(new GameScreen());
//    }
//    public void setMenuScreen()
//    {
////        setScreen(new MenuScreen());
//    }
//    
//    public void setLoadScreen()
//    {
////        setScreen(new LoadScreen());
//    }
    
    @Override
    public void render(){
        super.render();
    }
    
    @Override
    public void dispose(){
        batch.dispose();
    }
}
