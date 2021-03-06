package daseel.game.trialsofjorah;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.gui.MouseOverArea;
import org.newdawn.slick.state.StateBasedGame;

abstract class Spell {

	protected Image image;
	protected MouseOverArea area;
	protected Vector position;

	public Spell(Vector position) {
		this.position = position;
	}

	abstract void activate(Character character);

	abstract void init(GameContainer gc, StateBasedGame sbg, Camera cam)
			throws SlickException;

	abstract void update(GameContainer gc, StateBasedGame sbg, int delta, Camera cam)
			throws SlickException;

	abstract void render(GameContainer gc, StateBasedGame sbg, Graphics g, Camera cam)
			throws SlickException;

	public int getImageWidth() {

		return image.getWidth();
	}

	public Vector getPosition() {

		return position;
	}

	public MouseOverArea getArea() {

		return area;
	}
	
}
