package tetris;

import tetris.board.TetrisBoard;
import tetris.piece.TetrisPiece;
import tetris.service.TetrisMoveService;
import tetris.service.TetrisRotationService;

public class TetrisBrain {

	private TetrisPiece curPiece;
	private TetrisBoard tetrisBoard;

	public void movePiece(TetrisDirectionEnum direction) throws CloneNotSupportedException {
		TetrisMoveService.movePiece(curPiece, direction);
	}

	/**
	 * Rotates the <b>curPiece</b> in the given <i>direction</i>.
	 * 
	 * @param direction rotate direction.
	 * @throws CloneNotSupportedException
	 */
	public void rotatePiece(TetrisDirectionEnum direction) throws CloneNotSupportedException {
		TetrisRotationService.rotatePiece(curPiece, direction);
	}

}
