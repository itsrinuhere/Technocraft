package Test;
import org.junit.runner.Result;

import javax.swing.JOptionPane;

import org.junit.runner.JUnitCore;  
import org.junit.runner.notification.Failure;

import Test.packer.Q1Test;
import Test.packer.Q2Test;
import Test.packer.Q3Test;
import Test.packer.Q4Test;
import Test.packer.Q5Test;
public class Q {
    public Q(){}
    public void question1(){
        Result result = JUnitCore.runClasses(Q1Test.class);  
        JOptionPane.showMessageDialog(null,"QUESTION 1 with 10 TEST CASE's");
       // System.out.println("QUESTION 1 with 10 TEST CASE's");
        for (Failure fail : result.getFailures()) {  
         JOptionPane.showMessageDialog(null,"ALERT","Not passed "+fail.toString(),JOptionPane.WARNING_MESSAGE);
       //  System.out.println(fail.toString()+"\n");  
        }       
        JOptionPane.showMessageDialog(null, "Successfully passed all the test cases \n ->"+result.wasSuccessful(), "successfully",
        JOptionPane.INFORMATION_MESSAGE);   
       // System.out.println();  
     }
     public void question2(){
        Result result = JUnitCore.runClasses(Q2Test.class); 
        System.out.println("QUESTION 2 with 10 TEST CASE's"); 
        for (Failure fail : result.getFailures()) {  
           System.out.println(fail.toString()+"\n");  
        }          
        System.out.println(result.wasSuccessful());  
     }
     public void question3(){
        Result result = JUnitCore.runClasses(Q3Test.class);  
        System.out.println("QUESTION 3 with 10 TEST CASE's");
        for (Failure fail : result.getFailures()) {  
           System.out.println(fail.toString()+"\n");  
        }          
        System.out.println(result.wasSuccessful());  
     }
     public void question4(){
        Result result = JUnitCore.runClasses(Q4Test.class);  
        System.out.println("QUESTION 4 with 10 TEST CASE's");
        for (Failure fail : result.getFailures()) {  
           System.out.println(fail.toString()+"\n");  
        }          
        System.out.println(result.wasSuccessful());  
     } public void question5(){
        Result result = JUnitCore.runClasses(Q5Test.class);  
        System.out.println("QUESTION 5 with 10 TEST CASE's");
        for (Failure fail : result.getFailures()) {  
           System.out.println(fail.toString()+"\n");  
        }          
        System.out.println(result.wasSuccessful());  
     }
}
