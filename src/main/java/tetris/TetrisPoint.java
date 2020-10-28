package tetris;

public class TetrisPoint {

	private int x;
	private int y;

	public TetrisPoint(int x, int y) {
		setX(x);
		setY(y);
	}

	public void incX() {
		++x;
	}

	public void incY() {
		++y;
	}

	public void decX() {
		--x;
	}

	public void decY() {
		--y;
	}

	// GETTERS AND SETTERX
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
