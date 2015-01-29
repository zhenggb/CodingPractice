package com.kataPractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ISBNTest {

	@Test
	public void 验证9780470059029是成功() {
		assertEquals("验证9780470059029是成功的", true, ISBN.verify("9780470059029"));
	}
	@Test
	public void 验证9780470059028是失败() {
		assertEquals("验证9780470059028是失败", false, ISBN.verify("9780470059028"));
	}
	
	@Test
	public void 验证带空格的是成功(){
		assertEquals(true, ISBN.verify("978 047 0059 029"));
	}
	
	@Test
	public void 验证带横线的是成功(){
		assertEquals(true, ISBN.verify("978-047-0059-029"));
	}
	
	@Test
	public void 验证带空格横线的是失败(){
		assertEquals(false, ISBN.verify("978-0 47-00 59-029"));
	}
	
	@Test
	public void 验证超过13位是失败的(){
		assertEquals(false, ISBN.verify("978047005902934"));
	}
	
	

}
