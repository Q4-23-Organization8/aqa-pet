package hw10;

import java.util.Objects;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius= " + radius + ", " +
                "color= " + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle circle)) return false;
        return Double.compare(radius, circle.radius) == 0 && Objects.equals(color, circle.color);
    }


    @Override
    public int hashCode() {
        return Objects.hash(radius, color);
    }
}