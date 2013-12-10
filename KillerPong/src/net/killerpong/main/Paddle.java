package net.killerpong.main;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 * @author achmudas
 *
 */
public class Paddle extends GameObject{

	public Paddle() throws SlickException {
		
		Image [] paddle = {new Image("res/paddle.png")};
		int [] duration = {300};
		
		setSprite(new Animation(paddle, duration, false));
		setX(25f);
		setY(250f);
	}
	


}
