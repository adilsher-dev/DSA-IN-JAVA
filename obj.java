abstract class Vehicle{

    abstract void start();//there is no body of this method thats why it is abstract

    public void fuelType(){
        System.out.println("This is the abstract class method Fueltype");
    }
}

class Car extends Vehicle{

    void start(){
        System.out.println("This is the override method In car from vehicle");
    }
}


public class obj {
    public static void main(String[] args) {
        Vehicle c = new Car();//abstract class ka reference to le skte hai par obj nhi bana skte hai hum oohk..
        c.fuelType();
        c.start();
    }
}
//supprots the runtime polymorphism