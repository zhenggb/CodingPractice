package jing;

public class Chess {
	
	int xCount=0;
	int oCount=0;
	String[][] chessboard = null;
	public String check(String[][] chessboard) {
		this.chessboard = chessboard;
		countHengWin();
		countShuWin();
		countXieWin();
		if (xCount > 0 && oCount > 0)
			return "error";
		else if (xCount == 1)
			return "X";
		else if (oCount == 1)
			return "O";
		else 
			return "-";
	}

	private void countXieWin() {
		if (isYouXieWin(chessboard) || isZuoXieWin(chessboard)) {
			if (chessboard[1][1] == "X")
				xCount++;
			if (chessboard[1][1] == "O")
				oCount++;
		}
	}

	private void countShuWin() {
		for (int i = 0; i < 3; i++) {
			if (chessboard[0][i] == chessboard[1][i]
			&& chessboard[1][i] == chessboard[2][i]) {
				if(chessboard[0][i]=="X")xCount++;
				if(chessboard[0][i]=="O")oCount++;
			}
		}
	}

	private boolean isZuoXieWin(String[][] chessboard) {
		return chessboard[0][2] == chessboard[1][1]
				&& chessboard[2][0] == chessboard[1][1];
	}

	private boolean isYouXieWin(String[][] chessboard) {
		return chessboard[0][0] == chessboard[1][1]
				&& chessboard[2][2] == chessboard[1][1];
	}

	private boolean isShuWin(String[][] chessboard, int i) {
		return chessboard[0][i] == chessboard[1][i]
				&& chessboard[1][i] == chessboard[2][i];
	}

	private void countHengWin() {
		for (int i = 0; i < 3; i++) {
			if (chessboard[i][0] == chessboard[i][1]
					&& chessboard[i][1] == chessboard[i][2]) {
				if(chessboard[i][0]=="X")xCount++;
				if(chessboard[i][0]=="O")oCount++;
			}
		}
		return ;
	}
	

}
