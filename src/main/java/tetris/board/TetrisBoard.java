package tetris.board;

import java.util.List;

import tetris.TetrisConstants;
import tetris.TetrisPoint;
import tetris.board.tile.BoardTile;
import tetris.piece.TetrisPiece;

public class TetrisBoard {

	private int boardWidth;
	private int boardHeight;
	private BoardTile[][] tetrisBoard;

	public TetrisBoard(int boardWidth, int boardHeight) {
		setBoardWidth(boardWidth);
		setBoardHeight(boardHeight);
		tetrisBoard = new BoardTile[boardWidth][boardHeight];
	}

	/**
	 * Places the piece on the board.
	 * 
	 * @param piece to be placed.
	 */
	public void placePiece(final TetrisPiece piece) {
		List<TetrisPoint> toBePlacedPoints = piece.getPieceCoordinates();
		for (TetrisPoint point : toBePlacedPoints) {
			tetrisBoard[point.getX()][point.getY()].setTileColor(piece.getPieceColor());
		}
	}

	/**
	 * Removes the piece from the board.
	 * 
	 * @param piece to be removed.
	 */
	public void removePiece(final TetrisPiece piece) {
		List<TetrisPoint> toBeRemovedPoints = piece.getPieceCoordinates();
		for (TetrisPoint point : toBeRemovedPoints) {
			tetrisBoard[point.getX()][point.getY()].setTileColor(TetrisConstants.EMPTY_TILE_COLOR);
		}
	}

	// GETTERS AND SETTERS

	public int getBoardWidth() {
		return boardWidth;
	}

	public void setBoardWidth(int boardWidth) {
		this.boardWidth = boardWidth;
	}

	public int getBoardHeight() {
		return boardHeight;
	}

	public void setBoardHeight(int boardHeight) {
		this.boardHeight = boardHeight;
	}

}
