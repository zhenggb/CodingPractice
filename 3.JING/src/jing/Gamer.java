package jing;

public class Gamer {

	public static Object getResult(String[][] game) {
//		if (game[0][0].equals("X") && game[0][1].equals("X")
//				&& game[0][2].equals("X")) {
//			return "X";
//		}
		if(checkHeng(game,0,"X"))
			return "X";
		if(checkHeng(game,1,"X"))
			return "X";
		if(checkSu(game,0,"X"))
			return "X";

		int Xsum = 0;
		int Osum = 0;

		for (int i = 0; i < 3; i++) {
			int xCount = 0;
			int ocount = 0;
			for (int j = 0; j < 3; j++) {
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
				if (Xsum - Osum == 0 || Xsum - Osum == -1 || Xsum - Osum == 1) {
					return "-";
				}
				return "X";
			}

			if (ocount == 3) {
				if (xCount == 3) {
					if (Xsum - Osum == 0 || Xsum - Osum == -1
							|| Xsum - Osum == 1) {
						return "-";
					}
					return "O";
				}
			}
		}
		return "Error";
	}
	private static boolean checkHeng(String[][] game,int i,String flag){
		if (game[i][0].equals(flag) && game[i][1].equals(flag)
				&& game[i][2].equals(flag))
			return true;
		else
			return false;//ºáÓ®
	}
	private static boolean checkSu(String[][] game,int i,String flag){
		if (game[0][i].equals(flag) && game[1][i].equals(flag)
				&& game[2][i].equals(flag))
			return true;
		else
			return false;//ÊúÓ®
	}
	private static boolean checkXie(String[][] game,String flag){
		if ((game[0][0].equals("X") && game[1][1].equals("X")
				&& game[2][2].equals("X")) || (game[0][2].equals("X") && game[1][1].equals("X")
					&& game[2][0].equals("X")))
			return true;
		else
			return false;//ÊúÓ®
	}
}
