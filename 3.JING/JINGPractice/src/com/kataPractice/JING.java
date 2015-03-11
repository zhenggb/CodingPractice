package com.kataPractice;

public class JING {
	public String check(String[][] chessBoard) {
		for (int i = 0; i < 3; i++) {
			if (chessBoard[i][0] == chessBoard[i][1]
					&& chessBoard[i][0] == chessBoard[i][2]) {
				return chessBoard[i][0];
			}
		}
		return "-";
	}
}
