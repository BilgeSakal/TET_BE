package tetris.piece;

import java.awt.Color;

import tetris.TetrisPoint;

public class TetrisPieceZ extends TetrisPiece {

	public TetrisPieceZ(int tetrisBoardWidth, Color pieceColor) throws CloneNotSupportedException {
		super(tetrisBoardWidth, pieceColor);
	}

	@Override
	public void generatePiece() {
		pieceCoordinates.add(new TetrisPoint(tetrisBoardWidth / 2 - 1, 0));
		pieceCoordinates.add(new TetrisPoint(tetrisBoardWidth / 2, 0));
		pieceCoordinates.add(new TetrisPoint(tetrisBoardWidth / 2, 1));
		pieceCoordinates.add(new TetrisPoint(tetrisBoardWidth / 2 + 1, 1));
	}

}
