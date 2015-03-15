package daseel.game.trialsofjorah;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.gui.MouseOverArea;
import org.newdawn.slick.state.StateBasedGame;

public class MoveRight extends Spell {

	boolean move = false;
	Character character;

	int counter = 50;

	public MoveRight(Vector position) {
		super(position);
		// TODO Auto-generated constructor stub
	}

	@Override
	void activate(Character character) {
		// TODO Auto-generated method stub
		move = true;
		this.character = character;
	}

	@Override
	void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		// TODO Auto-generated method stub
		image = new Image("Right_arrow.png");
		area = new MouseOverArea(gc, image, Integer.parseInt(position.getX()
				+ ""), Integer.parseInt(position.getY() + ""));
		area.setNormalColor(Color.white);
	}

	@Override
	void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		// TODO Auto-generated method stub
		if (move) {
			character.getPosition().setX(character.getPosition().getX() + 1);
			counter--;
		}
		if (counter <= 0)
			move = false;

	}

	@Override
	void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub
		area.render(gc, g);
	}

}
