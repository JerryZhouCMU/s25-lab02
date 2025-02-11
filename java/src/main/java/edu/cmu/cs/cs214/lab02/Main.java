package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3); // Declare as Shape
        Renderer renderer = new Renderer(rectangle);
        renderer.draw();

        Shape circle = new Circle(5); // Use Circle
        Renderer renderer2 = new Renderer(circle);
        renderer2.draw();

        Shape square = new Square(4); // Use Square
        Renderer renderer3 = new Renderer(square);
        renderer3.draw();
    }
}
