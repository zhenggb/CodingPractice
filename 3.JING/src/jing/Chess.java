package jing;

public class Chess {

	public String check(String[][] chessboard) {

		for (int i = 0; i < 3; i++) {
			if (chessboard[i][0] == "X" && chessboard[i][1] == "X"
					&& chessboard[i][2] == "X") {
				return "X";
			}
		}
		
		for (int j = 0; j < 3; j++) {
			if (chessboard[0][j] == "X" && chessboard[1][j] == "X"
					&& chessboard[2][j] == "X") {
				return "X";
			}
		}
		return "-";
	}

}
