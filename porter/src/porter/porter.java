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
	long sum = 0;

	public long total(int[] booklist) {

		this.booklist=booklist;
		ͳ�Ƹ��������������С��������();
		������������屾��ͬʱ���ڵ��ܽ�();
		��������ۼ��ܼ�();
		return sum;
	}

	private void ������������屾��ͬʱ���ڵ��ܽ�() {
		if(existThreeAndFiveBooks()){
			
			int numOfThreeAndFiveBooks = statics[2]-statics[1] >= statics[0]?statics[0]:statics[2]-statics[1];
			sum += calculate(4,numOfThreeAndFiveBooks*2);
			statics[0]-=numOfThreeAndFiveBooks;
			statics[1]-=numOfThreeAndFiveBooks;
			statics[2]-=numOfThreeAndFiveBooks*2;
			statics[3]-=numOfThreeAndFiveBooks*2;
			statics[4]-=numOfThreeAndFiveBooks*2;
		}
	}

	private void ��������ۼ��ܼ�() {
		for(int i=0;i<statics.length;i++){
			
			if (statics[i]>0) {
				int num = statics[i];
				sum += calculate(5-i,num);
				for(int j=i;j<statics.length;j++){
					statics[j]-=num;
				}
			}
		}
	}

	private boolean existThreeAndFiveBooks() {
		return statics[0] > 0 && statics[2] - statics[1] >0;
	}

	private long calculate(int i,int num) {
		
		long sameBatchSum=0;
		
		switch(i){
		case 5:sameBatchSum = (long) (5 * sigelPrice * discount5*num);break;
		case 4:sameBatchSum = (long) (4 * sigelPrice * discount4*num);break;
		case 3:sameBatchSum = (long) (3 * sigelPrice * discount3*num);break;
		case 2:sameBatchSum = (long) (2 * sigelPrice * discount2*num);break;
		case 1:sameBatchSum = (long) (1 * sigelPrice * discount1*num);break;
		}
		return sameBatchSum;
	}

	private void ͳ�Ƹ��������������С��������() {

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
