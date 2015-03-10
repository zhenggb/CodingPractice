package jing;

public class Chess {
	public String check(String[][] chessboard) {
		for (int i = 0; i < 3; i++) {
			if (isHengWin(chessboard, i)) {
				return chessboard[i][0];
			}
			if (isShuWin(chessboard, i)) {
				return chessboard[0][i];
			}

		}
		if (chessboard[0][0] == chessboard[1][1]
				&& chessboard[2][2] == chessboard[1][1]) {
			return chessboard[0][0];
		}
		if (chessboard[0][2] == chessboard[1][1]
				&& chessboard[2][0] == chessboard[1][1]) {
			return chessboard[1][1];
		}
		return "-";
	}

	private boolean isShuWin(String[][] chessboard, int i) {
		return chessboard[0][i] == chessboard[1][i]
				&& chessboard[1][i] == chessboard[2][i];
	}

	private boolean isHengWin(String[][] chessboard, int i) {
		return chessboard[i][0] == chessboard[i][1]
				&& chessboard[i][1] == chessboard[i][2];
	}
}
