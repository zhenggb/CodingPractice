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

}
