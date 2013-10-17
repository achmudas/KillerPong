package net.killerpong.main;

import org.newdawn.slick.Animation;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

/**
 * 
 * @author MkA
 *
 */
public class KillerPong extends BasicGame {
	
	private static final int SIZE = 34;
	private Image grassBackground;
	
	private Animation sprite;
	
	private float x = 34f, y = 34f;

	public KillerPong() {
		super("Killer Pong");
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] arguments)
    {
        try
        {
            AppGameContainer app = new AppGameContainer(new KillerPong());
            app.setDisplayMode(800, 600, false);
            app.start();
        }
        catch (SlickException e)
        {
            e.printStackTrace();
        }
    }

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		grassBackground.draw();
		
		sprite.draw((int)x, (int)y);

	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		// Loading all resources
		grassBackground = new Image("res/tile_grass.png");
		
		Image [] paddle = {new Image("res/paddle.png")};
		int [] duration = {300};
		
		sprite = new Animation(paddle, duration, false);

	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		 Input input = container.getInput();
         if (input.isKeyDown(Input.KEY_UP))
         {
                 // The lower the delta the slowest the sprite will animate.
                 y -= delta * 0.2f;
             }
	
		if (input.isKeyDown(Input.KEY_DOWN))
	    {
	            // The lower the delta the slowest the sprite will animate.
	            y += delta * 0.2f;
	        }
	    }


}
