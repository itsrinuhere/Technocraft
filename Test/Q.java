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
   void dialog(String msg,int alert){
      JOptionPane.showMessageDialog(null,msg);
   }
    public Q(){}
    public void question1(){
        Result result = JUnitCore.runClasses(Q1Test.class);  
        dialog("QUESTION 1 with 10 TEST CASE's", JOptionPane.INFORMATION_MESSAGE);
       // System.out.println("QUESTION 1 with 10 TEST CASE's");
        for (Failure fail : result.getFailures()) {  
         JOptionPane.showMessageDialog(null,"ALERT","Not passed "+fail.toString(),JOptionPane.WARNING_MESSAGE); 
        }       
        JOptionPane.showMessageDialog(null, "Successfully passed all the test cases \n ->"+result.wasSuccessful(), "successfully",
        JOptionPane.INFORMATION_MESSAGE);   
       // System.out.println();  
     }
     public void question2(){
        Result result = JUnitCore.runClasses(Q2Test.class); 
        dialog("QUESTION 2 with 10 TEST CASE's", JOptionPane.INFORMATION_MESSAGE); 
        for (Failure fail : result.getFailures()) {  
         dialog(fail.toString()+"\n",JOptionPane.WARNING_MESSAGE);  
        }          
        dialog(" PASSED "+result.wasSuccessful(),JOptionPane.INFORMATION_MESSAGE);  
     }
     public void question3(){
        Result result = JUnitCore.runClasses(Q3Test.class);  
        dialog("QUESTION 3 with 10 TEST CASE's",JOptionPane.INFORMATION_MESSAGE);
        for (Failure fail : result.getFailures()) {  
         dialog(fail.toString()+"\n",JOptionPane.WARNING_MESSAGE); 
        }             
        dialog(" PASSED "+result.wasSuccessful(),JOptionPane.INFORMATION_MESSAGE);  
     }
     public void question4(){
        Result result = JUnitCore.runClasses(Q4Test.class);  
        dialog("QUESTION 4 with 10 TEST CASE's",JOptionPane.INFORMATION_MESSAGE);
        for (Failure fail : result.getFailures()) {  
         dialog(fail.toString()+"\n",JOptionPane.WARNING_MESSAGE); 
        }          
        dialog(" PASSED "+result.wasSuccessful(),JOptionPane.INFORMATION_MESSAGE);  
     } public void question5(){
        Result result = JUnitCore.runClasses(Q5Test.class);  
        dialog("QUESTION 5 with 10 TEST CASE's",JOptionPane.INFORMATION_MESSAGE);
        for (Failure fail : result.getFailures()) {  
         dialog(fail.toString()+"\n",JOptionPane.WARNING_MESSAGE); 
        }          
        dialog(" PASSED "+result.wasSuccessful(),JOptionPane.INFORMATION_MESSAGE);  
     }
}
