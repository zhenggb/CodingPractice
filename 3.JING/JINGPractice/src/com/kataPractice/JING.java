package com.kataPractice;

public class JING {
	String winner = "error";
	int xWinCount = 0;
	int oWinCount = 0;

	public String check(String[][] chessBoard) {
		check(chessBoard, 0, 1);
		check(chessBoard, 1, 0);
		check(chessBoard, 1, 1);
		check(chessBoard, -1, 1);
		if (xWinCount == 1 && oWinCount == 0) {
			setWinner("X");
		}
		if (xWinCount == 0 && oWinCount == 1) {
			setWinner("O");
		}
		if (xWinCount == 0 && oWinCount == 0) {
			setWinner("-");
		}
		return getWinner();
	}

	private void check(String[][] chessBoard, int hengStep, int shuStep) {
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
				if (xCount == 3) xWinCount++;
				if (oCount == 3) oWinCount++;
			}
		}
	}

	private boolean isValidCell(int i, int j) {
		return i >= 0 && i < 3 && j >= 0 && j < 3;
	}
	
	private String getWinner() {
		return winner;
	}

	private void setWinner(String winner) {
		this.winner = winner;
	}
}
