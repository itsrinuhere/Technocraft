package Test;
import org.junit.runner.Result;  
import org.junit.runner.JUnitCore;  
import org.junit.runner.notification.Failure;
import Test.packer.TestAdd;
public class Q {
    public Q(){}
    public void question1(){
        Result result = JUnitCore.runClasses(TestAdd.class);  
        System.out.println("QUESTION 1");
        for (Failure fail : result.getFailures()) {  
           System.out.println(fail.toString()+"\n");  
        }          
        System.out.println(result.wasSuccessful());  
     }
     public void question2(){
        Result result = JUnitCore.runClasses(TestAdd.class); 
        System.out.println("QUESTION 2"); 
        for (Failure fail : result.getFailures()) {  
           System.out.println(fail.toString()+"\n");  
        }          
        System.out.println(result.wasSuccessful());  
     }
     public void question3(){
        Result result = JUnitCore.runClasses(TestAdd.class);  
        System.out.println("QUESTION 3");
        for (Failure fail : result.getFailures()) {  
           System.out.println(fail.toString()+"\n");  
        }          
        System.out.println(result.wasSuccessful());  
     }
     public void question4(){
        Result result = JUnitCore.runClasses(TestAdd.class);  
        System.out.println("QUESTION 4");
        for (Failure fail : result.getFailures()) {  
           System.out.println(fail.toString()+"\n");  
        }          
        System.out.println(result.wasSuccessful());  
     } public void question5(){
        Result result = JUnitCore.runClasses(TestAdd.class);  
        System.out.println("QUESTION 5");
        for (Failure fail : result.getFailures()) {  
           System.out.println(fail.toString()+"\n");  
        }          
        System.out.println(result.wasSuccessful());  
     }
}
