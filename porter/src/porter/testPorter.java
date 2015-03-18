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
	@Test
	public void testֻ��һ���������ص�4��() {
		assertSame( (long)8,new porter().price(new int[] {3}));
	}
	@Test
	public void test�������������ص�3��() {
		assertSame( (long)(2*8),new porter().price(new int[] {2,2}));
	}
	@Test
	public void test�������������ص�3��() {
		assertSame( (long)(3*8),new porter().price(new int[] {2,2,2}));
	}

}
