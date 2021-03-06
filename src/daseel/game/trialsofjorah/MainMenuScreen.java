package daseel.game.trialsofjorah;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class MainMenuScreen extends BasicGameState {

	@Override
	public void init(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub

		g.drawString("MainMenu", 200, 300);

	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int arg2)
			throws SlickException {
		// TODO Auto-generated method stub

		if (gc.getInput().isKeyDown(Input.KEY_ESCAPE)) {

			// gc.reinit();
			sbg.enterState(1, new FadeOutTransition(), new FadeInTransition());
		}
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

}
