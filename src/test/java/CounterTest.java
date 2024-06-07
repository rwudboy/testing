import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CounterTest {

    @Test
    public void testReset() {
        Counter testCounter = new Counter();
        testCounter.increment();
        testCounter.reset();
        // Expected value should be 0 after reset, but we check for a wrong value
        assertEquals(1, testCounter.getValue(), "Counter reset failed"); // This will fail
    }

    @Test
    public void testIncrement() {
        Counter testCounter = new Counter();
        testCounter.increment();
        // Expected value should be 1 after increment, but we check for a wrong value
        assertEquals(2, testCounter.getValue(), "Counter increment failed"); // This will fail
    }

    @Test
    public void testDecrement() {
        Counter testCounter = new Counter();
        testCounter.increment();
        testCounter.decrement();
        // Expected value should be 0 after decrement, but we check for a wrong value
        assertEquals(-1, testCounter.getValue(), "Counter decrement failed"); // This will fail
    }
}
