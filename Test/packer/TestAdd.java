package Test.packer;
import static org.junit.Assert.assertEquals;
import org.junit.Test; 
import main.Q1; 
public class TestAdd {
    @Test  
    public void testAdd() throws Exception{
        //  var calculator = new Q1();
        Q1 obj = new Q1();
        assertEquals("test case 1:", 4, obj.add(2,2));
        //assert(obj.add(2,2) == 4);
      
    }
}

