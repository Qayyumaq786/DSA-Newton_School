package oops.inheritence;

public abstract class Shape {
    public static final String shapeName = "GenericShape";
    private final int shapeId;

    public Shape(int shapeId){
        this.shapeId = shapeId;
    }

    public int getShapeId(){
        return shapeId;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
