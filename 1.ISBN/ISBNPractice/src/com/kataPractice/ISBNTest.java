package com.kataPractice;

import static org.junit.Assert.*;
import org.junit.Test;

public class ISBNTest {
	ISBN isbn = new ISBN();
	
	@Test
	public void isVaildISBN1Test() {
		assertEquals(true, isbn.isVaildISBN("9780470059029"));
	}
	
	@Test
	public void notVaildISBNTest(){
		assertEquals(false, isbn.isVaildISBN("9780470059028"));
	}
	
	@Test
	public void isVaildISBN2Test() {
		assertEquals(true, isbn.isVaildISBN("9780471486480"));
	}
	
	@Test
	public void isVaildISBN3Test() {
		assertEquals(true, isbn.isVaildISBN("9780596809485"));
	}
	
	@Test
	public void isVaildISBN4Test() {
		assertEquals(true, isbn.isVaildISBN("9780131495050"));
	}
	
	@Test
	public void isVaildISBN5Test() {
		assertEquals(true, isbn.isVaildISBN("9780262134729"));
	}
	
	@Test
	public void not13DigitTest(){
		assertEquals(false, isbn.isVaildISBN("9780478"));
	}
	
	@Test
	public void notVaildDigitTest(){
		assertEquals(false, isbn.isVaildISBN("978047xxxxxx8"));
	}
	
	@Test
	public void isVaildISBNWithSpaceTest() {
		assertEquals(true, isbn.isVaildISBN("978 0 471 48648 0"));
	}
	
	@Test
	public void isVaildISBNWithHyphenTest() {
		assertEquals(true, isbn.isVaildISBN("978-0-13-149505-0"));
	}
	
	@Test
	public void isVaildISBN10Test() {
		assertEquals(true, isbn.isVaildISBN("0471958697"));
	}
}