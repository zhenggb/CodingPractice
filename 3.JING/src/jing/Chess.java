package jing;

public class Chess {

	public String check(String[][] chessboard) {

		String player = "X";
		for (int i = 0; i < 3; i++) {
			if (chessboard[i][0] == player && chessboard[i][1] == player
					&& chessboard[i][2] == player) {
				return player;
			}
		}
		
		String player2 = "O";
		for (int i = 0; i < 3; i++) {
			if (chessboard[i][0] == player2 && chessboard[i][1] == player2
					&& chessboard[i][2] == player2) {
				return player2;
			}
		}
		
		for (int j = 0; j < 3; j++) {
			if (chessboard[0][j] == player && chessboard[1][j] == player
					&& chessboard[2][j] == player) {
				return player;
			}
		}
		return "-";
	}

}
