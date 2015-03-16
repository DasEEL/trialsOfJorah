package daseel.game.trialsofjorah;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.gui.AbstractComponent;
import org.newdawn.slick.gui.ComponentListener;
import org.newdawn.slick.gui.MouseOverArea;
import org.newdawn.slick.state.StateBasedGame;

/*
 * The warrior character
 */
public class Warrior extends Character implements ComponentListener {

	Image image;
	MouseOverArea area;

	public Warrior(Color color) {

		this.color = color;
	}

	@Override
	void init(GameContainer gc, StateBasedGame sbg, Camera cam) throws SlickException {
		// TODO Auto-generated method stub

		isFocus = false;
		spells[0] = new MoveRight(new Vector(100, 500), color);
		spells[1] = new MoveRight(new Vector(spells[0].getPosition().getX()
				+ spells[0].getImageWidth() + 20, 500), color);
		spells[2] = new MoveLeft(new Vector(spells[1].getPosition().getX()
				+ spells[1].getImageWidth() + 20, 500), color);
		spells[3] = new MoveRight(new Vector(spells[2].getPosition().getX()
				+ spells[2].getImageWidth() + 20, 500), color);
		spells[4] = new MoveRight(new Vector(spells[3].getPosition().getX()
				+ spells[3].getImageWidth() + 20, 500), color);
		position = new Vector(100, 300);
		image = new Image("resources/white_fyrkant.png");
		area = new MouseOverArea(gc, image, (int) position.getX(),
				(int) position.getY(), 30, 30);
		area.setNormalColor(color);
		area.setMouseDownColor(Color.cyan);
		area.setMouseOverColor(Color.darkGray);

		for (int i = 0; i < 5; i++) {
			spells[i].init(gc, sbg, cam);
			spells[i].getArea().addListener(this);
		}
	}

	@Override
	void update(GameContainer gc, StateBasedGame sbg, int delta, Camera cam)
			throws SlickException {
		// TODO Auto-generated method stub
		if (isFocus)
			for (int i = 0; i < 5; i++)
				spells[i].update(gc, sbg, delta, cam);

		area.setLocation(position.getX(), position.getY());
	}

	@Override
	void render(GameContainer gc, StateBasedGame sbg, Graphics g, Camera cam)
			throws SlickException {
		// TODO Auto-generated method stub
		if (isFocus)
			for (int i = 0; i < 5; i++)
				spells[i].render(gc, sbg, g, cam);

		area.render(gc, g);
	}

	@Override
	public void componentActivated(AbstractComponent source) {
		// TODO Auto-generated method stub

		if (source == spells[0].getArea())
			spells[0].activate(this);
		else if (source == spells[1].getArea())
			spells[1].activate(this);
		else if (source == spells[2].getArea())
			spells[2].activate(this);
		else if (source == spells[3].getArea())
			spells[3].activate(this);
		else if (source == spells[4].getArea())
			spells[4].activate(this);

	}

	public MouseOverArea getArea() {
		return area;
	}
}
