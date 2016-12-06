/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loudgames.GoldFish.controllers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.loudgames.GoldFish.model.GoldFish;
import com.loudgames.GoldFish.view.BoardLoad;

/**
 *
 * @author Michael
 */
public class FishController implements InputProcessor{

    @Override
    public boolean keyDown(int keycode) {
            if(Input.Keys.UP==keycode){
              BoardLoad.theFish.setPositionUp();
            }
            else if(Input.Keys.DOWN==keycode){
              BoardLoad.theFish.setPositionDown();
            }
            else if(Input.Keys.RIGHT==keycode){
                BoardLoad.theFish.setMovingState(GoldFish.FORWARD);
              BoardLoad.theFish.setPositionForward();
            }
            else if(Input.Keys.LEFT==keycode){
                BoardLoad.theFish.setMovingState(GoldFish.BACKWARD);
              BoardLoad.theFish.setPositionBackward();
            }
//        }
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
            if(Input.Keys.RIGHT==keycode||Input.Keys.LEFT==keycode){
                BoardLoad.theFish.setMovingState(GoldFish.NEUTRAL);
            }
        return true;
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
