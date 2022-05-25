package Test.packer;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import main.Q2; 
public class Q2Test {
    @Test  
    public void testcase1()throws Exception{
        var q2 = new Q2();
       
        assertArrayEquals("test case 1:",
         new int[] {30,0,55,},q2.add(5));
    }
}
