package Test.packer;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import main.Q1; 
public class Q1Test {
    @Test  
    public void testcase1()throws Exception{
        var q1 = new Q1();
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        assertEquals("test case 1:", 30,q1.sumOfDiagnal(arr));
    }
    @Test  
    public void testcase2()throws Exception{
        var q1 = new Q1();
        int[][] arr ={{2,4,5},{5,6,1},{0,9,3}};
        assertEquals("test case 2:", 22,q1.sumOfDiagnal(arr));
    }//2nd test case
    @Test  
    public void testcase3()throws Exception{
        var q1 = new Q1();
        int[][] arr ={{9,5,8},{3,7,4},{9,6,8}};
        assertEquals("test case 3:", 48,q1.sumOfDiagnal(arr));
    }//3rd test case
    @Test  
    public void testcase4()throws Exception{
        var q1 = new Q1();
        int[][] arr ={{1,5,3},{8,4,9},{3,7,5}};
        assertEquals("test case 4:", 20,q1.sumOfDiagnal(arr));
    }//4th test case
    @Test  
    public void testcase5()throws Exception{
        var q1 = new Q1();
        int[][] arr ={{7,2,10},{2,5,4},{6,1,9}};
        assertEquals("test case 5:", 42,q1.sumOfDiagnal(arr));
    }//5th test case
    @Test  
    public void testcase6()throws Exception{
        var q1 = new Q1();
        int[][] arr ={{1,4,9},{3,7,5},{0,2,8}};
        assertEquals("test case 6:", 32,q1.sumOfDiagnal(arr));
    }
    @Test//6th test case
    public void testcase7()throws Exception{
        var q1 = new Q1();
        int[][] arr ={{5,1,2},{3,9,7},{7,6,4}};
        assertEquals("test case 7:", 36,q1.sumOfDiagnal(arr));
    }@Test//7th test case
    public void testcase8()throws Exception{
        var q1 = new Q1();
        int[][] arr ={{11,4,10},{7,6,5},{4,8,3}};
        assertEquals("test case 8:", 40,q1.sumOfDiagnal(arr));
    }@Test//8th test case
    public void testcase9()throws Exception{
        var q1 = new Q1();
        int[][] arr ={{4,8,1},{7,0,6},{5,4,2}};
        assertEquals("test case 9:", 12,q1.sumOfDiagnal(arr));
    }@Test//9th test case
    public void testcase10()throws Exception{
        var q1 = new Q1();
        int[][] arr ={{11,5,9},{3,1,4},{4,0,2}};
        assertEquals("test case 10:", 28,q1.sumOfDiagnal(arr));  
    }//10th test case
}
