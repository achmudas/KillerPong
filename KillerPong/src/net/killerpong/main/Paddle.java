package net.killerpong.main;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 * @author achmudas
 *
 */
public class Paddle {

	private Animation sprite;
	
	private float x = 25f, y = 250f;
	
	public Paddle() throws SlickException {
		
		Image [] paddle = {new Image("res/paddle.png")};
		int [] duration = {300};
		
		sprite = new Animation(paddle, duration, false);
	}
	
	public Animation getSprite() {
		return sprite;
	}

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

}
