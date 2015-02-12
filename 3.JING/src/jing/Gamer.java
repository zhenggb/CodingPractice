package jing;

public class Gamer {

	public static Object getResult(String[][] game) {
		if(game[0][0].equals("X")&&game[0][1].equals("X")&&game[0][2].equals("X")){
			return "X";
		}
		if(game[1][0].equals("O")&&game[1][1].equals("O")&&game[1][2].equals("O")){
			return "O";
		}
		
	int Xsum = 0;
	int Osum = 0;
	
	for (int i = 0 ; i< 3;i++) {
		int xCount = 0; int ocount = 0;
		for (int j = 0; j <3; j++) {
			String tmp = game[i][j];
			if ("X".equals(tmp)) {
				xCount += 1;
				Xsum++;
			}
			
			if ("O".equals(tmp)) {
				ocount += 1;
				Osum++;
			}
			
			
		}
		
		if (xCount == 3) {
			if (Xsum - Osum == 0 || Xsum - Osum == -1||Xsum - Osum == 1 ) {
				return "-";
			}
				return "X";
		}
		
		if (ocount == 3) {
			if (xCount == 3) {
				if (Xsum - Osum == 0 || Xsum - Osum == -1||Xsum - Osum == 1 ) {
					return "-";
				}
					return "O";
		}
	}
	
	
//	for (int j = 0 ; j< 3;j++) {
//		int xCount1 = 0; int ocount2 = 0;
//		for (int i1 = 0; i1 <3; i1++) {
//			String tmp = game[i1][j];
//			if ("X".equals(tmp)) {
//				xCount1 += 1;
//			}
//			
//			if ("O".equals(tmp)) {
//				ocount2 += 1;
//			}
//		}
//		
//		if (xCount1 == 3) {
//			return "X";
//		}
//		
//		if (ocount2 == 3) {
//			return "O";
//		}
//	}
//	}

	}
		return "Error";
	}
	

	}
