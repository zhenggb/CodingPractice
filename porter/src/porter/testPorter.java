package porter;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class testPorter {

	@Test
	public void testһ��������() {
		assertSame( (long)0,new porter().price(new int[] {}));
	}
	
	@Test
	public void testֻ��һ���������ص�1��() {
		assertSame( (long)8,new porter().price(new int[] {0}));
	}

}
