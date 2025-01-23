package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    private double height; // Encapsulate the field
    private double width;  // Encapsulate the field
    
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
