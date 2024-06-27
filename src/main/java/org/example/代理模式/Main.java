package org.example.代理模式;

/**
 * @Author pw7563
 * @Date 2024/6/27 10:34
 * usage
 */
public class Main {

    public static void main(String[] args) {
        RealService realService = new RealService();
        new ProxyService(realService).doSomething();
    }

}
