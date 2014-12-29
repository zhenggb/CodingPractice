package com.kataPractice;

import static org.junit.Assert.*;
import org.junit.Test;

public class ISBNTest {
	@Test
	public void isVaildISBN1Test() {
		assertEquals(true, ISBN.isVaildISBN("9780470059029"));
	}
	
	@Test
	public void notVaildISBNTest(){
		assertEquals(false, ISBN.isVaildISBN("9780470059028"));
	}
	
	@Test
	public void isVaildISBN2Test() {
		assertEquals(true, ISBN.isVaildISBN("9780471486480"));
	}
	
	@Test
	public void isVaildISBN3Test() {
		assertEquals(true, ISBN.isVaildISBN("9780596809485"));
	}
	
	@Test
	public void isVaildISBN4Test() {
		assertEquals(true, ISBN.isVaildISBN("9780131495050"));
	}
	
	@Test
	public void isVaildISBN5Test() {
		assertEquals(true, ISBN.isVaildISBN("9780262134729"));
	}
}
