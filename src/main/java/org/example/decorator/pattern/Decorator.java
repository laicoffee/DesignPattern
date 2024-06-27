package org.example.decorator.pattern;

/**
 * @Author pw7563
 * @Date 2023/11/13 17:01
 * usage
 */
public abstract class Decorator extends Work{
    private Work work;

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    @Override
    void doSomeThing() {
        if(work != null){
            work.doSomeThing();
        }
    }
}

class DecoratorA extends Decorator{

    @Override
    void doSomeThing() {
        System.out.println("日志记录A");
        super.doSomeThing();
    }
}

class DecoratorB extends Decorator{
    @Override
    void doSomeThing() {
        System.out.println("日志记录B");
        super.doSomeThing();
    }
}
// 类似AOP一样，将具体的实现方法用若干的装饰器类装饰起来，而且这n个装饰器类之间会层层装饰
// 1.将具体的实现方法抽象起来
// 2.创建一个抽象的装饰器类，让装饰器类和具体方法联系起来，所以需要继承具体方法类
// 3.要实现装饰效果，则只需要新增装饰器继承父类