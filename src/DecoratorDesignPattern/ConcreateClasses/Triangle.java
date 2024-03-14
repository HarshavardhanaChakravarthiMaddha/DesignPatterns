package DecoratorDesignPattern.ConcreateClasses;

import DecoratorDesignPattern.Shape;

public class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape : Triangle");
    }
}
