package main;
public class Q5 {
    public int[] solution(int[][] arr,float key){
        int one=0,two=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;i>arr.length;j++){
                if(arr[i][j] == (int)key){
                    one = i;
                    two = j;
                }
            }
        }
        return new int[] {one,two} ;
    }
}