package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.Grades;

public class CheckValidTests {
	
	private Grades checkValidTest;
	private Boolean expected1, expected2, expected3, expected4, expected5, expected6, expected7, expected8, expected9, expected10, expected11;
	private double input1, input2, input3, input4, input5, input6, input8, input9, input10, input11;
	private Boolean input7;

	@Before
	public void setUp() throws Exception {
		checkValidTest = new Grades();
		input1 = 99.0;
		input2 = 100.0;
		input3 = 101.0;
		input4 = 1.0;
		input5 = 0.0;
		input6 = -1.0;
		input7 = true;
		input8 = -5.0;
		input9 = 237.0;
		input10 = 98.25;
		input11 = 82.0;
		
		expected1 = expected2 = expected4 = expected5 = expected10 = expected11 = true;
		expected3 = expected6 = expected7 = expected8 = expected9 = false;
	}

	@After
	public void tearDown() throws Exception {
		checkValidTest = null;
	}

	@Test
	public void test1() {
		assertEquals(expected1, checkValidTest.checkValid(input1));
	}
	
	@Test
	public void test2() {
		assertEquals(expected2, checkValidTest.checkValid(input2));
	}
	
	@Test
	public void test3() {
		assertEquals(expected3, checkValidTest.checkValid(input3));
	}
	
	@Test
	public void test4() {
		assertEquals(expected4, checkValidTest.checkValid(input4));
	}
	
	@Test
	public void test5() {
		assertEquals(expected5, checkValidTest.checkValid(input5));
	}
	
	@Test
	public void test6() {
		assertEquals(expected6, checkValidTest.checkValid(input6));
	}
	
	@Test
	public void test7() {
		assertEquals(expected7, checkValidTest.checkValid(input7));
	}
	
	@Test
	public void test8() {
		assertEquals(expected8, checkValidTest.checkValid(input8));
	}
	
	@Test
	public void test9() {
		assertEquals(expected9, checkValidTest.checkValid(input9));
	}
	
	@Test
	public void test10() {
		assertEquals(expected10, checkValidTest.checkValid(input10));
	}
	
	@Test
	public void test11() {
		assertEquals(expected11, checkValidTest.checkValid(input11));
	}

}























