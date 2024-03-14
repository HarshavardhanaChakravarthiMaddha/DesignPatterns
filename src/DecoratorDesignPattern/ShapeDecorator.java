package DecoratorDesignPattern;

import DecoratorDesignPattern.Shape;

public class ShapeDecorator implements Shape {
    //To implement wrapper.
    protected Shape shapeDecorator;
    public ShapeDecorator(Shape shapeDecorator) {
        this.shapeDecorator=shapeDecorator;

    }

    @Override
    public void draw() {
        shapeDecorator.draw();

    }
}
