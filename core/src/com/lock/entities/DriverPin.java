package com.lock.entities;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;


public class DriverPin {
	Vector2 pos;
	int height;
	float[] shape;
	public DriverPin(Vector2 pos) {
		this.pos = pos;
		height = 20;
		int width = 10;
		shape = new float[] {0 , 0, width, 20, width, 20 + height, -width, 20 + height, -width, 20};
	}
	
	public int getHeight() { return height; }
	
	public void draw(ShapeRenderer sr) {
		sr.translate(pos.x, pos.y, 0);
		sr.setColor(Color.WHITE);
		sr.begin(ShapeType.Line);		
		sr.polygon(shape);
		sr.end();
	}
}
