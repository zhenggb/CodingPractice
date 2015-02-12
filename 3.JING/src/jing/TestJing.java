package jing;

import junit.framework.Assert;

import org.junit.Test;

public class TestJing {
	
	@Test
	public void testX(){
		String[][] game = new String[][]{
				{"X","X","X"},
				{"O","O","_"},
				{"_","_","_"},
		};
		Assert.assertSame("X", Gamer.getResult(game));
	}
}
