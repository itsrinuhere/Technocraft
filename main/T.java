package main;
class Result{
    private String Hallticket;
    private int marks;
    public Result(String Hallticket,int marks){
        this.Hallticket=  Hallticket;
        this.marks = marks;
        
    }
   public void execute(){
        if(marks>60){
            displayResult();
        }   else{
            System.out.print("failed");
        }
    }
    private void displayResult(){
        System.out.print("yes passed");
    }
}

public class T {
    public static void main(String[] args){
        Result obj = new Result("5M8",70);
        obj.execute();
    }
}
//private public defualt protected
/*

{
    private  int k;
}
{
    switch(){
        case 1;
        break
        default:
        break;
    }
    obj.k;
}
*/