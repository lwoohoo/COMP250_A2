
public class TestClassChess {
	public static void main(String[] args) {
		Game g = new Game();
		System.out.println(g.getCurrentTurn().toString());
		boolean outEquals = Side.WHITE.toString().equals(g.getCurrentTurn().toString());
		System.out.println(outEquals);
	}
}
