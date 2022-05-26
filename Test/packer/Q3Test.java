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
    }@Test  
    public void testcase2()throws Exception{
        var q3 = new Q3();
       // assertSame("TEST CASE 1:","agdevi ",q3.solution("vaagdevi college", 2, 8));
       assertEquals("agdevi " ,q3.solution("vaagdevi college", 2, 8));
    }@Test  
    public void testcase3()throws Exception{
        var q3 = new Q3();
       // assertSame("TEST CASE 1:","java",q3.solution("java lab", 0, 3));
       assertEquals("java" ,q3.solution("java lab", 0, 3));
    }@Test  
    public void testcase4()throws Exception{
        var q3 = new Q3();
       // assertSame("TEST CASE 1:","c l",q3.solution("c language", 0, 2));
       assertEquals("c l" ,q3.solution("c language", 0, 2));
    }@Test  
    public void testcase5()throws Exception{
        var q3 = new Q3();
       // assertSame("TEST CASE 1:","no_cr",q3.solution("techno_craft", 4, 8));
       assertEquals("no_cr" ,q3.solution("techno_craft", 4, 8));
    }@Test  
    public void testcase6()throws Exception{
        var q3 = new Q3();
       // assertSame("TEST CASE 1:","++",q3.solution("c and c++", 7, 8));
       assertEquals("++" ,q3.solution("c and c++", 7, 8));
    }@Test  
    public void testcase7()throws Exception{
        var q3 = new Q3();
       assertEquals("SE" ,q3.solution("CSE", 1, 2));
    }@Test  
    public void testcase8()throws Exception{
        var q3 = new Q3();
       assertEquals("T lab" ,q3.solution("WT lab", 1, 5));
    }@Test  
    public void testcase9()throws Exception{
        var q3 = new Q3();
       assertEquals("TM" ,q3.solution("HTML", 1, 2));
    }@Test  
    public void testcase10()throws Exception{
        var q3 = new Q3();
       assertEquals("_Y_T" ,q3.solution("P_Y_THON", 1, 4));
    }
}

