package tetris.service;

import tetris.TetrisDirectionEnum;
import tetris.TetrisPoint;
import tetris.piece.TetrisPiece;

public class TetrisMoveService {

	/**
	 * Moves the given piece in the given direction.
	 * 
	 * @param piece     to be moved.
	 * @param direction move direction.
	 * @return moved piece.
	 * @throws CloneNotSupportedException
	 */
	public static TetrisPiece movePiece(final TetrisPiece piece, TetrisDirectionEnum direction)
			throws CloneNotSupportedException {
		TetrisPiece movedPiece = (TetrisPiece) piece.clone();
		for (TetrisPoint point : movedPiece.getPieceCoordinates()) {
			switch (direction) {
			case UP:
				point.decY();
				break;
			case DOWN:
				point.incY();
				break;
			case LEFT:
				point.decX();
				break;
			case RIGHT:
				point.incX();
				break;
			default:
				break;
			}
		}
		return movedPiece;
	}

}
