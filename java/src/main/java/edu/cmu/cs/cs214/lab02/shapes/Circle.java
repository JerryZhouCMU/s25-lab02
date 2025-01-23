package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    private double radius; // Encapsulate the field

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
