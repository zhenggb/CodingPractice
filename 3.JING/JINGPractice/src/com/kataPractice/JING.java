package com.kataPractice;

public class JING {
	int xWinCount = 0;
	int oWinCount = 0;

	public String check(String[][] chessBoard) {
		xWinCount = xWinCount + check(chessBoard, "X", 0, 1);
		xWinCount = xWinCount + check(chessBoard, "X", 1, 0);
		xWinCount = xWinCount + check(chessBoard, "X", 1, 1);
		xWinCount = xWinCount + check(chessBoard, "X", -1, 1);
		oWinCount = oWinCount + check(chessBoard, "O", 0, 1);
		oWinCount = oWinCount + check(chessBoard, "O", 1, 0);
		oWinCount = oWinCount + check(chessBoard, "O", 1, 1);
		oWinCount = oWinCount + check(chessBoard, "O", -1, 1);
		if (xWinCount == 1 && oWinCount == 0) {
			return "X";
		}
		if (xWinCount == 0 && oWinCount == 1) {
			return "O";
		}
		if (xWinCount == 0 && oWinCount == 0) {
			return "-";
		}
		return "error";
	}

	private int check(String[][] chessBoard, String chess, int hengStep, int shuStep) {
		int winCount = 0;
		for (int startI = 0; startI < 3; startI++) {
			for (int startJ = 0; startJ < 3; startJ++) {
				int count = 0;
				for (int i = startI, j = startJ; isValidCell(i, j); i = i + hengStep, j = j + shuStep) {
					if (chessBoard[i][j].equals(chess)) count++;
				}
				if (count == 3) winCount++;
			}
		}
		return winCount;
	}

	private boolean isValidCell(int i, int j) {
		return i >= 0 && i < 3 && j >= 0 && j < 3;
	}
}
