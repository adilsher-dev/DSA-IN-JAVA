class Cylinder {
    private int radius;
    private int height;

    // Setter for Radius
    public void setRadius(int r) {
        this.radius = r;
    }

    // Getter for Radius
    public int getRadius() {
        return radius;
    }

    // Setter for Height
    public void setHeight(int h) {
        this.height = h;
    }

    // Getter for Height
    public int getHeight() {
        return height;
    }
}

public class practice {
    public static void main(String[] args) {
        // Create an object of Cylinder
        Cylinder myCylinder = new Cylinder();

        // Use setters to set values
        myCylinder.setRadius(7);
        myCylinder.setHeight(10);

        // Use getters to retrieve values
        System.out.println("Cylinder Radius: " + myCylinder.getRadius());
        System.out.println("Cylinder Height: " + myCylinder.getHeight());
    }
}
