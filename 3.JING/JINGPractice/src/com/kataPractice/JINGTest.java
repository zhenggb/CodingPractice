package com.kataPractice;

import static org.junit.Assert.*;
import org.junit.Test;

public class JINGTest {
	@Test
	public void HengWinTest(){
		String[][] chessBoard ={
				{"X", "X", "X"},
				{"O", "O", "_"},
				{"_", "_", "_"}
		};
		assertEquals("X",new JING().check(chessBoard));
	}
}
