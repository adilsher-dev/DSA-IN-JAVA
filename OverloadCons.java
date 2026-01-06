class Student{
    int id;
    String name;
    double marks;

    Student(){//default constructor....
    }
    Student(int id,String name){//parametrized constructor....
        this.id = id;
        this.name = name;
    }
    //overload the cons and how we can see below code \
    Student(int id,String name,double marks){
        this(id, name);
        this.marks = marks;
    }

    public void display(){
        System.out.println(id + " " + name + " " + marks);
    }
}

public class OverloadCons{
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student(1,"adil");
        Student obj2 = new Student(1,"adil",3.334);

        obj.display();
        obj1.display();
        obj2.display();
    }
}
