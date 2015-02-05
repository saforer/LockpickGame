package com.lock.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.lock.entities.Lock;
import com.lock.game.Game;
import com.lock.manager.ScreenManager;

public class PlayScreen implements Screen {
	ScreenManager sm;
	ShapeRenderer sr;
	
	Lock lock;
	int size = 5;
	int currentSelection = 0;
	
	public PlayScreen(ScreenManager sm) {
		this.sm = sm;
		
		sr = new ShapeRenderer();

		currentSelection = 0;
		
		lock = new Lock(size, new Vector2((Game.WIDTH / 2), (Game.HEIGHT / 2)));
	}
	
	public void show() {}
	
	public void render(float dt) {
		checkWin(lock);
		handleInput();
		draw();
	}
	
	void draw() {
		lock.draw(sr);
	}
	
	void handleInput() {
		if (Gdx.input.isKeyJustPressed(Input.Keys.LEFT) && currentSelection > 0) {
			currentSelection--;
		}
		if (Gdx.input.isKeyJustPressed(Input.Keys.RIGHT) && currentSelection < size - 1) {
			currentSelection++;
		}
		if (Gdx.input.isKeyJustPressed(Input.Keys.UP)) {
			lock.pick(currentSelection);
		}
	}
	
	void checkWin(Lock inLock) {
		if (lock.isOpen()) {
			System.out.println("Congratulations, You win");
		}
	}
	
	public void resize(int x, int y) {}
	public void resume() {}
	public void pause() {}
	public void hide() {}
	public void dispose() {}
}
