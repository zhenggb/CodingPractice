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
	@Test
	public void testO(){
		String[][] game = new String[][]{
				{"X","X","_"},
				{"O","O","O"},
				{"_","_","_"},
		};
		Assert.assertSame("O", Gamer.getResult(game));
	}
	@Test
	public void testError(){
		String[][] game = new String[][]{
				{"X","X","O"},
				{"O","O","O"},
				{"_","_","_"},
		};
		Assert.assertSame("Error", Gamer.getResult(game));
	}
}
