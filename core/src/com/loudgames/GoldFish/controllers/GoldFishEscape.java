/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loudgames.GoldFish.controllers;

import com.badlogic.gdx.Game;
import com.loudgames.GoldFish.view.GameScreen;



/**
 *
 * @author Michael
 */
public class GoldFishEscape extends Game {

    @Override
    public void create() {
        setScreen(new GameScreen());
    }
    
}
