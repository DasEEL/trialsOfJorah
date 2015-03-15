package daseel.game.trialsofjorah;

/*
 *  Class used to store positions in a 2d-space (might switch to float or double later)
 */
public class Vector {

	private float x;
	private float y;

	public Vector(float x, float y) {

		this.x = x;
		this.y = y;
	}

	public Vector(Vector vector) {

		this(vector.getX(), vector.getY());
	}

	public float getX() {
		return x;
	}

	public float getY() {

		return y;
	}

	public void setX(float x) {

		this.x = x;
	}

	public void setY(float y) {

		this.y = y;
	}
}
