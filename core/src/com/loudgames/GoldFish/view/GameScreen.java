/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loudgames.GoldFish.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.loudgames.GoldFish.controllers.FishController;
import com.loudgames.GoldFish.controllers.GoldFishEscape;

/**
 *
 * @author Michael
 */
public class GameScreen implements Screen{
    final GoldFishEscape game;
    private BoardLoad board;
    private BoardDrawer gbd;
    FishController fishController;

    GameScreen(GoldFishEscape game) {
        this.game = game;
    }
    
    @Override
    public void show() {
        
        board=new BoardLoad();
        gbd=new BoardDrawer(false);
        fishController=new FishController();
        Gdx.input.setInputProcessor(fishController);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
	Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	gbd.paint();
    }

    @Override
    public void resize(int width, int height) {
//        gbd.setSize(width, height);
    }

    @Override
    public void pause() {
        
    }

    @Override
    public void resume() {
        
    }

    @Override
    public void hide() {
        
    }

    @Override
    public void dispose() {
        
    }
    
}
