package boardGame;

public class Position {
	
	private int row;
	private int column;
	
	public Position(int row, int column) throws BoardException {
			
		this.column = column;
		this.row = row;
	}
	
	public Position() {
	}

	public int getRow() {
		return row;
	}

	
	public int getColumn() {
		return column;
	}
	
	@Override
	public String toString() {
		return this.row + " , "+this.column;
		
	}
	
	public void position(int row,int column) {
		this.column = column;
		this.row = row;
	
	}
}
