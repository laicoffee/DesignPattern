package org.example.拦截器模式.around.interceptor;

/**
 * @Author pengwu
 * @Date 2026/3/2 16:08
 * usage
 */
public class 环绕拦截器 {

    static class Request{

    }

    static class Response{

    }

    static interface ModelCallHandler{
        Response handler(Request request);
    }

    static interface ModelInterceptor{
        Response interceptor(Request request, ModelCallHandler handler);
    }

    static class LogInterceptor implements ModelInterceptor{
        @Override
        public Response interceptor(Request request, ModelCallHandler handler) {
            System.out.println("【日志拦截器-前置操作】");

            Response response = handler.handler(request);

            System.out.println("【日志拦截器-后置操作】");

            return response;
        }
    }

    static class AuthInterceptor implements ModelInterceptor{
        @Override
        public Response interceptor(Request request, ModelCallHandler handler) {
            System.out.println("【鉴权拦截器-前置操作】");

            Response response = handler.handler(request);

            System.out.println("【鉴权拦截器-后置操作】");

            return response;
        }
    }

    public static void main(String[] args) {
        ModelCallHandler businessCall = (request)->{
            System.out.println("这是业务动作");
            return new Response();
        };

        ModelInterceptor authInterceptor = new AuthInterceptor();
        ModelInterceptor logInterceptor = new LogInterceptor();

        ModelCallHandler logCallHandler = request -> {
            return authInterceptor.interceptor(request, businessCall);
        };

        ModelCallHandler authCallHandler = request -> {
            return authInterceptor.interceptor(request, logCallHandler);
        };

        authCallHandler.handler(null);
    }


}
