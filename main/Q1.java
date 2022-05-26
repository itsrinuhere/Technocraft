package main;
public class Q1 {
    
    public int sumOfDiagnal(int[][] arr){
        int left=0,right=0;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
        if(i == j){
            left+=arr[j][i];
        }
        if((i+j) == (arr.length+1))
        right += arr[i][j];
        }
    }
    return Math.abs(right+left);
    }
}