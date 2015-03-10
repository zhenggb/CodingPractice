package jing;

import junit.framework.Assert;
import org.junit.Test;

public class ChessTest {
	@Test
	public void testHeng1(){
		String[][] chessboard = new String[][]{
				{"X","X","X"},
				{"_","O","_"},
				{"O","_","_"}
			};
		
		Assert.assertSame("X", new Chess().check(chessboard));		
	}
	@Test
	public void testHeng2(){
	String[][] chessboard = new String[][]{
			{"_","O","_"},
			{"X","X","X"},
			{"O","_","_"}
		};
	
	Assert.assertSame("X", new Chess().check(chessboard));		
}
}
