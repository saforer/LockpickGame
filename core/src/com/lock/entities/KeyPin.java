package com.lock.entities;

import com.badlogic.gdx.math.MathUtils;

public class KeyPin {
	int height;
	
	public KeyPin() {
		//base height
		height = 10;
		//additional height;
		height += MathUtils.random(1,10);
	}
	
	public int getHeight() { return height; }
}