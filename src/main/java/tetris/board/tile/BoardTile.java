package tetris.board.tile;

import java.awt.Color;

import tetris.TetrisConstants;

public class BoardTile {

	private int x;
	private int y;
	private Color tileColor;

	public BoardTile(int x, int y, Color tileColor) {
		setX(x);
		setY(y);
		setTileColor(tileColor);
	}

	public BoardTile(int x, int y) {
		setX(x);
		setY(y);
		setTileColor(TetrisConstants.EMPTY_TILE_COLOR);
	}

	public void moveUp() {
		setY(y - 1);
	}

	public void moveRight() {
		setX(x + 1);
	}

	public void moveDown() {
		setY(y + 1);
	}

	public void moveLeft() {
		setX(x - 1);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	// GETTERS AND SETTERS

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

	public Color getTileColor() {
		return tileColor;
	}

	public void setTileColor(Color tileColor) {
		this.tileColor = tileColor;
	}

}
