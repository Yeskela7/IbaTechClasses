package lesson22_dec4;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RandomStringTest {

    @Test
    void filterStr(String origin) {
        origin = "aaa";
        assertEquals("a", RandomString.filterStr(origin));

    }
}