package daseel.game.trialsofjorah;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.gui.MouseOverArea;
import org.newdawn.slick.state.StateBasedGame;

public class MoveLeft extends Spell {

	Color color = Color.white;
	
	private boolean move = false;
	private Character character;

	private final int counterStartValue = 1000;

	private int counter = counterStartValue;

	public MoveLeft(Vector position, Color color) throws SlickException {
		super(position);
		// TODO Auto-generated constructor stub
		this.color = color;
		image = new Image("resources/Right_arrow.png");
	}

	@Override
	void activate(Character character) {
		// TODO Auto-generated method stub
		move = true;
		this.character = character;
	}

	@Override
	void init(GameContainer gc, StateBasedGame sbg, Camera cam) throws SlickException {
		// TODO Auto-generated method stub
		image = new Image("resources/Left_arrow.png");
		area = new MouseOverArea(gc, image, (int) position.getX(),
				(int) position.getY());
		area.setNormalColor(color);
		area.setMouseDownColor(Color.red);
		area.setMouseOverColor(Color.green);
	}

	@Override
	void update(GameContainer gc, StateBasedGame sbg, int delta, Camera cam)
			throws SlickException {
		// TODO Auto-generated method stub
		
		area.setLocation(cam.getPosition().getX() + position.getX(), cam.getPosition().getY() + position.getY());
		
		if (move) {
			character.getPosition().setX(character.getPosition().getX() - 0.1f);
			counter--;
		}
		if (counter <= 0) {
			move = false;
			counter = counterStartValue;
		}
	}

	@Override
	void render(GameContainer gc, StateBasedGame sbg, Graphics g, Camera cam)
			throws SlickException {
		// TODO Auto-generated method stub
		area.render(gc, g);
	}

	public int getImageWidth() {

		return image.getWidth();
	}
	public void setColor(Color color){
		
		this.color = color;
	}
}
