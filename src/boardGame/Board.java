package boardGame;

public class Board {

	private int rows;
	private int colums;
	private Piece[][] pieces;
	public Board(int rows, int colums) {
		if (rows<1||colums<1) {
			throw new BoardException("O tabuleiro precisa ter mais de 1 linha ou coluna");
		}
		
		this.rows = rows;
		this.colums = colums;
		this.pieces = new Piece[rows][colums]; 
	}
	public int getRows() {
		return rows;
	}
	
	
	public int getColums() {
		return colums;
	}
	
	
	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Posiçao fora do tabuleiro");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)){
			throw new BoardException("Ja existe uma peça nessa posiçao");
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position; 
	}
	
	private boolean positionExists(int row, int column) {
		
		return row>=0 && row<=this.rows && column>=0 && column <= this.colums;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(),position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posiçao fora do tabuleiro");
		}
		return piece(position)!= null;
	}
}

