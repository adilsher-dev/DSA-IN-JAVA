class Cylinder {
    private int radius;
    private int height;

    // Constructor: This runs when you type 'new Cylinder(...)'
    public Cylinder(int r, int h) {
        this.radius = r; // 'this' helps avoid confusion between parameter and variable
        this.height = h;
    }

    // Getters remain necessary to see the values later
    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
}

public class practice1 {
    public static void main(String[] args) {
        // Now you set values directly during object creation!
        Cylinder myCylinder = new Cylinder(7, 10);
        System.out.println("Radius from constructor: " + myCylinder.getRadius());
        System.out.println("Height from constructor: " + myCylinder.getHeight());
    }
}

