class Rectangle {
    private int length;
    private int breadth;

    // Constructor 1: No parameters (sets default values 4 and 5)
    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    // Constructor 2: Custom parameters (sets values provided by user)
    public Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int getLength() { return length; }
    public int getBreadth() { return breadth; }
    
    public int calculateArea() {
        return length * breadth;
    }
}

public class cons {
    public static void main(String[] args) {
        // Using the default constructor (No arguments)
        Rectangle defaultRect = new Rectangle();
        System.out.println("Default Rectangle: " + defaultRect.getLength() + "x" + defaultRect.getBreadth());
        System.out.println("Default Area: " + defaultRect.calculateArea());

        System.out.println("--------------------------");

        // Using the custom constructor (With arguments)
        Rectangle customRect = new Rectangle(10, 20);
        System.out.println("Custom Rectangle: " + customRect.getLength() + "x" + customRect.getBreadth());
        System.out.println("Custom Area: " + customRect.calculateArea());
    }
}
