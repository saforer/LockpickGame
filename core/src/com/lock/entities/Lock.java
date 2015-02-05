package com.lock.entities;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.MathUtils;

public class Lock {
	List<Tumbler> tumblerList = new ArrayList<Tumbler>();
	int[] order; 
	
	public Lock(int size) {
		fill(order, size);
		for (int i = 0; i < size; i++) {
			tumblerList.add(new Tumbler());
		}
	}
	
	public void draw(ShapeRenderer sr, int x, int y) {
		int i = 0;
		for (Tumbler tumbler : tumblerList) {
			tumbler.draw(sr, i, x, y);
			i++;
		}
	}
	
	int currentPicked() {
		int output = 0;
		for (Tumbler tumbler : tumblerList) {
			if (tumbler.picked) output++;
		}
		return output;
	}
	
	public void pick(int currentSelection) {	
		if(order[currentSelection] == currentPicked()) {
			tumblerList.get(currentSelection).picked = true;
		}
		
	}
	
	public boolean isOpen() {
		for (Tumbler tumbler : tumblerList) {
			if (!tumbler.picked) {
				return false;
			}
		}
		
		return true;
	}
	
	public void fill(int[] inOrder, int inSize) {
		order = new int[inSize];
		for (int i = 0; i < inSize; i++) {
			order[i] = i;
		}
		
		for (int i = 0; i < 20; i++) {
			int t1 = MathUtils.random(0, inSize - 1);
			int t2 = MathUtils.random(0, inSize - 1);
			
			int temp = order[t1];
			int temp2 = order[t2];
			
			order[t1] = temp2;
			order[t2] = temp;
		}
		
		for (int i = 0; i < inSize; i++) {
			System.out.println("" + order[i]);
		}
	}
	
	public void swap(int[] inOrder, int target1, int target2) {
		System.out.println("Swapping " + target1 + " and " + target2);
		

	}
}