package daseel.game.trialsofjorah;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.state.StateBasedGame;

/*
 * The camera class
 * Used to move camera 
 * and zoom in or out
 */
public class Camera {

	private static final int WORLD_MAX_X = 2000;
	private static final int WORLD_MAX_Y = 2000;

	private static final int WORLD_MIN_X = 0;
	private static final int WORLD_MIN_Y = 0;

	private static final float CAM_SPEED = 0.5f;

	private float zoomScale;

	private static final float ZOOM_MAX = 5f;
	private static final float ZOOM_MIN = 0.7f;

	Vector camPos;

	public void init(GameContainer gc, StateBasedGame sbg) {

		zoomScale = 1f;
		camPos = new Vector(WORLD_MIN_X, WORLD_MIN_Y);
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) {

		if (gc.getInput().isKeyDown(Input.KEY_RIGHT))
			camPos.setX(camPos.getX() + CAM_SPEED);

		else if (gc.getInput().isKeyDown(Input.KEY_LEFT))
			camPos.setX(camPos.getX() - CAM_SPEED);

		else if (gc.getInput().isKeyDown(Input.KEY_UP))
			camPos.setY(camPos.getY() - CAM_SPEED);

		else if (gc.getInput().isKeyDown(Input.KEY_DOWN))
			camPos.setY(camPos.getY() + CAM_SPEED);

		if (camPos.getX() > WORLD_MAX_X)
			camPos.setX(WORLD_MAX_X);

		if (camPos.getX() < WORLD_MIN_X)
			camPos.setX(WORLD_MIN_X);

		if (camPos.getY() > WORLD_MAX_Y)
			camPos.setY(WORLD_MAX_Y);

		if (camPos.getY() < WORLD_MIN_Y)
			camPos.setY(WORLD_MIN_Y);

		if (zoomScale > ZOOM_MAX)
			zoomScale = ZOOM_MAX;

		if (zoomScale < ZOOM_MIN)
			zoomScale = ZOOM_MIN;

		// Reset the mouse
		gc.getInput().setOffset(camPos.getX(), camPos.getY());
		gc.getInput().setScale(1 / zoomScale, 1 / zoomScale);
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) {
		g.scale(zoomScale, zoomScale);
		g.translate(-camPos.getX(), -camPos.getY());
	}

	public void zoomIn() {

		zoomScale += 0.1;
	}

	public void zoomOut() {

		zoomScale -= 0.1;
	}

	public Vector getPosition() {

		return camPos;
	}
}
