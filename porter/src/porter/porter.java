package porter;

public class porter {

	private static final double discount1 = 1;
	private static final double discount2 = 1-0.05;
	private static final double discount3 = 1-0.1;
	private final static int sigelPrice = 8;

	public long price(int[] booklist) {

		if(booklist.length==3&&booklist[0]!=booklist[1] && booklist[0]!=booklist[2] &&
				booklist[1]!=booklist[2]){
			return (long) (booklist.length*sigelPrice*discount3);
		}
		if(booklist.length==2&&booklist[0]!=booklist[1]){
			return (long) (booklist.length*sigelPrice*discount2);
		}
		return (long) (booklist.length * sigelPrice*discount1);
	}

}
