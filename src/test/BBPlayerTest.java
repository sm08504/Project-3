package test;

import assignment.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BBPlayerTest {

	BBPlayer bbp;
	
	@Before
	public void setUp() throws Exception {
		bbp = new BBPlayer("Daffy", "Duck", 900123456);
	}

	@After
	public void tearDown() throws Exception {
		bbp = null;
	}

	@Test
	public void testGetNSetNumGamesPlayed01() { //sunny day
		int expected = 10;
		bbp.setNumGamesPlayed(expected);
		int actual = bbp.getNumGamesPlayed();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNSetNumGamesPlayed02() { //can I play negative number of games?
		int expected = 0;
		bbp.setNumGamesPlayed(expected);
		int actual = bbp.getNumGamesPlayed();
		assertEquals(expected, actual);
	}

	@Test
	public void testBBPlayerConstructor01() { // good data to constructor
		try {
			bbp = new BBPlayer("Daffy", "Duck", 900123456);
			assertNotNull(bbp);
		} catch (InvalidEagleIDException e) {
			fail("Incorectly throws InvalidEagleIDException");
		}
	}

	@Test(expected = InvalidEagleIDException.class)
	public void testBBPlayerConstructor02() throws InvalidEagleIDException { // eid did not begin with 900
			bbp = new BBPlayer("Daffy", "Duck", 100123456);
			fail("did not throw InvalidEagleIDException");
		}

	@Test(expected = InvalidEagleIDException.class)
	public void testBBPlayerConstructor03() throws InvalidEagleIDException { // eid less than 9 digits
			bbp = new BBPlayer("Daffy", "Duck", 90012345);
			fail("did not throw InvalidEagleIDException");
		}

	@Test(expected = InvalidEagleIDException.class)
	public void testBBPlayerConstructor04() throws InvalidEagleIDException { // eid more than 9 digits
			bbp = new BBPlayer("Daffy", "Duck", 0001234567);
			fail("did not throw InvalidEagleIDException");
		}

	@Test
	public void testGetNSetNumGamesStarted01() { //all is well
		int expected = 10;
		bbp.setNumGamesStarted(expected);
		int actual = bbp.getNumGamesStarted();
		assertEquals(expected, actual);
	}

	@Test
	public void testCalcGamesStartedPercentage() {
		double expected = 33.333;
		bbp.setNumGamesPlayed(30);
		bbp.setNumGamesStarted(10);
		double actual = bbp.calcGamesStartedPercentage();
		assertEquals(expected, actual,0.05);
	}

	@Test
	public void testGetNSetFieldGoalsAttempted() {
		int expected = 50;
		bbp.setFieldGoalsAttempted(expected);
		int actual = bbp.getFieldGoalsAttempted();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNSetFieldGoalsMade() {
		int expected = 30;
		bbp.setFieldGoalsMade(expected);
		int actual = bbp.getFieldGoalsMade();
		assertEquals(expected, actual);
	}

	@Test
	public void testCalcFieldGoalPercentage() {
		double expected = 60.00;
		bbp.setFieldGoalsAttempted(50);
		bbp.setFieldGoalsMade(30);
		double actual = bbp.calcFieldGoalPercentage();
		assertEquals(expected, actual,0.00);
	}

}
