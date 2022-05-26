package Test.packer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

import main.Q5;

public class Q5Test {
    @Test
    public void testcase1()throws Exception{
       var q5 = new Q5();
       assertSame( " Test case 1",true, q5.solution("madam"));}    
    }
