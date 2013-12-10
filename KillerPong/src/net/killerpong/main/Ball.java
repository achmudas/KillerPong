package net.killerpong.main;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 * 
 * @author MkA
 * 
 *	Class representing ball
 */
public class Ball extends GameObject {
	
	private boolean releasedInd;
	
	public Ball() throws SlickException {
		Image [] ball = {new Image("res/ball.png")};
		int [] duration = {300};
		
		setSprite(new Animation(ball, duration, false));
		
		
	}

	public boolean isReleasedInd() {
		return releasedInd;
	}

	public void setReleasedInd(boolean releasedInd) {
		this.releasedInd = releasedInd;
	}
	
	
	
}
