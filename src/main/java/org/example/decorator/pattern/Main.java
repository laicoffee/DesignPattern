package org.example.decorator.pattern;

/**
 * @Author pw7563
 * @Date 2023/11/13 17:06
 * usage
 */
public class Main {
    public static void main(String[] args) {
        Work work = new ConcreteWork();
        Decorator decoratorA = new DecoratorA();
        Decorator decoratorB = new DecoratorB();
        decoratorA.setWork(work);
        decoratorB.setWork(decoratorA);
        decoratorB.doSomeThing();
    }
}
