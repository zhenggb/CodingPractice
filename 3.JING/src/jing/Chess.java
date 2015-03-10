package jing;

public class Chess {

	public String check(String[][] chessboard) {
		int XCount=0;
		int OCount=0;
		for(int i=0;i<=chessboard.length;i++){
			for(int j=0;j<i;j++)
			{
				if(chessboard[i][j]==chessboard[i+1][j]&&chessboard[i][j]==chessboard[i+2][j]){
					return "X";
				}
			}
		}
		   
		 
	return "X";
	}

}
