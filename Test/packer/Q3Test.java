package Test.packer;
import static org.junit.Assert.assertNotSame;


import org.junit.Test;
import main.Q3;

public class Q3Test {
    @Test  
    public void testcase1()throws Exception{
        var q3 = new Q3();
        assertNotSame("","llo",q3.solution("Hello world", 2, 5));
    }
}
