package hw9;

import java.util.Objects;

public class Shape {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    protected double calculateArea() {
        return 0.0;
    }


    protected double calculatePerimeter() {
        return 0.0;
    }

    protected void paint() {
        System.out.println("SHape color is: " + color);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

}
