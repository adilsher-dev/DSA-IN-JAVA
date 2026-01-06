class Animal{
    String name;

    public void bark(){
        System.out.println("Animal Bark");
    }

    public void eat(){
        System.out.println("Animal Eat");
    }
}

class Dog extends Animal{
    public void bark1(){
        System.out.println("Dog Bark");
    }
    public void eat(){
        System.out.println("Dog Bark");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.bark();
    }
    
}
