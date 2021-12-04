package testing;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.Grades;

public class PassingGradeTests {
	private Grades g;
//	ByteArrayOutputStream outb = new ByteArrayOutputStream();
//	PrintStream outp = System.out;
	

	@Before
	public void setUp() throws Exception {
		g = new Grades();
		g.addGrade(99.0);
		g.addGrade(100.0);
		g.addGrade(1.0);
		g.addGrade(0.0);
		g.addGrade(4.28);
		g.addGrade(100.0);
		g.addGrade(82.0);
	}

	@After
	public void tearDown() throws Exception {
		g = null;
	}

	@Test
	public void test() {
		double a = 99.0, b = 35.25;
		
		String expected = "Added grades not sufficient!";
		assertEquals(expected,g.passingGrade(a, b));
	}
	
	@Test
	public void test2() {
		double a = 70.5, b = 70.0;
		
		String expected = "Added grades not sufficient!";
		assertEquals(expected,g.passingGrade(a, b));
	}
	
	@Test
	public void testPassingGrade4_3() {
		double a = 75.0, b = 70.5;		
		String expected = "Added grades not sufficient!";
		assertEquals(expected,g.passingGrade(a, b));
	}
	
	@Test
	public void testPassingGrade4_4() {
		double a = 80.0, b = 75.0;
		String expected = "Added grades not sufficient!";
		assertEquals(expected,g.passingGrade(a, b));
	}

	@Test
	public void testPassingGrade4_5() {
		double a = 80.0, b = -1.0;
		String expected = "Invalid input";
		assertEquals(expected,g.passingGrade(a, b));
	}
	
	@Test
	public void testPassingGrade4_6() {
		double a = -1.0, b = 80.0;
		String expected = "Invalid input";
		assertEquals(expected,g.passingGrade(a, b));
	}
	
	@Test
	public void testPassingGrade4_7() {
		double a = 80.0, b = 101.0;
		String expected = "Invalid input";
		assertEquals(expected,g.passingGrade(a, b));
	}	
	
	@Test
	public void testPassingGrade4_8() {
		double a = 101.0, b = 80.0;
		String expected = "Invalid input";
		assertEquals(expected,g.passingGrade(a, b));
	}
	
	@Test
	public void testPassingGrade4_9() {
		double a = 80.0, b = 0;
		String expected = "";
		assertEquals(expected,g.passingGrade(a, b));
	}	
	
	@Test
	public void testPassingGrade4_10() {
		double a = 0, b = 80.0;
		String expected = "";
		assertEquals(expected,g.passingGrade(a, b));
	}
	
	@Test
	public void testPassingGrade4_11() {
		double a = 1.0, b = 1.0;
		String expected = "Target average too low";
		assertEquals(expected,g.passingGrade(a, b));
	}
	
	@Test
	public void testPassingGrade4_12() {
		double a = 90.0, b = 297.0;
		String expected = "Invalid input";
		assertEquals(expected,g.passingGrade(a, b));	
	}
	
	@Test
	public void testPassingGrade4_13() {
		double a = 90.0, b = 0;
		String expected = "";
		assertEquals(expected,g.passingGrade(a, b));
	}
	
	@Test
	public void testPassingGrade4_14() {
		double a = 60.0, b = 99.0;
		String expected = "Target average reached";
		assertEquals(expected,g.passingGrade(a, b));
	}

}




