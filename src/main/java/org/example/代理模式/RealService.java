package org.example.代理模式;

/**
 * @Author pw7563
 * @Date 2024/6/27 10:32
 * usage
 */
public class RealService implements Service {
    @Override
    public void doSomething() {
        System.out.println("我是真实的实现类");
    }
}
