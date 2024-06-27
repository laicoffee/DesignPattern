package org.example.decorator.fault;

/**
 * @Author pw7563
 * @Date 2023/11/13 16:37
 * usage
 */
public class Main {
    public static void main(String[] args) {
        Shape circle = new circle();
        Decorator decoratorA = new DecoratorA();
        Decorator decoratorB = new DecoratorB();
        decoratorA.docoretor(circle);
        decoratorB.docoretor(circle);
    }
}
