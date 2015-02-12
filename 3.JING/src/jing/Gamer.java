package jing;

public class Gamer {

	public static Object getResult(String[][] game) {
		if(game[0][0].equals("X")&&game[0][1].equals("X")&&game[0][2].equals("X")){
			return "X";
		}
		if(game[1][0].equals("O")&&game[1][1].equals("O")&&game[1][2].equals("O")){
			return "O";
		}
		int total_x=0;
		int total_o=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
			
				if(game[i][j].equals("O")){
					total_o++;
				}else if(game[i][j].equals("X")){
					total_x++;
				}
			}
		}
		return null;
	}

}
