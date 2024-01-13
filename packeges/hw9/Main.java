package hw9;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Circle("Red", 50),
                new Rectangle("Blue", 20, 40),
                new Triangle("Purple", 3, 4, 5)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area is: " + shape.calculateArea());
            System.out.println("Perimeter is: " + shape.calculatePerimeter());
            shape.paint();
            System.out.println("----------------");
        }

        Shape circle1 = new Circle("White", 5);
        Shape circle2 = new Circle("White", 5);
        System.out.println("Equals: " + circle1.equals(circle2));
        System.out.println("HashCode circle1: " + circle1.hashCode());
        System.out.println("HashCode circle2: " + circle2.hashCode());
        System.out.println("----------------");
        Shape rect1 = new Rectangle("Red", 5, 10);
        Shape rect2 = new Rectangle("White", 5,10);
        System.out.println("Equals: " + rect1.equals(rect2));
        System.out.println("HashCode shape1: " + rect1.hashCode());
        System.out.println("HashCode shape2: " + rect2.hashCode());
    }
}
