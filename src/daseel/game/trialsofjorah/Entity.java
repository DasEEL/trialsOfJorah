package daseel.game.trialsofjorah;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Color;
import org.newdawn.slick.SpriteSheet;

/*
 * Superclass for objects of different types.
 * Everything that has to placed, and might move
 */
public class Entity {

	private Vector position;
	private Vector size;
	private Vector speed;
	private Color color;
	private SpriteSheet frames;
	private Animation animation;

	/*
	 * Getters
	 */
	public Vector getPosition() {

		return position;
	}

	public Vector getSize() {

		return size;
	}

	public Vector getSpeed() {

		return speed;
	}

	public Color getColor() {

		return color;
	}

	public SpriteSheet getFrames() {

		return frames;
	}

	public Animation getAnimation() {

		return animation;
	}

	/*
	 * Setters
	 */
	public void setPosition(Vector position) {

		this.position = new Vector(position);
	}

	public void setSize(Vector size) {

		this.size = new Vector(size);
	}

	public void setSpeed(Vector speed) {

		this.speed = new Vector(speed);
	}

	public void setColor(Color color) {

		this.color = color;
	}

	public void setFrames(SpriteSheet frames) {

		this.frames = frames;
	}
}
