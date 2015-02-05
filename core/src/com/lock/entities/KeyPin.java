package com.lock.entities;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;

public class KeyPin {
	Vector2 pos;
	int height;
	float[] shape;
	
	public KeyPin(Vector2 pos) {
		this.pos = pos;
		height = 10;
		//additional height;
		height += MathUtils.random(1,10);
		
		setShape();
	}
	
	public int getHeight() { return height; }
	
	void setShape() {
		int width = 10;
		
		
	}
	
	public void draw(ShapeRenderer sr) {
		
	}
}