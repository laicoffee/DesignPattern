package org.example.装饰者模式;

/**
 * @Author pw7563
 * @Date 2023/11/13 20:10
 * usage
 */
public class DecoratorA extends Decorator{
    @Override
    public void doWork() {
        super.doWork();
        System.out.println("日志记录A");
    }
}
