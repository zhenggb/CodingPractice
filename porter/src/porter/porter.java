package porter;

public class porter {

	private static final double discount1 = 1;
	private static final double discount2 = 1 - 0.05;
	private static final double discount3 = 1 - 0.1;
	private static final double discount4 = 1 - 0.2;
	private static final double discount5 = 1 - 0.25;
	private final static int sigelPrice = 8;
	private int[] booklist;
	private int[] booklist_static = { 0, 0, 0, 0, 0 };

	public long price(int[] booklist) {

		this.booklist=booklist;
		statc();
		
		if (booklist.length == 5 && booklist[0] != booklist[1]
				&& booklist[0] != booklist[2] && booklist[0] != booklist[3]
				&& booklist[0] != booklist[4] && booklist[1] != booklist[2]
				&& booklist[1] != booklist[3] && booklist[1] != booklist[4]
				&& booklist[2] != booklist[3] && booklist[2] != booklist[4]
				&& booklist[3] != booklist[4]) {
			return (long) (booklist.length * sigelPrice * discount5);
		}
		if (booklist.length == 4 && booklist[0] != booklist[1]
				&& booklist[0] != booklist[2] && booklist[0] != booklist[3]
				&& booklist[1] != booklist[2] && booklist[1] != booklist[3]
				&& booklist[2] != booklist[3]) {
			return (long) (booklist.length * sigelPrice * discount4);
		}
		if (booklist.length == 3 && booklist[0] != booklist[1]
				&& booklist[0] != booklist[2] && booklist[1] != booklist[2]) {
			return (long) (booklist.length * sigelPrice * discount3);
		}
		if (booklist.length == 2 && booklist[0] != booklist[1]) {
			return (long) (booklist.length * sigelPrice * discount2);
		}
		return (long) (booklist.length * sigelPrice * discount1);
	}

	private void statc() {

		for (int i = 0; i < booklist.length; i++) {
			booklist_static[booklist[i]]++;
		}
	}

}
