public class Bishop extends Piece {
    public Bishop(int x, int y, Side side, Board board) {
        super(x, y, side, board);
    }

    @Override
    public boolean canMove(int destX, int destY) {
    	if (Math.abs(this.x - destX) == Math.abs(this.y  - destY)) return true;
        //TODO: Check piecerules.md for the movement rule for this piece :)
        return false;
    }

    @Override
    public String getSymbol() {
        return this.getSide() == Side.BLACK ? "♝" : "♗";
    }
}
