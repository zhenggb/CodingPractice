package jing;

import junit.framework.Assert;

import org.junit.Test;

public class TestJing {
	
	@Test
	public void test��Ӯ(){
		String[][] game = new String[][]{
				{"X","X","X"},
				{"O","O","_"},
				{"_","_","_"},
		};
		Assert.assertSame("X", Gamer.getResult(game));
	}
	@Test
	public void test��Ӯ(){
		String[][] game = new String[][]{
				{"X","O","_"},
				{"X","O","O"},
				{"X","_","_"},
		};
		Assert.assertSame("X", Gamer.getResult(game));
	}
	@Test
	public void testбӮ(){
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

	@Test
	public void testErrorA(){
		String[][] game = new String[][]{
				{"X","A","O"},
				{"O","X","X"},
				{"_","_","_"},
		};
		Assert.assertSame("Error", Gamer.getResult(game));
	}
	
	@Test
	public void testError1(){
		String[][] game = new String[][]{
				{"O","O","O"},
				{"_","X","X"},
				{"O","O","O"},
		};
		Assert.assertSame("Error", Gamer.getResult(game));
	}
	
//	@Test
//	public void testOwinһ��һ��(){
//		String[][] game = new String[][]{
//				{"X","X","O"},
//				{"X","X","O"},
//				{"O","O","O"},
//		};
//		Assert.assertSame("O", Gamer.getResult(game));
//	}
	
	@Test
	public void testOwinһ��һб(){
		String[][] game = new String[][]{
				{"O","X","X"},
				{"X","O","X"},
				{"O","O","O"},
		};
		Assert.assertSame("O", Gamer.getResult(game));
	}
	
	@Test
	public void testXwinһ��һб(){
		String[][] game = new String[][]{
				{"X","X","X"},
				{"O","X","O"},
				{"X","O","O"},
		};
		Assert.assertSame("X", Gamer.getResult(game));
	}
	@Test
	public void testXwinƽ��(){
		String[][] game = new String[][]{
				{"X","O","X"},
				{"O","X","X"},
				{"O","X","O"},
		};
		Assert.assertSame("-", Gamer.getResult(game));
	}
}
