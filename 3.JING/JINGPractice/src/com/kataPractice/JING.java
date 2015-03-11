package com.kataPractice;

public class JING {
	public String check(String[][] chessBoard) {
		for (int i = 0; i < 3; i++) {
			if (chessBoard[i][0] == chessBoard[i][1]
					&& chessBoard[i][0] == chessBoard[i][2]) {
				return chessBoard[i][0];
			}
			if (chessBoard[0][i] == chessBoard[1][i]
					&& chessBoard[0][i] == chessBoard[2][i]) {
				return chessBoard[0][i];
			}
		}
		if (checkXie(chessBoard)||checkXieReverse(chessBoard)) {
			return chessBoard[1][1];
		}
		return "-";
	}

	private boolean checkXie(String[][] chessBoard) {
		int xCount = 0;
		int oCount = 0;
		int hengStep = 1;
		int shuStep = 1;
		for (int i = 0, j = 0; i < 3; i = i + hengStep, j = j + shuStep) {
			if (chessBoard[i][j].equals("X"))
				xCount++;
			if (chessBoard[i][j].equals("O"))
				oCount++;
		}
		if (xCount == 3 || oCount == 3)
			return true;
		return false;
	}
	
	private boolean checkXieReverse(String[][] chessBoard) {
		return chessBoard[0][2] == chessBoard[1][1]
				&& chessBoard[1][1] == chessBoard[2][0];
	}
}
