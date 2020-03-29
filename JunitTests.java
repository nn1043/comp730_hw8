package HW8;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.test;

class JunitTests {
    void test1() {
        System.out.println("Test 1");
        assertEquals("red", PublisherImplementation.RegisterObservers("red"));
    }
    
    void test2() {
        System.out.println("Test 2");
        private Event e = new Event();
        assertEquals("Event " + e.getNumber() + " is odd: " + e.getData(), SubscriberOdds.notifyObserver(e));
    }
}