package org.example.decorator;

import org.example.decorator.fault.Shape;
import org.example.decorator.fault.circle;

/**
 * @Author pw7563
 * @Date 2023/11/13 16:48
 * usage
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Shape circle = new circle();
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();

        concreteDecoratorA.setComponent(concreteComponent);
        concreteDecoratorB.setComponent(concreteDecoratorA);
        concreteDecoratorB.operation(circle);
    }
}
