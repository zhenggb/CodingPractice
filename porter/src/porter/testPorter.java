package porter;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class testPorter {

	@Test
	public void testһ��������() {
		
		int[] booklist={};
		assertSame( (long)0,new porter().price(booklist));
	}

}
