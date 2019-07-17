package application;

import boardGame.Board;
import boardGame.BoardException;
import boardGame.Position;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) throws BoardException {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());

	}

}
