package net.killerpong.main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

/**
 * 
 * @author MkA
 *
 */
public class KillerPong extends BasicGame {
	private Image grassBackground;

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

	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		// Loading all resources
		grassBackground = new Image("res/tile_grass.png");

	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub

	}

}
