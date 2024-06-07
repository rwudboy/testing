package src.test.java;

import static org.junit.Assert.*;
import src.main.java.*;
import org.junit.Test;

public class CounterTest {

	@Test
	public void testReset() {
		
	}

	@Test
	public void testIncrement() {
		Counter testCounter = new Counter();
		
		for(int i = 1; i <10; i++) {
			testCounter.increment();
			assertEquals(testCounter.getCount(), i);
		}
	}

	@Test
	public void testDecrement() {
		Counter testCounter = new Counter();
	}

}
