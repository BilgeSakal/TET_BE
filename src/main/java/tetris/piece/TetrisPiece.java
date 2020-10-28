package tetris.piece;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import tetris.TetrisDirectionEnum;
import tetris.TetrisPoint;
import tetris.service.TetrisRotationService;

public abstract class TetrisPiece implements Cloneable {

	protected ArrayList<TetrisPoint> pieceCoordinates;
	protected int tetrisBoardWidth;
	protected Color pieceColor;

	/**
	 * Constructor to instantiate a Piece that randomly rotated.
	 * 
	 * @param tetrisBoardWidth width of the board.
	 * @param pieceColor       color of the piece.
	 * @throws CloneNotSupportedException
	 */
	public TetrisPiece(int tetrisBoardWidth, Color pieceColor) throws CloneNotSupportedException {
		setTetrisBoardWidth(tetrisBoardWidth);
		setPieceColor(pieceColor);
		Random random = new Random();
		int rotationCount = random.nextInt(4);
		pieceCoordinates = new ArrayList<TetrisPoint>();
		generatePiece();
		rotatePiece(0, TetrisDirectionEnum.RIGHT);
	}

	public abstract void generatePiece();

	/**
	 * Rotates the piece in the given <i>direction</i> <i>rotationCount</i> times.
	 * 
	 * @param rotationCount rotation count.
	 * @throws CloneNotSupportedException
	 */
	public TetrisPiece rotatePiece(int rotationCount, TetrisDirectionEnum direction) throws CloneNotSupportedException {
		TetrisPiece rotatedPiece = this;
		for (int i = 0; i < rotationCount; ++i) {
			rotatedPiece = TetrisRotationService.rotatePiece(rotatedPiece, direction);
		}
		return rotatedPiece;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object clone() throws CloneNotSupportedException {
		TetrisPiece cloned = (TetrisPiece) super.clone();
		cloned.setPieceCoordinates((ArrayList<TetrisPoint>) pieceCoordinates.clone());
		return cloned;
	}

	// GETTERS AND SETTERS

	public ArrayList<TetrisPoint> getPieceCoordinates() {
		return pieceCoordinates;
	}

	public void setPieceCoordinates(ArrayList<TetrisPoint> pieceCoordinates) {
		this.pieceCoordinates = pieceCoordinates;
	}

	public Color getPieceColor() {
		return pieceColor;
	}

	public void setPieceColor(Color pieceColor) {
		this.pieceColor = pieceColor;
	}

	public int getTetrisBoardWidth() {
		return tetrisBoardWidth;
	}

	public void setTetrisBoardWidth(int tetrisBoardWidth) {
		this.tetrisBoardWidth = tetrisBoardWidth;
	}

}
