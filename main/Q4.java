package main;

public class Q4 {
    public  int sum(int n){
        return n==0 ? 1 : n%10+sum(n/100);
      }
}

