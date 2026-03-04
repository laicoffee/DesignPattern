package org.example.拦截器模式.interceptor;

/**
 * @Author pengwu
 * @Date 2026/3/2 15:04
 * usage
 */
public class LogInterceptor implements Interceptor {
    @Override
    public void before(String request) {
        System.out.println("[日志]记录请求开始:" + request);
    }

    @Override
    public void after(String request) {
        System.out.println("[日志]记录请求结束：" + request);
    }
}
