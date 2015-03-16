package daseel.game.trialsofjorah;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/*
 * Superclass for playable characters (Might introduce a race subclass)
 */
abstract class Character extends Entity {

	protected boolean isFocus;
	protected Spell[] spells = new Spell[5];

	abstract void init(GameContainer gc, StateBasedGame sbg, Camera cam)
			throws SlickException;

	abstract void update(GameContainer gc, StateBasedGame sbg, int delta,
			Camera cam) throws SlickException;

	abstract void render(GameContainer gc, StateBasedGame sbg, Graphics g,
			Camera cam) throws SlickException;

	public void setFocus(boolean focus) {

		this.isFocus = focus;
	}
}
