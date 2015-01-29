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
	
	public void 验证9780471486480是成功() {
		assertEquals("验证9780471486480是成功的", true, ISBN.verify("978 0 471 48648 0"));
	}
	

}
