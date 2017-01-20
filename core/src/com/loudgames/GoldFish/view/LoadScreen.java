/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loudgames.GoldFish.view;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.loudgames.GoldFish.controllers.GoldFishEscape;

/**
 *
 * @author Michael
 */
public class LoadScreen implements Screen {
    
    final GoldFishEscape game;
    private SpriteBatch batch;
    ShapeRenderer shapeRenderer;
    private BitmapFont text;

    public LoadScreen(GoldFishEscape game) {
        this.game = game;
    }
   

    
    @Override
    public void show() {
        batch=new SpriteBatch();
        text=new BitmapFont();
        shapeRenderer=new ShapeRenderer();
    }

    @Override
    public void render(float delta) {
         Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
	Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.WHITE);
        shapeRenderer.circle(550, 400, 100);
        shapeRenderer.end();
        
        batch.begin();
        text.setColor(Color.RED);
        text.draw(batch, "Loading...", 500, 400);
        batch.end();
	
    }

    @Override
    public void resize(int width, int height) {
        
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
