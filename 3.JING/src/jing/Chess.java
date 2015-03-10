package jing;

public class Chess {
	public String check(String[][] chessboard) {
		
		
		int xCount=0;
		int oCount=0;
		
		for (int i = 0; i < 3; i++) {
			if (isHengWin(chessboard, i)) {
				if(chessboard[i][0]=="X")xCount++;
				if(chessboard[i][0]=="O")oCount++;
			}
			if (isShuWin(chessboard, i)) {
				if(chessboard[0][i]=="X")xCount++;
				if(chessboard[0][i]=="O")oCount++;
			}

		}
		if (isYouXieWin(chessboard) ||isZuoXieWin(chessboard)) {
			//return chessboard[1][1];
			if(chessboard[1][1]=="X")xCount++;
			if(chessboard[1][1]=="O")oCount++;
		}
		if(xCount>0&&oCount>0)return "error";
		if(xCount==1)return "X";
		if(oCount==1)return "O";
		//if(x==0&&o==0)
		  return "-";
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

	private boolean isHengWin(String[][] chessboard, int i) {
		return chessboard[i][0] == chessboard[i][1]
				&& chessboard[i][1] == chessboard[i][2];
	}
}
