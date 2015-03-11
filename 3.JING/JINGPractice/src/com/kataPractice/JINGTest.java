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
}
