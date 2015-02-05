package com.lock.entities;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;

public class Tumbler {
	DriverPin dp;
	KeyPin kp;
	boolean picked = false;
	
	public Tumbler() {
		dp = new DriverPin();
		kp = new KeyPin();
	}
	
	public void draw(ShapeRenderer sr, int in, int x, int y) {
		int width = 20;
		int spacing = 5;
		x += in * (width + spacing);
		
		Vector2[] kpTaper = new Vector2[3];
		kpTaper[0] = new Vector2( x , y - 10);
		kpTaper[1] = new Vector2( x - (width / 2) , y );
		kpTaper[2] = new Vector2( x + (width / 2) , y );
		
		sr.setColor(Color.RED);
		sr.begin(ShapeType.Filled);
		sr.triangle(kpTaper[0].x, kpTaper[0].y, kpTaper[1].x, kpTaper[1].y, kpTaper[2].x, kpTaper[2].y);
		sr.end();
		
		Vector2[] kpShape = new Vector2[2];
		kpShape[0] = new Vector2( x , y );
		kpShape[1] = new Vector2( x , y + kp.getHeight() );
		
		sr.setColor(Color.RED);
		sr.begin(ShapeType.Filled);
		
		sr.rectLine(kpShape[0], kpShape[1], width);
		
		sr.end();
		
		Vector2[] dpShape = new Vector2[2];
		dpShape[0] = new Vector2 ( x , y + kp.getHeight());
		dpShape[1] = new Vector2 ( x , y + kp.getHeight() + dp.getHeight());
		
		sr.setColor(Color.BLUE);
		sr.begin(ShapeType.Filled);
		
		sr.rectLine(dpShape[0], dpShape[1], width);
		
		sr.end();
		
		Vector2[] springShape = new Vector2[2];
		springShape[0] = new Vector2 ( x , y + kp.getHeight() + dp.getHeight());
		springShape[1] = new Vector2 ( x , y + 70 );
		
		sr.setColor(Color.YELLOW);
		sr.begin(ShapeType.Filled);
		
		sr.rectLine(springShape[0], springShape[1], width - 10);
		
		sr.end();
	}
}
