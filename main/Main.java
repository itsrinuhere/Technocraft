package main;
abstract class Student{
    abstract boolean study();
    abstract boolean exam();
}
class Srinivas extends Student{
    private int attendence, marks;
    public Srinivas(int attendence, int marks){
        this.attendence = attendence;
        this.marks = marks;
    }
    @Override
    boolean study(){
        if(attendence >= 60)
            return true;
            else
            return false;
    }
    @Override
    boolean exam(){
        if(marks >=60)
        return true;
        else 
        return false;
    }
}
public class Main {

    public static void main(String[] args){
        Student obj ;
        obj = new Srinivas(60, 50);
        System.out.println("is srinivas studied : "+obj.study());
        System.out.println("is srinivas passed the exam  :"+ obj.exam());
       
    }
}
