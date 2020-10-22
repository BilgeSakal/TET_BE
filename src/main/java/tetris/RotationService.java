package tetris;

import tetris.piece.TetrisPiece;

public class RotationService {

	/**
	 * Rotates the <b>tetrisPiece</b> in the given <i>direction</i>.
	 * 
	 * @param tetrisPiece to be rotated.
	 * @param direction   rotate direction.
	 */
	public static TetrisPiece rotatePiece(final TetrisPiece tetrisPiece, TetrisDirectionEnum direction) {
		switch (direction) {
		case RIGHT:
			return rotatePieceRight(tetrisPiece);
		case LEFT:
			return rotatePieceLeft(tetrisPiece);
		default:
			return null;
		}
	}

	private static TetrisPiece rotatePieceLeft(final TetrisPiece tetrisPiece) {
		return null;
	}

	private static TetrisPiece rotatePieceRight(final TetrisPiece tetrisPiece) {
		return null;
	}

}
