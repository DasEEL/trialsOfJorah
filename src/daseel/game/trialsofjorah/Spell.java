package daseel.game.trialsofjorah;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.gui.MouseOverArea;
import org.newdawn.slick.state.StateBasedGame;

abstract class Spell {

	protected Image image;
	protected MouseOverArea area;
	protected Vector position;

	abstract void activate();

	abstract void init(GameContainer gc, StateBasedGame sbg);

	abstract void update(GameContainer gc, StateBasedGame sbg, Graphics g);

	abstract void render(GameContainer gc, StateBasedGame sbg, int delta);
}
