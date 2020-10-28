package tetris.service;

import tetris.TetrisDirectionEnum;
import tetris.TetrisPoint;
import tetris.piece.TetrisPiece;

public class TetrisRotationService {

	/**
	 * Rotates the <b>tetrisPiece</b> in the given <i>direction</i>.
	 * 
	 * @param tetrisPiece to be rotated.
	 * @param direction   rotate direction.
	 * @return rotated piece.
	 * @throws CloneNotSupportedException
	 */
	public static TetrisPiece rotatePiece(final TetrisPiece tetrisPiece, TetrisDirectionEnum direction)
			throws CloneNotSupportedException {
		switch (direction) {
		case RIGHT:
			return rotatePieceRight(tetrisPiece);
		case LEFT:
			return rotatePieceLeft(tetrisPiece);
		default:
			return null;
		}
	}

	/**
	 * Rotates the <b>tetrisPiece</b> to the <i>left</i>.
	 * 
	 * @param tetrisPiece to be rotated.
	 * @return rotatedPiece.
	 * @throws CloneNotSupportedException
	 */
	private static TetrisPiece rotatePieceLeft(final TetrisPiece tetrisPiece) throws CloneNotSupportedException {
		TetrisPiece rotatedPiece = (TetrisPiece) tetrisPiece.clone();
		int xCenterOfGravity = calculateXaverage(tetrisPiece);
		int yCenterOfGravity = calculateYaverage(tetrisPiece);
		for (int i = 0; i < tetrisPiece.getPieceCoordinates().size(); ++i) {
			double x = tetrisPiece.getPieceCoordinates().get(i).getX();
			double y = tetrisPiece.getPieceCoordinates().get(i).getY();
			x -= xCenterOfGravity;
			y -= yCenterOfGravity;
			double temp = x;
			x = -y;
			y = temp;
			x += xCenterOfGravity;
			y += yCenterOfGravity;
			rotatedPiece.getPieceCoordinates().set(i, new TetrisPoint((int) x, (int) y));
		}
		return rotatedPiece;
	}

	/**
	 * Rotates the <b>tetrisPiece</b> to the <i>right</i>.
	 * 
	 * @param tetrisPiece to be rotated.
	 * @return rotated.
	 * @throws CloneNotSupportedException
	 */
	private static TetrisPiece rotatePieceRight(final TetrisPiece tetrisPiece) throws CloneNotSupportedException {
		TetrisPiece rotatedPiece = (TetrisPiece) tetrisPiece.clone();
		int xCenterOfGravity = calculateXaverage(tetrisPiece);
		int yCenterOfGravity = calculateYaverage(tetrisPiece);
		for (int i = 0; i < tetrisPiece.getPieceCoordinates().size(); ++i) {
			double x = tetrisPiece.getPieceCoordinates().get(i).getX();
			double y = tetrisPiece.getPieceCoordinates().get(i).getY();
			x -= xCenterOfGravity;
			y -= yCenterOfGravity;
			double temp = x;
			x = y;
			y = -temp;
			x += xCenterOfGravity;
			y += yCenterOfGravity;
			rotatedPiece.getPieceCoordinates().set(i, new TetrisPoint((int) x, (int) y));
		}
		return rotatedPiece;
	}

	/**
	 * Calculates the average of X coordinates of given piece's board tiles.
	 * 
	 * @param piece
	 * @return average of X coordinates
	 */
	private static int calculateXaverage(TetrisPiece piece) {
		double sum = 0;
		for (TetrisPoint point : piece.getPieceCoordinates()) {
			sum += point.getX();
		}
		return (int) Math.ceil(sum / piece.getPieceCoordinates().size());
	}

	/**
	 * Calculates the average of Y coordinates of given piece's board tiles.
	 * 
	 * @param piece
	 * @return average of Y coordinates
	 */
	private static int calculateYaverage(TetrisPiece piece) {
		double sum = 0;
		for (TetrisPoint point : piece.getPieceCoordinates()) {
			sum += point.getY();
		}
		return (int) Math.ceil(sum / piece.getPieceCoordinates().size());
	}

}
