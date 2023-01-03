import junit.framework.TestCase;

import java.util.Arrays;

public class ReverseIntegerTest extends TestCase {

    public void testProfit1(){
        int x = 123;
        int actual = Main.Solution.reverse(x);
        int expected = 321;
        assertEquals(expected, actual);
    }

    public void testProfit2(){
        int x = -123;
        int actual = Main.Solution.reverse(x);
        int expected = -321;
        assertEquals(expected, actual);
    }
}
