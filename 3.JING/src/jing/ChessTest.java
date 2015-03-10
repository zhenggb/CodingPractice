package jing;

import junit.framework.Assert;
import org.junit.Test;

public class ChessTest {
	@Test
	public void testHengX1() {
		String[][] chessboard = new String[][] {
				{ "X", "X", "X" },
				{ "_", "O", "_" }, 
				{ "O", "_", "_" } };

		Assert.assertSame("X", new Chess().check(chessboard));
	}

	@Test
	public void testHeng2() {
		String[][] chessboard = new String[][] { 
				{ "_", "O", "_" },
				{ "X", "X", "X" }, 
				{ "O", "_", "_" } };

		Assert.assertSame("X", new Chess().check(chessboard));
	}
	
	@Test
	public void testshu1() {
		String[][] chessboard = new String[][] {
				{ "X", "O", "_" },
				{ "X", "O", "O" }, 
				{ "X", "_", "_" } };

		Assert.assertSame("X", new Chess().check(chessboard));
	}
	
	@Test
	public void testHengO_1() {
		String[][] chessboard = new String[][] {
				{ "O", "O", "O" },
				{ "_", "X", "_" }, 
				{ "X", "_", "_" } };

		Assert.assertSame("O", new Chess().check(chessboard));
	}
	
	@Test
	public void testXie_1() {
		String[][] chessboard = new String[][] {
				{ "O", "X", "X" },
				{ "_", "O", "_" }, 
				{ "X", "_", "O" } };

		Assert.assertSame("O", new Chess().check(chessboard));
	}
	
	@Test
	public void testXie_reverse() {
		String[][] chessboard = new String[][] {
				{ "X", "X", "O" },
				{ "_", "O", "_" }, 
				{ "O", "_", "_" } };

		Assert.assertSame("O", new Chess().check(chessboard));
	}
	
	@Test
	public void testTwoWin() {
		String[][] chessboard = new String[][] {
				{ "X", "X", "X" },
				{ "O", "O", "O" }, 
				{ "O", "_", "_" } };

		Assert.assertSame("error", new Chess().check(chessboard));
	}
}
