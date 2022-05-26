package Test.packer;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import main.Q2;

public class Q2Test {
    @Test
    public void testcase1() throws Exception {
        var q2 = new Q2();
        assertArrayEquals("test case 1:",
                new int[] { 30, 0, 55, }, q2.add(5));
    }

    @Test
    public void testcase2() throws Exception {
        var q2 = new Q2();
        assertArrayEquals("test case 2:",
                new int[] { 20, 0, 30, }, q2.add(4));
    }

    @Test
    public void testcase3() throws Exception {
        var q2 = new Q2();
        assertArrayEquals("test case 3:",
                new int[] { 42, 0, 91, }, q2.add(6));
    }

    @Test
    public void testcase4() throws Exception {
        var q2 = new Q2();
        assertArrayEquals("test case 4:",
                new int[] { 12, 0, 14, }, q2.add(3));
    }

    @Test
    public void testcase5() throws Exception {
        var q2 = new Q2();
        assertArrayEquals("test case 5:",
                new int[] { 72, 0, 204, }, q2.add(8));
    }

    @Test
    public void testcase6() throws Exception {
        var q2 = new Q2();
        assertArrayEquals("test case 6:",
                new int[] { 6, 0, 5, }, q2.add(2));
    }

    @Test
    public void testcase7() throws Exception {
        var q2 = new Q2();
        assertArrayEquals("test case 7:",
                new int[] { 90, 0, 285, }, q2.add(9));
    }

    @Test
    public void testcase8() throws Exception {
        var q2 = new Q2();
        assertArrayEquals("test case 8:",
                new int[] { 110, 0, 385, }, q2.add(10));
    }

    @Test
    public void testcase9() throws Exception {
        var q2 = new Q2();
        assertArrayEquals("test case 9:",
                new int[] { 156, 0, 650, }, q2.add(12));
    }

    @Test
    public void testcase10() throws Exception {
        var q2 = new Q2();
        assertArrayEquals("test case 10:",
                new int[] { 240, 0, 1240, }, q2.add(15));
    }
}
 