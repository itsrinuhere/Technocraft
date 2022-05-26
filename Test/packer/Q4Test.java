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
    }@Test
    public void testcase2()throws Exception{
       var q4 = new Q4();
       assertEquals( 11, q4.sum(542)," Test case 2");
    }@Test
    public void testcase3()throws Exception{
       var q4 = new Q4();
       assertEquals( 9, q4.sum(6012)," Test case 3");
    }@Test
    public void testcase4()throws Exception{
       var q4 = new Q4();
       assertEquals( 5, q4.sum(104)," Test case 4");
    }@Test
    public void testcase5()throws Exception{
       var q4 = new Q4();
       assertEquals( 24, q4.sum(987)," Test case 5");
    }@Test
    public void testcase6()throws Exception{
       var q4 = new Q4();
       assertEquals( 5, q4.sum(500)," Test case 6");
    }@Test
    public void testcase7()throws Exception{
       var q4 = new Q4();
       assertEquals( 9, q4.sum(153)," Test case 7");
    }@Test
    public void testcase8()throws Exception{
       var q4 = new Q4();
       assertEquals( 9, q4.sum(9000)," Test case 8");
    }@Test
    public void testcase9()throws Exception{
       var q4 = new Q4();
       assertEquals( 13, q4.sum(490)," Test case 9");
    }@Test
    public void testcase10()throws Exception{
       var q4 = new Q4();
       assertEquals( 11, q4.sum(650)," Test case 10");
    }
}



