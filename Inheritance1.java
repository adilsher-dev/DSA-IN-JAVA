class Parent{
    Parent(){
        System.out.println("Parent Default constructor");
    }
    Parent(int a,int b){
        System.out.println("Parent parametrized Constructor");
    }
}

class Child extends Parent{
    Child(){
        super(10,20);//iski wjh se parametrized cons call hoga na ki defualt cons...
        System.out.println("Child constructor");
    }
}


public class Inheritance1 {
    public static void main(String[] args) {
       // Child obj = new Child();
    }
}
