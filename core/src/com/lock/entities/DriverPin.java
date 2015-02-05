package com.lock.entities;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Vector2;


public class DriverPin {
	Vector2 pos;
	int height;
	float[] shape;
	public DriverPin(Vector2 pos) {
		this.pos = pos;
		height = 20;

		setShape();
	}
	
	void setShape() {
		int width = 10;
		
		shape = new float[] {width, 0, width, height, -width, height, -width, 0};
	}
	
	public int getHeight() { return height; }
	
	public void draw(ShapeRenderer sr) {
		Polygon dripoly = new Polygon(shape);
		
		dripoly.setPosition(pos.x,pos.y);
		
		sr.begin(ShapeType.Line);
		sr.polygon(dripoly.getTransformedVertices());
		sr.end();
	}
}
