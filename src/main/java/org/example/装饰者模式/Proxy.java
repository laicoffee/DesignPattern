package org.example.装饰者模式;

/**
 * @Author pw7563
 * @Date 2023/11/13 19:56
 * usage
 */
public class Proxy {
    private Work work;

    public void doWork(){
        if(work == null){
            work = new RealWork();
        }
        Decorator decoratorA = new DecoratorA();
        Decorator decoratorB = new DecoratorB();
        decoratorA.setWork(work);
        decoratorB.setWork(decoratorA);
        decoratorB.doWork();
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
}
