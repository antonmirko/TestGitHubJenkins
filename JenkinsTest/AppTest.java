package de.app.JenkinsTest;

import static org.junit.Assert.*;

import org.junit.Test;


public class AppTest {

	App adder = new App();

	@Test
	public void test() {
		 
		assertEquals( 5, adder.add(2,3));
	}
	@Test
	public void testok()
	{
		assertEquals(6, adder.add(3, 3));
	}
	@Test
	public void testFailed()
	{
		assertNotEquals(6, adder.add(5, 5));
	}

}
