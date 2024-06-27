package org.example.decorator.pattern;

/**
 * @Author pw7563
 * @Date 2023/11/13 17:01
 * usage
 */
public class ConcreteWork extends Work{
    @Override
    void doSomeThing() {
        System.out.println("this is the main thing that you need to do");
    }
}
