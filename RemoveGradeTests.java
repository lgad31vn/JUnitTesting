package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.Grades;

public class RemoveGradeTests {
	private Grades removeAllGradesTest;
	private Boolean expected1,expected2,expected3,expected4,expected5, expected6,expected7,expected8,expected9,expected10,expected11, expected12;
	private String input5;
	private double input1, input2, input3, input4, input7, input6, input8, input9, input10, input11;

	@Before
	public void setUp() throws Exception {
		input1 = 101.0;
		input2 = 10.0;
		input3 = 0.0;
		input4 = 43.5;
		input5 = "True" ;
		input6 = -5.0;
		input7 = 237.0;
		input8 = 5.0;
		input9 = 99.0;
		input10 = 100.0;
		input11 = -1.0;
		
		expected1 = expected4 = expected5 = expected6 = expected7 = expected8 = expected11 = false;
		expected2 = expected3 = expected9 = expected10  = true; 
		
		removeAllGradesTest = new Grades();
		removeAllGradesTest.addGrade(99.0);
		removeAllGradesTest.addGrade(100.0);
		removeAllGradesTest.addGrade(1.0);
		removeAllGradesTest.addGrade(0.0);
		removeAllGradesTest.addGrade(4.28);
		removeAllGradesTest.addGrade(100.0);
		removeAllGradesTest.addGrade(82.0);
	}

	@After
	public void tearDown() throws Exception {
		removeAllGradesTest = null;
	}
	@Test
	public void test1() {
		 assertEquals(expected1, removeAllGradesTest.removeAllGrades(input1));
	}
	@Test
	public void test2() {
		 assertEquals(expected2, removeAllGradesTest.removeAllGrades(input2));
	}
	
	@Test
	public void test3() {
		 assertEquals(expected3, removeAllGradesTest.removeAllGrades(input3));
	}
	@Test
	public void test4() {
		 assertEquals(expected4, removeAllGradesTest.removeAllGrades(input4));
	}
	@Test
	public void test5() {
		 assertEquals(expected5, removeAllGradesTest.removeAllGrades(input5));
	}
	@Test
	public void test6() {
		 assertEquals(expected6, removeAllGradesTest.removeAllGrades(input6));
	}
	@Test
	public void test7() {
		 assertEquals(expected7, removeAllGradesTest.removeAllGrades(input7));
	}
	@Test
	public void test8() {
		 assertEquals(expected8, removeAllGradesTest.removeAllGrades(input8));
	}
	@Test
	public void test9() {
		 assertEquals(expected9, removeAllGradesTest.removeAllGrades(input9));
	}
	@Test
	public void test10() {
		 assertEquals(expected10, removeAllGradesTest.removeAllGrades(input10));
	}
	@Test
	public void test11() {
		 assertEquals(expected11, removeAllGradesTest.removeAllGrades(input11));
	}
	
	


}















