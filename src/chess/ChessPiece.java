package chess;

import boardGame.Board;
import boardGame.Piece;

public class ChessPiece extends Piece {

	private Color color;
	private int moveCount;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
		this.moveCount = 0;
	}

	public Color getColor() {
		return color;
	}


	
}
