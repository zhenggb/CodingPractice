package porter;

import static org.junit.Assert.*;
import org.junit.Test;

public class testPorter {

	@Test
	public void testһ��������() {
		assertEquals( (long)0,new porter().price(new int[] {}));
	}
	
	@Test
	public void testֻ��һ���������ص�1��() {
		assertEquals( (long)8,new porter().price(new int[] {0}));
	}
	@Test
	public void testֻ��һ���������ص�4��() {
		assertEquals( (long)8,new porter().price(new int[] {3}));
	}
	@Test
	public void test�������������ص�3��() {
		assertEquals( (long)(2*8),new porter().price(new int[] {2,2}));
	}
	@Test
	public void test�������������ص�3��() {
		assertEquals( (long)(3*8),new porter().price(new int[] {2,2,2}));
	}
	@Test
	public void test�������������ص�3���͵�4��() {
		assertEquals( (long)(2*8*(1-0.05)),new porter().price(new int[] {2,3}));
	}
	@Test
	public void test��3���������ص�2����3�͵�4��() {
		assertEquals( (long)(3*8*(1-0.1)),new porter().price(new int[] {1,2,3}));
	}
	@Test
	public void test��4���������ص�2����3��4�͵�5��() {
		assertEquals( (long)(4*8*(1-0.2)),new porter().price(new int[] {1,2,3,4}));
	}
	@Test
	public void test��5����ͬ�Ĺ�������() {
		assertEquals( (long)(5*8*(1-0.25)),new porter().price(new int[] {0,1,2,3,4}));
	}
	
	@Test
	public void test��2����ͬ��1����������() {
		assertEquals( (long)(2*8*(1-0.05)+8),new porter().price(new int[] {0,0,1}));
	}
	@Test
	public void test������2����ͬ��������() {
		assertEquals( (long)(2*8*(1-0.05)*2),new porter().price(new int[] {0,0,1,1}));
	}
	@Test
	public void test��2����һ����2����������1���ڶ����͵��ı����ļ�() {
		assertEquals( (long)((8 * 4 * 0.8) + (8 * 2 * 0.95)),new porter().price(new int[] {0,0,1,2,2,3}));
	}
	@Test
	public void test��һ��������1���ڶ���() {
		assertEquals( (long)(8 + (8 * 5 * 0.75)),new porter().price(new int[] {0,1,1,2,3,4}));
	}
	@Test
	public void test��һ��������1����һ����1���ڶ�����1��������() {
		assertEquals( (long)(2 * (8 * 4 * 0.8)),new porter().price(new int[] {0,0,1,1,2,2,3,4}));
	}
	@Test
	public void test��4��������1����һ����1���ڶ�����1�����ļ�() {
		assertEquals((long)(3 * (8 * 5 * 0.75) + 2 * (8 * 4 * 0.8)),new porter().price(new int[] {0,0,0,0,0,
				1,1,1,1,1,
				2,2,2,2,
				3,3,3,3,3,
				4,4,4,4}));
	}
}
