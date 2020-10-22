package tetris;

import tetris.piece.TetrisPiece;

public class TetrisBrain {

	private TetrisPiece curPiece;

	public void movePiece(TetrisDirectionEnum direction) {

	}

	/**
	 * Rotates the <b>curPiece</b> in the given <i>direction</i>.
	 * 
	 * @param direction rotate direction.
	 */
	public void rotatePiece(TetrisDirectionEnum direction) {
		RotationService.rotatePiece(curPiece, direction);
	}

}
