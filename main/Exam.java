package main;
class Function{
    private int[] param;
    private int key;
    Function(int[] param, int key){
        this.param = param;
        this.key = key;
    }
    public void display(){
        for(int i =0;i<param.length;i++){
            if(param[i] == key){
                System.out.println("key found at" + i );
            }
            else{
                System.out.println("not found"+i);
            }
        }
    }
}
public class Exam {
 
public static void main(String[] args){
    int[] ar= {5, 7, 10, 20};
    int key = 5;
    Function obj = new Function(ar, key);
    obj.display();
}
}

