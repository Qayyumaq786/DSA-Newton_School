package oops.inheritence;

public class Executer {
    public static void main(String[] args) {
        Circle c1 = new Circle(1, 5);

        System.out.println(c1.getShapeId());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getRadius());

        Shape s1 = new Circle(2,6);
        System.out.println(s1.getShapeId());
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());

    }
}
