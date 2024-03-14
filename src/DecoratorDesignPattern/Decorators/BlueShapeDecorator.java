package DecoratorDesignPattern.Decorators;

import DecoratorDesignPattern.Shape;
import DecoratorDesignPattern.ShapeDecorator;

public class BlueShapeDecorator extends ShapeDecorator {
    public BlueShapeDecorator(Shape shapeDecorator) {
        super(shapeDecorator);
    }
    @Override
    public void draw()
    {
        shapeDecorator.draw();
        setBlueBorder(shapeDecorator);
    }
    protected  void setBlueBorder(Shape shapeDecorator)
    {
        System.out.println("Border Colour: Blue");
    }
}
