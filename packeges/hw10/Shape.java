package hw10;

import java.util.Objects;

public abstract class Shape {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    protected abstract double calculateArea();

    protected abstract double calculatePerimeter();

    protected void paint() {
        System.out.println("Shape color is: " + color);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

}
