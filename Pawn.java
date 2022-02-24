
public class Pawn extends Piece {
	
	int moveNumber;
	
    public Pawn(int x, int y, Side side, Board board) {
    	super(x, y, side, board);
    	moveNumber = 0;
    }
    
    @Override
    public boolean canMove(int destX, int destY) {
    	Side side = board.get(x, y).getSide();
    	
    	if (moveNumber == 0) { // check if it is the first move - note the moveNumber will be changed in Game.move()
    		if (side.toString().equals("WHITE")) { //white case
    			if (destX - x == 0 && (destY - y >= -2 && destY - y < 0)) return true; //ensure no backwards movement
    		} else { //black case
    			if (destX - x == 0 && destY - y <= 2 && destY - y > 0) return true; //ensure no backwards movement
    		}
    	} else { //all other moves past moveNumber 0
    		if (side.toString().equals("WHITE")) { //white case
    			if (destX - x == 0 && destY - y >= -1 && destY - y < 0) return true; //ensure no backwards movement
    		} else { //black case
    			if (destX - x == 0 && destY - y <= 1 && destY - y > 0) return true; //ensure no backwards movement
    		}
    	}
        //TODO: Check piecerules.md for the movement rule for this piece :)
        return false;
    }
    
    @Override
    public String getSymbol() {
        return this.getSide() == Side.BLACK ? "♟" : "♙";
    }
}
