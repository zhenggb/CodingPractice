package com.kataPractice;

import static org.junit.Assert.*;
import org.junit.Test;

public class JINGTest {
	@Test
	public void firstHengXWinTest(){
		String[][] chessBoard ={
				{"X", "X", "X"},
				{"O", "O", "_"},
				{"_", "_", "_"}
		};
		assertEquals("X",new JING().check(chessBoard));
	}
	
	@Test
	public void firstHengOWinTest(){
		String[][] chessBoard ={
				{"O", "O", "O"},
				{"X", "X", "_"},
				{"_", "X", "_"}
		};
		assertEquals("O",new JING().check(chessBoard));
	}
	
	@Test
	public void secondHengOWinTest(){
		String[][] chessBoard ={
				{"X", "X", "_"},
				{"O", "O", "O"},
				{"_", "X", "_"}
		};
		assertEquals("O",new JING().check(chessBoard));
	}
	
	@Test
	public void firstShuOWinTest(){
		String[][] chessBoard ={
				{"O", "X", "_"},
				{"O", "X", "_"},
				{"O", "_", "_"}
		};
		assertEquals("O",new JING().check(chessBoard));
	}
	
	@Test
	public void thirdShuOWinTest(){
		String[][] chessBoard ={
				{"X", "X", "O"},
				{"_", "X", "O"},
				{"_", "_", "O"}
		};
		assertEquals("O",new JING().check(chessBoard));
	}
	
	@Test
	public void xieXWinTest(){
		String[][] chessBoard ={
				{"X", "O", "O"},
				{"_", "X", "O"},
				{"_", "_", "X"}
		};
		assertEquals("X",new JING().check(chessBoard));
	}
	
	@Test
	public void xieReverseXWinTest(){
		String[][] chessBoard ={
				{"_", "O", "X"},
				{"_", "X", "O"},
				{"X", "_", "_"}
		};
		assertEquals("X",new JING().check(chessBoard));
	}
	
	@Test
	public void tieTest(){
		String[][] chessBoard ={
				{"X", "_", "_"},
				{"_", "X", "_"},
				{"_", "_", "O"}
		};
		assertEquals("-",new JING().check(chessBoard));
	}
	
	@Test
	public void bothWinTest(){
		String[][] chessBoard ={
				{"X", "_", "O"},
				{"X", "X", "O"},
				{"X", "_", "O"}
		};
		assertEquals("error",new JING().check(chessBoard));
	}
	
	@Test
	public void emptyTest(){
		String[][] chessBoard ={
				{"_", "_", "_"},
				{"_", "_", "_"},
				{"_", "_", "_"}
		};
		assertEquals("-",new JING().check(chessBoard));
	}
}
