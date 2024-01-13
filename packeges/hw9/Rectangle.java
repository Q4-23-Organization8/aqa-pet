package hw9;

import java.util.Objects;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length= " + length +
                ", width= " + width +
                ", color= " + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle rectangle)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(length, rectangle.length) == 0 && Double.compare(width, rectangle.width) == 0 && Objects.equals(color, rectangle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length, width, color);
    }
}
