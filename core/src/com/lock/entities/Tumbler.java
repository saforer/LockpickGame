package com.lock.entities;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

public class Tumbler {

	Vector2 pos;
	DriverPin dp;
	KeyPin kp;
	boolean picked = false;
	
	public Tumbler(Vector2 pos) {
		this.pos = pos;
		kp = new KeyPin(pos);
		dp = new DriverPin(new Vector2(pos.x, pos.y + kp.getHeight()));
	}
	
	public void draw(ShapeRenderer sr) {
		kp.draw(sr);
		dp.draw(sr);
	}
}
