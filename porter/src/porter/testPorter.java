package porter;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class testPorter {

	@Test
	public void test一本都不买() {
		
		int[] booklist={};
		assertSame( (long)0,new porter().price(booklist));
	}

}
