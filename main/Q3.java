package main;
public class Q3 {
   public String solution(String var,int i ,int j ){
    String value="";  
    for(int m=i;m<=j;m++){
        value +=var.charAt(m);
      }
    return value;
   } 
}
