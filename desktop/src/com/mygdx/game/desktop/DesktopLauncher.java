package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.loudgames.GoldFish.controllers.GoldFishEscape;

public class DesktopLauncher {
	public static void main (String[] arg) {
                 LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
      System.setProperty("org.lwjgl.opengl.Display.allowSoftwareOpenGL", "true");
      cfg.title = "GoldFishEscape";
      //cfg.useGL20 = false;
      cfg.width = 1200;
      cfg.height = 700;
      new LwjglApplication(new GoldFishEscape(),cfg);
	}
}
