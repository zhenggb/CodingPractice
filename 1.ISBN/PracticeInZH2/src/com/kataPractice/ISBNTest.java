package com.kataPractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ISBNTest {

	@Test
	public void ��֤9780470059029�ǳɹ�() {
		assertEquals("��֤9780470059029�ǳɹ���", true, ISBN.verify("9780470059029"));
	}
	
	@Test
	public void ��֤9780471486480�ǳɹ�() {
		assertEquals("��֤9780471486480�ǳɹ���", true, ISBN.verify("978 0 471 48648 0"));
	}
	

}