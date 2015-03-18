package porter;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class testPorter {

	@Test
	public void test一本都不买() {
		assertSame( (long)0,new porter().price(new int[] {}));
	}
	
	@Test
	public void test只买一本哈利波特第1集() {
		assertSame( (long)8,new porter().price(new int[] {0}));
	}
	@Test
	public void test只买一本哈利波特第4集() {
		assertSame( (long)8,new porter().price(new int[] {3}));
	}
	@Test
	public void test买两本哈利波特第3集() {
		assertSame( (long)(2*8),new porter().price(new int[] {2,2}));
	}
	@Test
	public void test买三本哈利波特第3集() {
		assertSame( (long)(3*8),new porter().price(new int[] {2,2,2}));
	}
	@Test
	public void test买两本哈利波特第3集和第4集() {
		assertSame( (long)(2*8*(1-0.05)),new porter().price(new int[] {2,3}));
	}
	@Test
	public void test买3本哈利波特第2集和3和第4集() {
		assertSame( (long)(3*8*(1-0.1)),new porter().price(new int[] {1,2,3}));
	}
	@Test
	public void test买4本哈利波特第2集和3和4和第5集() {
		assertSame( (long)(4*8*(1-0.2)),new porter().price(new int[] {1,2,3,4}));
	}
	@Test
	public void test买5本不同的哈利波特() {
		assertSame( (long)(5*8*(1-0.25)),new porter().price(new int[] {0,1,2,3,4}));
	}
	
	@Test
	public void test买2本不同和1本哈利波特() {
		assertSame( (long)(2*8*(1-0.05)+8),new porter().price(new int[] {0,0,1}));
	}
	@Test
	public void test买两套2本不同哈利波特() {
		assertSame( (long)(2*8*(1-0.05)*2),new porter().price(new int[] {0,0,1,1}));
	}
	@Test
	public void test买2本第一集和2本第三集和1本第二集和第四本第四集() {
		assertSame( (long)((8 * 4 * 0.8) + (8 * 2 * 0.95)),new porter().price(new int[] {0,0,1,2,2,3}));
	}
	@Test
	public void test买一套完整和1本第二集() {
		assertSame( (long)(8 + (8 * 5 * 0.75)),new porter().price(new int[] {0,1,1,2,3,4}));
	}
	@Test
	public void test买一套完整和1本第一集和1本第二集和1本第三集() {
		assertSame( (long)(2 * (8 * 4 * 0.8)),new porter().price(new int[] {0,0,1,1,2,2,3,4}));
	}

}
