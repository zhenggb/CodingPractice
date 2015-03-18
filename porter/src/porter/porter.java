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

		long sum = 0;
		this.booklist=booklist;
		statc();
		
		if(statics[0] > 0 && statics[2] - statics[1] >0){
			
			int diff = statics[2]-statics[1] >= statics[0]?statics[0]:statics[2]-statics[1];
			sum += diff*2*(4 * sigelPrice * discount4);
			statics[0]-=diff;
			statics[1]-=diff;
			statics[2]-=diff*2;
			statics[3]-=diff*2;
			statics[4]-=diff*2;
		}
		for(int i=0;i<statics.length;i++){
			
			if (statics[i]>0) {
				int num = statics[i];
				sum += calculate(5-i,num);
				for(int j=i;j<statics.length;j++){
					statics[j]-=num;
				}
			}
		}
		return sum;
	}

	private long calculate(int i,int num) {
		
		long sameBatchSum=0;
		
		switch(i){
		case 5:sameBatchSum = (long) (5 * sigelPrice * discount5)*num;break;
		case 4:sameBatchSum = (long) (4 * sigelPrice * discount4)*num;break;
		case 3:sameBatchSum = (long) (3 * sigelPrice * discount3)*num;break;
		case 2:sameBatchSum = (long) (2 * sigelPrice * discount2)*num;break;
		case 1:sameBatchSum = (long) (1 * sigelPrice * discount1)*num;break;
		}
		return sameBatchSum;
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
	}

}
