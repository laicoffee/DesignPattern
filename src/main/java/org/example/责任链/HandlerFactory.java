package org.example.责任链;

/**
 * @Author pw7563
 * @Date 2023/11/15 19:56
 * usage
 */
public class HandlerFactory {
    public Handler getHandler(){
        Handler handler1 = new Handler_1();
        Handler handler2 = new Handler_2();
        handler1.setNextHandler(handler2);
        return handler1;
    }
}
