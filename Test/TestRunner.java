package Test;
import javax.swing.*;  
public class TestRunner{  
 static JFrame f=new JFrame(); 
  void select(){
    Object[] options1 = { "question 1", "question 2",
                "question 3","question 4","question 5" };
                JPanel panel = new JPanel();
                panel.add(new JLabel("select any one option"));
  int input = JOptionPane.showOptionDialog(f,
  panel,"BUGG BIZZ .", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
  null, options1, null); 
 int sure =JOptionPane.showConfirmDialog(f,"youre select "+options1[input]);
 if(sure == JOptionPane.YES_OPTION){
 
  switch(input){
    case 1: //new Q().question1();
    JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE);
    break;
    case 2: new Q().question2();
    break;
    case 3: new Q().question3();
    break; 
    case 4:  new Q().question4();
    break;
    case 5: new Q().question5();
    break;
    default: JOptionPane.showMessageDialog(f, "something Error Ocured \nplease try again","ERROR OCUURED",JOptionPane.WARNING_MESSAGE);
    break;
  }
  System.exit(0);
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
     }catch(Exception ex){
      JOptionPane.showMessageDialog(f,ex.toString(),"Alert",JOptionPane.WARNING_MESSAGE);
     }   
   }  
}