package jing;

import junit.framework.Assert;
import org.junit.Test;

public class ChessTest {
	@Test
	public void testHeng(){
		String[][] chessboard = new String[][]{
				{"X","X","X"},
				{"_","O","_"},
				{"O","_","_"}
			};
		
		Assert.assertSame("X", new Chess().check(chessboard));		
	}
}
