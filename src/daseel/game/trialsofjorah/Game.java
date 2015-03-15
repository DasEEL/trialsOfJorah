package daseel.game.trialsofjorah;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/*
 * Main Program
 * Nothing to see here <.<
 */

public class Game extends StateBasedGame {

	public Game(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		// TODO Auto-generated method stub
		
		this.addState(new GameScreen());
	}
	
	public static void main(String[] args) throws SlickException{
		
		AppGameContainer app = new AppGameContainer(new Game("The Trials Of Jorah"));
		app.setDisplayMode(800, 600, false);
		app.start();
	}
}