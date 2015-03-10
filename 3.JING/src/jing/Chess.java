package jing;

public class Chess {

	public String check(String[][] chessboard) {
		if (chessboard[0][0] == "X" && chessboard[0][1] == "X"
				&& chessboard[0][2] == "X") {
			return "X";
		}
		if (chessboard[1][0] == "X" && chessboard[1][1] == "X"
				&& chessboard[1][2] == "X") {
			return "X";
		}
		return "-";
	}

}
