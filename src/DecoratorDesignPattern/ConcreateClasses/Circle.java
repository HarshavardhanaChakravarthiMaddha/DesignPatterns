package DecoratorDesignPattern.ConcreateClasses;

import DecoratorDesignPattern.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
