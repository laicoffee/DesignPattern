package org.example.代理模式;

/**
 * @Author pw7563
 * @Date 2024/6/27 10:33
 * usage
 */
public class ProxyService implements Service{

    private Service proxyTarget;

    // 需要指定需要被代理的对象
    public ProxyService(Service proxyTarget) {
        this.proxyTarget = proxyTarget;
    }

    @Override
    public void doSomething() {
        System.out.println("我是代理类");
        proxyTarget.doSomething();
    }
}
