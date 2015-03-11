package com.kataPractice;

public class JING {
	public String check(String[][] chessBoard) {
		for (int i = 0; i < 3; i++) {
			if (chessBoard[0][0] == chessBoard[0][1]
					&& chessBoard[0][0] == chessBoard[0][2]) {
				return chessBoard[0][0];
			}
		}
		return "-";
	}
}
