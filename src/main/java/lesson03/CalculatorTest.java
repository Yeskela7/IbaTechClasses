package lesson03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator c = new Calculator();
        assertEquals(4,c.add(2,2));
    }

    @Test
    void sub() {
        Calculator c = new Calculator();
        assertEquals(4,6,2);
    }
}