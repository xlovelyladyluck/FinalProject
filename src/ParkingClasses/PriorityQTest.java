package ParkingClasses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PriorityQTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	final void testInsert() {
		ParkingLot testArray[];
		int num = 1;
		testInsert(num);
		assertEquals(1, num);
		
	}

	@Test
	final void testRemove() {
		ParkingLot testArray[];
		testRemove();
		assertEquals(0,0);
		
	}

	@Test
	final void testPeekMin() {
		ParkingLot testArray[];
		testPeekMin();
		assertEquals(0,0);
	}

	@Test
	final void testIsEmpty() {
		ParkingLot testArray[];
		testIsEmpty();
		assertTrue(0);
		
	}

	@Test
	final void testIsFull() {
		ParkingLot testArray[];
		testIsFull();
		assertFalse(1)
	}

}
