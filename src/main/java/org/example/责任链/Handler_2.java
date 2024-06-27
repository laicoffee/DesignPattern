package org.example.责任链;

/**
 * @Author pw7563
 * @Date 2023/11/15 19:51
 * usage
 */
public class Handler_2 extends Handler{
    @Override
    public boolean handlerSomething(int num) {
        if(num < 20){
            System.out.println("Handler_2"+"处理了");
            return true;
        }
        if(getNextHandler() == null){
            System.out.println("大家都没办法处理");
            return false;
        }
        return getNextHandler().handlerSomething(num);
    }
}

