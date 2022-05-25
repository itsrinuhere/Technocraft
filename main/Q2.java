package main;
public class Q2 {
   public int[] add(int n){
       int sub=0,mul=0,add=0;
        for(int i=1;i<=n;i++){
                add +=(i+i);
                sub += i-i;
                mul += i * i; 
        }
        return new int[]{add,sub,mul};
    }
}
