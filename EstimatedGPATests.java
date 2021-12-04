package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.Grades;

public class EstimatedGPATests {
	private Grades estimatedGPATest;
	private String expected3, expected4, expected7, expected8, expected10, expected11, expected15, expected18;
	private String expected1, expected2, expected5, expected6,  expected9, expected12, expected13,  expected14, expected16, expected17;

	
	@Before
	public void setUp() throws Exception {
		estimatedGPATest = new Grades();
		expected3 = "GPA: percentage - 28.5! You failed the course!";
		expected4 = "GPA: percentage - 99.5 letter - A";
		expected7 = "GPA: percentage - 77.8125 letter - D";
		expected8 = "GPA: percentage - 67.3125! You failed the course!";
		expected10 = "GPA: percentage - 56.5! You failed the course!";
		expected11 = "GPA: percentage - 81.0 letter - C";
		expected15 = "GPA: percentage - 51.5! You failed the course!";
		expected18 = "GPA: percentage - 73.5! You failed the course!";
		
		expected1 = expected2 = expected5 = expected6 =  expected9 = expected12 = expected13 = expected14 = expected16 = expected17 = "Invalid input";
		
		
	}

	@After
	public void tearDown() throws Exception {
		estimatedGPATest = null;
	}

	@Test
	public void test1() {
		assertEquals(expected1, estimatedGPATest.estimatedGPA(-1.0, 100.0, 0.0, 100.0));
	}
	
	@Test
	public void test2() {
		assertEquals(expected2, estimatedGPATest.estimatedGPA(0.0, 0.0, 101.0, 99.0));
	}
	
	@Test
	public void test3() {
		assertEquals(expected3, estimatedGPATest.estimatedGPA(1.0, 1.0, 50.0, 62.0));
	}

	@Test
	public void test4() {
		assertEquals(expected4, estimatedGPATest.estimatedGPA(99.0, 99.0, 100.0, 100.0));
	}
	@Test
	public void test5() {
		assertEquals(expected5, estimatedGPATest.estimatedGPA(101.0, 95.0, 1.0, 100.0));
	}
	@Test
	public void test6() {
		assertEquals(expected6, estimatedGPATest.estimatedGPA(100.0, -1.0, 99.0, 0.0));
	}
	@Test
	public void test7() {
		assertEquals(expected7, estimatedGPATest.estimatedGPA(82.0, 97.5, 35.25, 96.50));
	}
	@Test
	public void test8() {
		assertEquals(expected8, estimatedGPATest.estimatedGPA(98.25, 38.25, 97.50, 35.25));
	}
	@Test
	public void test9() {
		assertEquals(expected9, estimatedGPATest.estimatedGPA(100.0, 50.0, -1.0, 75.0));
	}
	@Test
	public void test10() {
		assertEquals(expected10, estimatedGPATest.estimatedGPA(100.0, 50.0, 1.0, 75.0));
	}
	@Test
	public void test11() {
		assertEquals(expected11, estimatedGPATest.estimatedGPA(100.0, 50.0, 99.0, 75.0));
	}
	@Test
	public void test12() {
		assertEquals(expected12, estimatedGPATest.estimatedGPA(100.0, 50.0, 101.0, 75.0));
	}
	@Test
	public void test13() {
		assertEquals(expected13, estimatedGPATest.estimatedGPA(25.0, 7.0, 75.0, -1.0));
	}
	@Test
	public void test14() {
		assertEquals(expected14, estimatedGPATest.estimatedGPA(100.0, 101.0, 55.0, 1.0));
	}
	@Test
	public void test15() {
		assertEquals(expected15, estimatedGPATest.estimatedGPA(100.0, 7.0, 0.0, 99.0));
	}
	
	@Test
	public void test16() {
		assertEquals(expected16, estimatedGPATest.estimatedGPA(100.0, 7.0, 0.0, 101.0));
	}
	
	@Test
	public void test17() {
		assertEquals(expected17, estimatedGPATest.estimatedGPA(5.0, 9.0, 99.0, [2, 3, 7]));
	}
	
	@Test
	public void test18() {
		assertEquals(expected18, estimatedGPATest.estimatedGPA(97.0, 97.0, 0.0, 100.0));
	}
	

}

















