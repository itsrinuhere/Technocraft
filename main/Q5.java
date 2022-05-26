package main;
public class Q5 {
    public boolean solution(String input){
        String  reverseStr = "";
    
        int strLength = input.length();
    
        for (int i = (strLength - 1); i >=0; --i) {
          reverseStr = reverseStr + input.charAt(i);
        }
    
        if (input.toLowerCase().equals(reverseStr.toLowerCase())) {
        return false;
        }
        else {
          return true;
        }
      
    }
   
}