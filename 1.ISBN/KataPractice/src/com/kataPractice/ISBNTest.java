package com.kataPractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ISBNTest {

	@Test
	public void test() {
		assertEquals(true, ISBN.isISBN("9780470059029"));
	}

}
