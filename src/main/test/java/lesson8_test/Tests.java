package lesson8_test;
import lesson08_oct28.warmup.Solution;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests
{
    private String input;
    Solution solution = new Solution();

    @Before
    public void before(){;
    }


    @Test
    public void test1(){
        String string = " ";
        assertEquals(0, solution.inplementation(string));
    }
    @Test
    public void test2(){
        String string = "1 2 3";
        assertEquals(6, solution.inplementation(string));
    }
    @Test
    public void test3(){
        String string = "1 2a 3";
        assertEquals(4, solution.inplementation(string));
    }
    @Test
    public void test4(){
        String string = "asd  sda";
        assertEquals(0, solution.inplementation(string));
    }
}
