package Test;
import javax.swing.*;  
public class TestRunner{  
 static JFrame f=new JFrame(); 
  void select(){
    Object[] options1 = { "Question 1", "Question 2",
                "Question 3","Question 4","Question 5" };
                JPanel panel = new JPanel();
                panel.add(new JLabel("select any one option\n 1.sum of Diagnal with 2D Array\n2.sum of arithmatic operation's"));
  int input = JOptionPane.showOptionDialog(f,
  panel,"BUGG BIZZ .", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
  null, options1, null); 
 int sure =JOptionPane.showConfirmDialog(f,"youre select "+options1[input]);
 if(sure == JOptionPane.YES_OPTION){
 if(input ==0){
  new Q().question1();
 }else if(input ==1){
  new Q().question2();
 }else 
 if(input ==2){
    new Q().question3();
  }
   else
    if(input ==3){
      new Q().question4();
    }else if(input == 4 ){
        new Q().question5();
      }else{
  System.exit(0);
}
}else if(sure == JOptionPane.NO_OPTION){
  System.exit(0);
 }
 else{
  select();
 }
  }
   public static void main(String[] args){
    
         try{
       new TestRunner().select(); 
       System.exit(0);
     }catch(Exception ex){
      JOptionPane.showMessageDialog(f,ex.toString(),"Alert",JOptionPane.WARNING_MESSAGE);
     }  
    
   }  
}