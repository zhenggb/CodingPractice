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

}
