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
		if (check(chessBoard, 1, 1) || check(chessBoard, -1, 1)) {
			return chessBoard[1][1];
		}
		return "-";
	}

	private boolean check(String[][] chessBoard, int hengStep, int shuStep) {
		int xWinCount = 0;
		int oWinCount = 0;
		for (int startI = 0; startI < 3; startI++) {
			for (int startJ = 0; startJ < 3; startJ++) {
				int xCount = 0;
				int oCount = 0;
				for (int i = startI, j = startJ; isValidCell(i, j); i = i + hengStep, j = j + shuStep) {
					if (chessBoard[i][j].equals("X"))
						xCount++;
					if (chessBoard[i][j].equals("O"))
						oCount++;
				}
				if (xCount == 3)
					xWinCount++;
				if (oCount == 3)
					oWinCount++;
			}
		}
		if (xWinCount == 1 && oWinCount == 0)
			return true;
		if (xWinCount == 0 && oWinCount == 1)
			return true;
		return false;
	}

	private boolean isValidCell(int i, int j) {
		return i >= 0 && i < 3 && j >= 0 && j < 3;
	}
}
