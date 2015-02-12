package jing;

import junit.framework.Assert;

import org.junit.Test;

public class TestJing {
	
	@Test
	public void test∫·”Æ(){
		String[][] game = new String[][]{
				{"X","X","X"},
				{"O","O","_"},
				{"_","_","_"},
		};
		Assert.assertSame("X", Gamer.getResult(game));
	}
	@Test
	public void test ˙”Æ(){
		String[][] game = new String[][]{
				{"X","O","_"},
				{"X","O","O"},
				{"X","_","_"},
		};
		Assert.assertSame("X", Gamer.getResult(game));
	}
	@Test
	public void test–±”Æ(){
		String[][] game = new String[][]{
				{"X","O","_"},
				{"O","X","O"},
				{"X","_","X"},
		};
		Assert.assertSame("X", Gamer.getResult(game));
	}
	
	@Test
	public void testError(){
		String[][] game = new String[][]{
				{"X","X","O"},
				{"O","X","X"},
				{"_","_","_"},
		};
		Assert.assertSame("Error", Gamer.getResult(game));
	}

}
