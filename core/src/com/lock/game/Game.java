package com.lock.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.lock.manager.ScreenManager;


public class Game extends ApplicationAdapter {
	public static int WIDTH;
	public static int HEIGHT;
	
	OrthographicCamera cam;
		
	ScreenManager sm;
	
	
	public void create () {
		WIDTH = Gdx.graphics.getWidth();
		HEIGHT = Gdx.graphics.getHeight();
		
		cam = new OrthographicCamera(WIDTH, HEIGHT);
		cam.translate(WIDTH/2,HEIGHT/2);
		
		cam.update();
		
		
		sm = new ScreenManager();
	}

	public void render () {
		Gdx.gl.glClearColor(0,0,0,1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		sm.update(Gdx.graphics.getDeltaTime());
	}
}
