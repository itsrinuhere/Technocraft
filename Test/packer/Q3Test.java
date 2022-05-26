package Test.packer;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import main.Q3;

public class Q3Test {
    @Test  
    public void testcase1()throws Exception{
        var q3 = new Q3();
       // assertSame("TEST CASE 1:","ello ",q3.solution("Hello world", 1, 5));
       assertEquals("ello " ,q3.solution("Hello world", 1, 5));
    }
}
