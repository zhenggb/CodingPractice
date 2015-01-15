package com.kataPractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ISBNTest {

	@Test
	public void ≤‚ ‘9780470059029∑µªÿtrue() {
		assertEquals(true, ISBN.isISBN("9780470059029"));
	}
	
	@Test
	public void ≤‚ ‘9780470059028∑µªÿfalse() {
		assertEquals(false, ISBN.isISBN("9780470059028"));
	}

	@Test
	public void ≤‚ ‘9_780470059029∑µªÿfalse() {
		assertEquals(true, ISBN.isISBN("9-780470059029"));
	}
	
	@Test
	public void ≤‚ ‘9_780470059028∑µªÿfalse() {
		assertEquals(false, ISBN.isISBN("9-780470059028"));
	}
	
	@Test
	public void ≤‚ ‘0∑µªÿfalse() {
		assertEquals(false, ISBN.isISBN("0"));
	}
	
	@Test
	public void ≤‚ ‘978__0596809485∑µªÿfalse() {
		assertEquals(false, ISBN.isISBN("978--0596809485"));
	}
	@Test
	public void ≤‚ ‘978NN0596809485∑µªÿfalse() {
		assertEquals(false, ISBN.isISBN("978  0596809485"));
	}
	
	@Test
	public void ≤‚ ‘null∑µªÿfalse() {
		assertEquals(false, ISBN.isISBN(null));
	}
	@Test
	public void ≤‚ ‘diyigeweizifu∑µªÿfalse() {
		assertEquals(false, ISBN.isISBN("-9780470059028"));
	}
	
	@Test
	public void ≤‚ ‘kong∑µªÿfalse() {
		assertEquals(false, ISBN.isISBN(""));
	}
	
	@Test
	public void ≤‚ ‘∑«∑®◊÷∑˚AB∑µªÿfalse() {
		assertEquals(false, ISBN.isISBN("A123456789"));
	}
	
	@Test
	public void ≤‚ ‘dayu13∑µªÿfalse() {
		assertEquals(false, ISBN.isISBN("12345678901234"));
	}
	
	
}
