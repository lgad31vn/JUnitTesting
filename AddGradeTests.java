package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.Grades;

public class AddGradeTests {

	private Grades addGradeTest;
	private double expected1, expected2, expected3, expected4, expected5, expected6, expected8, expected9; 
	private String expected7;
	
	@Before
	public void setUp() throws Exception {
		addGradeTest = new Grades();
		expected1 = 99.0;
		expected2 = 100.0;
		expected3 = 101.0;
		expected4 = 1.0;
		expected5 = 0.0;
		expected6 = -1.0;
		expected7 = "hello";
		expected8 = 4.28;
		expected9 = 82.0;
		
	}

	@After
	public void tearDown() throws Exception {
		addGradeTest = null;
	}

	@Test
	public void test1() {
		addGradeTest.addGrade(expected1);
		
		assertEquals(99.0, addGradeTest.getGrade(0), 0.0);
	}
	
	@Test
	public void test2() {
		addGradeTest.addGrade(expected1);
		addGradeTest.addGrade(expected2);
		
		assertEquals(expected2, addGradeTest.getGrade(1), 0.0);
	}
	
	@Test
	public void test3() {
		addGradeTest.addGrade(expected1);
		addGradeTest.addGrade(expected2);
		addGradeTest.addGrade(expected3);
		
		assertEquals(expected3, addGradeTest.getGrade(2), 0.0);
	}
	
	@Test
	public void test4() {
		addGradeTest.addGrade(expected1);
		addGradeTest.addGrade(expected2);
		addGradeTest.addGrade(expected4); 
		
		assertEquals(expected4, addGradeTest.getGrade(2), 0.0);
	}
	
	@Test
	public void test5() {
		addGradeTest.addGrade(expected1);
		addGradeTest.addGrade(expected2);
		addGradeTest.addGrade(expected4); 
		addGradeTest.addGrade(expected5);
		
		assertEquals(expected5, addGradeTest.getGrade(3), 0.0);
	}
	
	@Test
	public void test6() {
		addGradeTest.addGrade(expected1);
		addGradeTest.addGrade(expected2);
		addGradeTest.addGrade(expected4); 
		addGradeTest.addGrade(expected5);
		addGradeTest.addGrade(expected6);
		
		assertEquals(expected6, addGradeTest.getGrade(4), 0.0);
	}

	@Test
	public void test7() {
		addGradeTest.addGrade(expected1);
		addGradeTest.addGrade(expected2);
		addGradeTest.addGrade(expected4); 
		addGradeTest.addGrade(expected5);
		addGradeTest.addGrade(expected6);
		addGradeTest.addGrade(expected7);
		
		assertEquals(expected7, addGradeTest.getGrade(4));
	}
	
	
	@Test
	public void test8() {
		addGradeTest.addGrade(expected1);
		addGradeTest.addGrade(expected2);
		addGradeTest.addGrade(expected4); 
		addGradeTest.addGrade(expected5);
		addGradeTest.addGrade(expected6);
		addGradeTest.addGrade(expected8);
		
		assertEquals(expected8, addGradeTest.getGrade(4), 0.0);
	}
	
	@Test
	public void test9() {
		addGradeTest.addGrade(expected1);
		addGradeTest.addGrade(expected2);
		addGradeTest.addGrade(expected4); 
		addGradeTest.addGrade(expected5);
		addGradeTest.addGrade(expected6);
		addGradeTest.addGrade(expected8);
		addGradeTest.addGrade(expected9);
		
		assertEquals(expected9, addGradeTest.getGrade(5), 0.0);
	}
}

















