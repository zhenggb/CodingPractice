package com.kataPractice;

public class JING {
	public String check(String[][] chessBoard) {
		int xWinCount = checkOneChess(chessBoard, "X");
		int oWinCount = checkOneChess(chessBoard, "O");
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

	private int checkOneChess(String[][] chessBoard, String chess) {
		int winCount = 0;
		winCount = winCount + checkOneChessAndOneWinType(chessBoard, chess, 0, 1);
		winCount = winCount + checkOneChessAndOneWinType(chessBoard, chess, 1, 0);
		winCount = winCount + checkOneChessAndOneWinType(chessBoard, chess, 1, 1);
		winCount = winCount + checkOneChessAndOneWinType(chessBoard, chess, -1, 1);
		return winCount;
	}

	private int checkOneChessAndOneWinType(String[][] chessBoard, String chess, int hengStep, int shuStep) {
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
