package Test.packer;
import static org.junit.Assert.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import main.Q4;

public class Q4Test {
    @Test
    public void testcase1()throws Exception{
       var q4 = new Q4();
       assertEquals( 6, q4.sum(321)," Test case 1");
    }
}
