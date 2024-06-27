package org.example.singleton;

import java.util.concurrent.*;

/**
 * @Author pw7563
 * @Date 2023/11/14 11:18
 * usage
 */
public class SingleDemo {

    private String name;
    private String description;
    ;

    private static SingleDemo singleDemo;

    private static final Object lock = new Object();

    public SingleDemo() {
    }

    public static SingleDemo getSingleDemo() {
        if (singleDemo == null) {
            synchronized (lock) {
                if (singleDemo == null) {
                    singleDemo = new SingleDemo();
                    return singleDemo;
                } else {
                    return singleDemo;
                }
            }
        }
        return singleDemo;
    }


    public static SingleDemo getSingleDemoThread() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock) {
                if (singleDemo == null) {
                    singleDemo = new SingleDemo();
                    return singleDemo;
                } else {
                    return singleDemo;
                }
            }

//        return singleDemo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

class Lock {

}

class GetSingleDemoTask implements Callable<SingleDemo> {

    @Override
    public SingleDemo call() throws Exception {
        return SingleDemo.getSingleDemo();
    }
}

class MainT1 {


    public static void main(String[] args) throws Exception {
//        SingleDemo singleDemo = new SingleDemo();
//        SingleDemo singleDemo1 =  singleDemo.getSingleDemo();
//        SingleDemo singleDemo2 =  singleDemo.getSingleDemo();
//        System.out.println(singleDemo1 + " " + singleDemo2);
//        System.out.println(singleDemo1 == singleDemo2);
//        System.out.println(singleDemo1.equals(singleDemo2));

        SingleDemo singleDemo = new SingleDemo();
        Executor executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executor.execute(() -> {
                SingleDemo singleDemoThread = SingleDemo.getSingleDemoThread();
                System.out.println(singleDemoThread);
            });
        }
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<SingleDemo> submit = executorService.submit(new GetSingleDemoTask());
        System.out.println("submi   " + submit);

        System.out.println();
        GetSingleDemoTask getSingleDemoTask = new GetSingleDemoTask();
        SingleDemo call = getSingleDemoTask.call();
        System.out.println("    123     " + call);
        System.out.println();


    }
}
