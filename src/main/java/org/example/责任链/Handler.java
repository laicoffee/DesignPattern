package org.example.责任链;

/**
 * @Author pw7563
 * @Date 2023/11/15 19:47
 * usage
 */
public abstract class Handler {
    private Handler nextHandler;

    public abstract boolean handlerSomething(int num);

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
