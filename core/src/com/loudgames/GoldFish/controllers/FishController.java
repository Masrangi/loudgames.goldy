/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loudgames.GoldFish.controllers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.loudgames.GoldFish.view.BoardLoad;

/**
 *
 * @author Michael
 */
public class FishController implements InputProcessor{

    @Override
    public boolean keyDown(int keycode) {
        if(Input.Keys.ENTER==keycode){
          BoardLoad.theFish.setMovingState(true);
        }
        if(BoardLoad.theFish.getMovingState()){
            if(Input.Keys.UP==keycode){
              BoardLoad.theFish.setPositionUp();
            }
            if(Input.Keys.DOWN==keycode){
              BoardLoad.theFish.setPositionDown();
            }
        }
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
    
}
