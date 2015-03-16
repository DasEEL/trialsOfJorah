package daseel.game.trialsofjorah;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.gui.AbstractComponent;
import org.newdawn.slick.gui.ComponentListener;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/*
 * The game will run in this class.
 *  	Atleast at first
 */

public class GameScreen extends BasicGameState implements ComponentListener {

	Warrior warrior;
	Warrior warrior2;
	Camera cam;

	@Override
	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		// TODO Auto-generated method stub
		cam = new Camera();
		cam.init(gc, sbg);

		warrior = new Warrior(Color.blue);
		warrior2 = new Warrior(Color.white);

		warrior.init(gc, sbg, cam);
		warrior2.init(gc, sbg, cam);
		warrior2.setPosition(new Vector(warrior2.getPosition().getX() + 100,
				warrior2.getPosition().getY()));
		warrior.getArea().addListener(this);
		warrior2.getArea().addListener(this);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		// TODO Auto-generated method stub
		cam.update(gc, sbg, delta);

		warrior.update(gc, sbg, delta, cam);
		warrior2.update(gc, sbg, delta, cam);
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub
		cam.render(gc, sbg, g);

		warrior.render(gc, sbg, g, cam);
		warrior2.render(gc, sbg, g, cam);
		
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public void componentActivated(AbstractComponent source) {
		// TODO Auto-generated method stub
		if (source == warrior.getArea()) {
			flushFocus();
			warrior.setFocus(true);
		} else if (source == warrior2.getArea()) {
			flushFocus();
			warrior2.setFocus(true);
		}

	}

	public void flushFocus() {

		warrior.setFocus(false);
		warrior2.setFocus(false);
	}

	@Override
	public void mouseWheelMoved(int change){
		
		System.out.println(change);
		if(change > 0)
			cam.zoomIn();
		if(change < 0){
			cam.zoomOut();
		}
	}
}
