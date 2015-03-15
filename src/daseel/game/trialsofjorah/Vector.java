package daseel.game.trialsofjorah;

/*
 *  Class used to store positions in a 2d-space (might switch to float or double later)
 */
public class Vector {

	private int x;
	private int y;

	public Vector(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public Vector(Vector vector) {

		this(vector.getX(), vector.getY());
	}

	public int getX() {
		return x;
	}

	public int getY() {

		return y;
	}

	public void setX(int x) {

		this.x = x;
	}

	public void setY(int y) {

		this.y = y;
	}
}
