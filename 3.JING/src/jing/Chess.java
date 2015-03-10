package jing;

public class Chess {

	public String check(String[][] chessboard) {
		int XCount=0;
		int OCount=0;
		for(int i=0;i<=chessboard.length;i++){
			
		  if(chessboard[0][i]==chessboard[1][i]&&chessboard[0][i]==chessboard[2][i]){
		    if(chessboard[0][i]=="X"){
		    	XCount++;
		    }
		    if(chessboard[0][i]=="O"){
		    	OCount++;
		    }
		  }
		}
		
		 
		return "X";
	}

}
