package com.kataPractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ISBNTest {

	@Test
	public void ��֤9780470059029�ǳɹ�() {
		assertEquals("��֤9780470059029�ǳɹ���", true, ISBN.verify("9780470059029"));
	}
	@Test
	public void ��֤9780470059028��ʧ��() {
		assertEquals("��֤9780470059028��ʧ��", false, ISBN.verify("9780470059028"));
	}
	
	@Test
	public void ��֤���ո���ǳɹ�(){
		assertEquals(true, ISBN.verify("978 047 0059 029"));
	}
	
	@Test
	public void ��֤�����ߵ��ǳɹ�(){
		assertEquals(true, ISBN.verify("978-047-0059-029"));
	}
	
	@Test
	public void ��֤���ո���ߵ���ʧ��(){
		assertEquals(false, ISBN.verify("978-0 47-00 59-029"));
	}
	
	@Test
	public void ��֤����13λ��ʧ�ܵ�(){
		assertEquals(false, ISBN.verify("978047005902934"));
	}
	
	

}
