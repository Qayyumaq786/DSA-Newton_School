package oops.inheritence;

public class Circle extends Shape {

    private final double radius;

    public Circle(int shapeId, double radius){
        super(shapeId);
        this.radius = radius;
    }

    // Method Overriding
    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public double getRadius(){
        return radius;
    }
}
