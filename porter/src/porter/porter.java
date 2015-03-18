package porter;

public class porter {

	private static final double discount1 = 1;
	private static final double discount2 = 1 - 0.05;
	private static final double discount3 = 1 - 0.1;
	private static final double discount4 = 1 - 0.2;
	private static final double discount5 = 1 - 0.25;
	private final static int sigelPrice = 8;
	private int[] booklist;
	private int[] statics = { 0, 0, 0, 0, 0 };

	public long price(int[] booklist) {

		this.booklist=booklist;
		statc();
		
		
		return compute();
	}

	private long compute() {
		if (statics[0]==1) {
			return (long) (5 * sigelPrice * discount5);
		}
		if (statics[1]==1) {
			return (long) (4 * sigelPrice * discount4);
		}
		if (statics[2]==1) {
			return (long) (3 * sigelPrice * discount3);
		}
		if (statics[3]==1) {
			return (long) (2 * sigelPrice * discount2);
		}
		return (long) (booklist.length * sigelPrice * discount1);
	}

	private void statc() {

		for (int i = 0; i < booklist.length; i++) {
			statics[booklist[i]]++;
		}
		for (int i = 0; i < statics.length; i++) {
			for(int j=i+1;j<statics.length;j++){
				if(statics[i]>statics[j]){
					int tmp = statics[i];
					statics[i] = statics[j];
					statics[j] = tmp;
				}
			}
		}
		for (int i = 0; i < statics.length; i++) {
			
			System.out.print(statics[i]+" ");
		}
		System.out.println();
	}

}
