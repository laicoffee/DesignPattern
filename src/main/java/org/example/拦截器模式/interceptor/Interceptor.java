package org.example.拦截器模式.interceptor;

/**
 * @Author pengwu
 * @Date 2026/3/2 14:57
 * usage
 */
public interface Interceptor {

    void before(String request);

    void after(String request);


}
