package Test.packer;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

import main.Q5;

public class Q5Test {
    @Test
    public void testcase1()throws Exception{
       var q5 = new Q5();
       assertArrayEquals( new int[]{1,1}, q5.solution(new int[][]{{1,2,3},{5,4,8}},4)," Test case 1");}    
    }
