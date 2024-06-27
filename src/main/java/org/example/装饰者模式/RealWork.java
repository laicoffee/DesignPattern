package org.example.装饰者模式;

/**
 * @Author pw7563
 * @Date 2023/11/13 19:56
 * usage
 */
public class RealWork implements Work{
    @Override
    public void doWork() {
        System.out.println("开始做一些真正的事情");
    }
}
