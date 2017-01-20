/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loudgames.GoldFish.controllers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.loudgames.GoldFish.view.MenuScreen;

/**
 *
 * @author Michael
 */
public class MenuController implements InputProcessor {
    
    public MenuController() {
        
    }

    @Override
    public boolean keyDown(int keycode) {
       
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
//        if(keycode==Input.Keys.ENTER){
//            gfe=new GoldFishEscape();
//          if(MenuScreen.selected==470){
//              MenuScreen.setGameScreen();
//          }
//          else if(MenuScreen.selected==370){
//              gfe.setLoadScreen();
//          }
//          else if(MenuScreen.selected==270){
//                Gdx.app.exit();
//          }
//        }
                  
        if(keycode==Input.Keys.DOWN){
            if(MenuScreen.selected!=270){
                MenuScreen.selected-=100;}}
        
        if(keycode==Input.Keys.UP){
            if(MenuScreen.selected!=470){
                MenuScreen.selected+=100;}}
        return false;
    }

    @Override
     public boolean keyTyped(char character) {
        
        return true;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return true;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return true;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return true;
    }

    @Override
    public boolean scrolled(int amount) {
        return true;
    }
    
}
