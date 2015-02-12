package jing;

public class Gamer {

	public static Object getResult(String[][] game) {
		if(game[0][0].equals("X")&&game[0][1].equals("X")&&game[0][2].equals("X")){
			return "X";
		}
		return null;
	}

}
