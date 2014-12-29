package com.kataPractice;

import static org.junit.Assert.*;
import org.junit.Test;

public class ISBNTest {
	@Test
	public void isVaildISBNTest() {
		assertEquals(true, ISBN.isVaildISBN("9780470059029"));
	}
}
