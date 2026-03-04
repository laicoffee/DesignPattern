package org.example.拦截器模式.interceptor;



public class AuthInterceptor implements Interceptor {
    @Override
    public void before(String request) {
        System.out.println("[鉴权] 校验权限: " + request);
    }
    @Override
    public void after(String request) {
        System.out.println("[鉴权] 鉴权结束");
    }
}