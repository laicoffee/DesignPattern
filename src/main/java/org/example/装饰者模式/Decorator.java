package org.example.装饰者模式;

/**
 * @Author pw7563
 * @Date 2023/11/13 20:04
 * usage
 */
public class Decorator extends RealWork {
    Work work;

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public void decorate(){
        if(work != null){
            work.doWork();
        }
        System.out.println("开始装饰");
    }

    @Override
    public void doWork() {

        if(work != null){
            work.doWork();
        }
    }
}
