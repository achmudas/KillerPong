package net.killerpong.main;

import org.newdawn.slick.Animation;

/**
 * 
 * @author MkA
 * Abstract class representing game objects with sprites
 */
abstract public class GameObject {
	
	private Animation sprite;
	
	private float x, y;
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public Animation getSprite() {
		return sprite;
	}

	public void setSprite(Animation sprite) {
		this.sprite = sprite;
	}
	
}
