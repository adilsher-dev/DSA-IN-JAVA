import java.lang.Math;
class Circle{
    public double radius;

    public Circle(double r){
    this.radius = r;
}
    public double area(){
        return  Math.PI * radius * radius;
    }
}

class Cylinder extends Circle{
    public double height;

    Cylinder(double r,double h){
        super(r);
        this.height = h;
    }
    public double volume(){
        return area() * height;
    }
}

public class prac123 {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder(2, 7);
        System.out.println("AREA="+obj.area());
        System.out.println("VOLUME="+obj.volume());
    }
}
