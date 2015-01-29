package com.kataPractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ISBNTest {

	@Test
	public void ����9780470059029����true() {
		assertEquals(true, ISBN.isISBN("9780470059029"));
	}
	
	@Test
	public void ����9780470059028����false() {
		assertEquals(false, ISBN.isISBN("9780470059028"));
	}

	@Test
	public void ����9_780470059029����false() {
		assertEquals(true, ISBN.isISBN("9-780470059029"));
	}
	
	@Test
	public void ����9_780470059028����false() {
		assertEquals(false, ISBN.isISBN("9-780470059028"));
	}
	
	@Test
	public void ����0����false() {
		assertEquals(false, ISBN.isISBN("0"));
	}
	
	@Test
	public void ����978__0596809485����false() {
		assertEquals(false, ISBN.isISBN("978--0596809485"));
	}
	@Test
	public void ����978NN0596809485����false() {
		assertEquals(false, ISBN.isISBN("978  0596809485"));
	}
	
	@Test
	public void ����null����false() {
		assertEquals(false, ISBN.isISBN(null));
	}
	@Test
	public void ����diyigeweizifu����false() {
		assertEquals(false, ISBN.isISBN("-9780470059028"));
	}
	
	@Test
	public void ����kong����false() {
		assertEquals(false, ISBN.isISBN(""));
	}
	
	@Test
	public void ���ԷǷ��ַ�AB����false() {
		assertEquals(false, ISBN.isISBN("A123456789"));
	}
	
	@Test
	public void ����dayu13����false() {
		assertEquals(false, ISBN.isISBN("12345678901234"));
	}
	
	
}
