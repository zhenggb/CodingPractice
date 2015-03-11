package com.kataPractice;

public class JING {
	public String check(String[][] chessBoard) {
		for (int i = 0; i < 3; i++) {
			if (chessBoard[i][0] == chessBoard[i][1]
					&& chessBoard[i][0] == chessBoard[i][2]) {
				return chessBoard[i][0];
			}
		}
		for (int i = 0; i < 3; i++) {
			if (chessBoard[0][i] == chessBoard[1][i]
					&& chessBoard[0][i] == chessBoard[2][i]) {
				return chessBoard[0][i];
			}
		}
		if (chessBoard[0][0] == chessBoard[1][1]
				&& chessBoard[1][1] == chessBoard[2][2]) {
			return chessBoard[1][1];
		}
		if (chessBoard[0][2] == chessBoard[1][1]
				&& chessBoard[1][1] == chessBoard[2][0]) {
			return chessBoard[1][1];
		}
		return "-";
	}
}
