package DecoratorDesignPattern.Decorators;

import DecoratorDesignPattern.Shape;
import DecoratorDesignPattern.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shapeDecorator) {
        super(shapeDecorator);
    }
    @Override
    public void draw() {
        shapeDecorator.draw();
        setRedBorder(shapeDecorator);

    }
    protected  void setRedBorder(Shape shapeDecorator){
        System.out.println("Border Colour: Red");
    }

}
