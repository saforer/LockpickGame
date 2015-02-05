package com.lock.manager;

import com.badlogic.gdx.Screen;
import com.lock.screen.PlayScreen;

public class ScreenManager {
	Screen currentScreen;
	
	public ScreenManager() {
		setScreen(Screens.MAINSCREEN);
	}
	
	public void setScreen(Screens inScreen) {
		if (currentScreen != null) currentScreen.dispose();
		
		currentScreen = findScreen(inScreen);
	}
	
	public Screen findScreen(Screens inScreen) {
		switch (inScreen) {
			default:
				return new PlayScreen(this);
		}
	}
	
	public void update(float dt) {
		currentScreen.render(dt);
	}
}
