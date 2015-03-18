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
	@Test
	public void test�������������ص�3���͵�4��() {
		assertSame( (long)(2*8*(1-0.05)),new porter().price(new int[] {2,3}));
	}
	@Test
	public void test��3���������ص�2����3�͵�4��() {
		assertSame( (long)(3*8*(1-0.1)),new porter().price(new int[] {1,2,3}));
	}
	@Test
	public void test��4���������ص�2����3��4�͵�5��() {
		assertSame( (long)(4*8*(1-0.2)),new porter().price(new int[] {1,2,3,4}));
	}
	@Test
	public void test��5����ͬ�Ĺ�������() {
		assertSame( (long)(5*8*(1-0.25)),new porter().price(new int[] {0,1,2,3,4}));
	}
	
	@Test
	public void test��2����ͬ��1����������() {
		assertSame( (long)(2*8*(1-0.05)+8),new porter().price(new int[] {0,0,1}));
	}
	@Test
	public void test������2����ͬ��������() {
		assertSame( (long)(2*8*(1-0.05)*2),new porter().price(new int[] {0,0,1,1}));
	}

}
