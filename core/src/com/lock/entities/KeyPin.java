package com.lock.entities;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Polygon;
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
		
		shape = new float[] {0 , 0, width, 20, width, 20 + height, -width, 20 + height, -width, 20};
	}
	
	public void draw(ShapeRenderer sr) {
		Polygon keypoly = new Polygon(shape);
		
		keypoly.setPosition(pos.x,pos.y);
		
		sr.begin(ShapeType.Line);
		sr.polygon(keypoly.getTransformedVertices());
		sr.end();
	}
}