package org.example.责任链;

/**
 * @Author pw7563
 * @Date 2023/11/15 19:52
 * usage
 */
public class Main {
    public static void main(String[] args) {
//        Handler handler1 = new Handler_1();
//        Handler handler2 = new Handler_2();
//        handler1.setNextHandler(handler2);
        Handler handler1 = new HandlerFactory().getHandler();
        handler1.handlerSomething(8);

        handler1.handlerSomething(18);

        handler1.handlerSomething(80);
    }

}
