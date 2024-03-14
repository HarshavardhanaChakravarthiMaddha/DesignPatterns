package DecoratorDesignPattern.Decorators;

import DecoratorDesignPattern.Shape;
import DecoratorDesignPattern.ShapeDecorator;

public class GreenShapeDecorator extends ShapeDecorator {
    public GreenShapeDecorator(Shape shapeDecorator) {
        super(shapeDecorator);}
        @Override
        public void draw() {
            shapeDecorator.draw();
        }
        protected  void setGreenBorder(Shape shapeDecorator){
            System.out.println("Border Colour: Green");
        }

}
