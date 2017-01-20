/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loudgames.GoldFish.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.loudgames.GoldFish.controllers.GoldFishEscape;
import com.loudgames.GoldFish.controllers.MenuController;

/**
 *
 * @author Michael
 */
public class MenuScreen implements Screen {
    
    private final GoldFishEscape game;
//    private SpriteBatch batch;
//    private Texture whitebg;
//    MenuController menuController;
    ShapeRenderer shapeRenderer;
    private BitmapFont play;
    private BitmapFont settings;
    private BitmapFont quit;
    public static int selected;
    
//    private static MenuScreen ms=null;
    
//    public static Screen getMenuScreen(){
//        if(ms==null){
//        ms=new MenuScreen(game);
//        }
//        return ms;
//    }

    public MenuScreen(GoldFishEscape game) {
        this.game = game;
    }
    
    
    
    @Override
    public void show() {
//        batch=new SpriteBatch();

        play=new BitmapFont();
        settings=new BitmapFont();
        quit=new BitmapFont();
//        menuController=new MenuController();
        shapeRenderer=new ShapeRenderer();
//        Gdx.input.setInputProcessor(menuController);
        selected=470;
    }
    
    public void setGameScreen()
    {
        game.setScreen(new GameScreen(game));
        dispose();
    }
        
    public void setLoadScreen()
    {
        game.setScreen(new LoadScreen(game));
        dispose();
    }

    @Override
    public void render(float delta) {
         Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
	Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        shapeRenderer.begin(ShapeType.Filled);
        shapeRenderer.setColor(Color.WHITE);
        shapeRenderer.rect(450, selected, 160, 50);
        shapeRenderer.end();
        
         game.batch.begin();
        play.draw(game.batch, "PLAY", 500, 500);
        settings.draw(game.batch, "SETTINGS", 500, 400);
        quit.draw(game.batch, "QUIT", 500, 300);
        game.batch.end();
        
            if(Gdx.input.isKeyPressed(Keys.ENTER)){
          if(selected==470){
              setGameScreen();
          }
          else if(selected==370){
              setLoadScreen();
          }
          else if(selected==270){
                Gdx.app.exit();
          }
        }
                  
        if(Gdx.input.isKeyJustPressed(Keys.DOWN)){
            if(MenuScreen.selected!=270){
                MenuScreen.selected-=100;}}
        
        if(Gdx.input.isKeyPressed(Keys.UP)){
            if(MenuScreen.selected!=470){
                MenuScreen.selected+=100;}}
	
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
//       batch.dispose();
       shapeRenderer.dispose();
       play.dispose();
       settings.dispose();
       quit.dispose();
    }

    public GoldFishEscape getGame() {
        return game;
    }
    
    
}
