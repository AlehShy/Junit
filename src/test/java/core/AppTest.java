package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

	@BeforeClass
	public static void beforeClass() throws Exception {
		//System.out.println("BeforeClass method will be executed before first test method starts");
	}

	@AfterClass
	public static void afterClass() throws Exception {
		//System.out.println("AfterClass method will be executed after last test method completed");
	}

	@Before
	public void before() throws Exception {
		//System.out.println("Before method will execute before every test method");
	}

	@After
	public void after() throws Exception {
		//System.out.println("AfterClass method will be executed after last test method completed");
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	@Test
	public void Test_01_assertEquals_Positive() {
		//System.out.println("Test_01_assertEquals_Positive");		
		assertEquals(("failure-strings are not equals"), "Testing JUnit 4", App.s);
		
	}

	@Test
	public void Test_02_assertEquals_Negative() {
		//System.out.println("Test_02_assertEquals_Negative");
		assertEquals(("failure-strings are not equals"), "Testing TestNG 6", App.s);
	}

	@Ignore
	@Test
	public void Test_03_assertEquals_Ignored() {
		//System.out.println("Test_03_assertEquals_Ignored");
		assertEquals(("failure-strings are not equals"), "Testing JUnit 3", App.s);

	}

	@Test
	public void Test_04_AssertSame_Positive() {
		//System.out.println("Test_04_AssertSame_Positive");
		assertSame("should be the same", 55, App.i);

	}

	@Test
	public void Test_05_AssertSame_Negative() {
		//System.out.println("Test_05_AssertSame_Negative");
		assertSame("should be the same", 435, App.i);

	}

	@Ignore
	@Test
	public void Test_06_AssertSame_Ignored() {
		//System.out.println("Test_06_AssertSame_Ignored");
		assertSame("should be the same", 234634, App.i);

	}

	@Test
	public void Test_07_assertFalse_Positive() {
		//System.out.println("Test_07_assertFalse_Positive");		
		assertFalse("failure - Boolean shoild be false", App.f);
		
	}

	@Test
	public void Test_08_assertFalse_Negative() {
		//System.out.println("Test_08_assertFalse_Negative");	
		assertFalse("failure - Boolean shoild be false", App.t);

	}

	@Test
	public void Test_09_assertTrue_Positive() {
		//System.out.println("Test_09_assertTrue_Positive");	
		assertTrue("failure - Boolean should be true", App.t);
	}

	

	@Test
	public void Test_10_assertTrue_Negative() {
		//System.out.println("Test_10_assertTrue_Negative");		
		assertTrue("failure - Boolean should be true", App.f);

	}

}
