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
	
	private static final float UPPER_WALL = 18f;
	private static final float BOTTOM_WALL = 425f;

	private Image grassBackground;
	
	private Paddle playerPaddle;
	private Paddle enemyPaddle;
	
	
	public KillerPong() {
		super("Killer Pong");
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
		
		playerPaddle.getSprite().draw((int)playerPaddle.getX(), (int)playerPaddle.getY());
		enemyPaddle.getSprite().draw((int)enemyPaddle.getX(), (int)enemyPaddle.getY());

	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		// Loading all resources
		grassBackground = new Image("res/tile_grass.png");
		
		playerPaddle = new Paddle();
		enemyPaddle = new Paddle();
		enemyPaddle.setX(725f); //Changing starting possition
		
		


	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		 Input input = container.getInput();
		 float playerY = playerPaddle.getY();
		 
         if (input.isKeyDown(Input.KEY_UP))
         {
        	 if (playerY > UPPER_WALL) {
                 // The lower the delta the slowest the sprite will animate.
                 playerY -= delta * 0.2f;
                 playerPaddle.setY(playerY);
        	 }
          }
	
		if (input.isKeyDown(Input.KEY_DOWN))
	    {
			if (playerY < BOTTOM_WALL) {
				 // The lower the delta the slowest the sprite will animate.
	            playerY += delta * 0.2f;
                playerPaddle.setY(playerY);
			}
	           
	        }
	    }

}
