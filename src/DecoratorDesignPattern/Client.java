package DecoratorDesignPattern;

import DecoratorDesignPattern.ConcreateClasses.Circle;
import DecoratorDesignPattern.ConcreateClasses.Rectangle;
import DecoratorDesignPattern.Decorators.BlueShapeDecorator;
import DecoratorDesignPattern.Decorators.RedShapeDecorator;

public class Client {
    public static void main(String[] args){
        Shape circle= new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        Shape redCircle = new RedShapeDecorator(new Circle());
        System.out.println("\nCircle of red border");
        redCircle.draw();

        Shape blueCircle = new BlueShapeDecorator(new Circle());
        System.out.println("\nCircle of blue border");
        blueCircle.draw();

        Shape blueRectangle = new BlueShapeDecorator(new Rectangle());
        System.out.println("\n Rectangle of blue border");
        blueRectangle.draw();

        Shape mixCircle = new BlueShapeDecorator(new RedShapeDecorator(new Circle()));
        System.out.println("\n Circle of Mixed border");
        mixCircle.draw();

    }
}
