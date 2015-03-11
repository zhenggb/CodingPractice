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
}
