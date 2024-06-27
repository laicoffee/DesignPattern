package org.example.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author pw7563
 * @Date 2023/11/14 15:25
 * usage
 */
public class SingleTon {
    private String name;
    private String attribute;

    private static SingleTon singleTon;


    public SingleTon getSingleTon() {
        if(singleTon == null){
            singleTon = new SingleTon();
        }
        return singleTon;
    }

    /**
     * 实现线程安全
     * @return
     */
    public SingleTon getSingleTonConcurrent()   {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(singleTon == null){
            synchronized (SingleTon.class){
                if(singleTon == null){
                    singleTon = new SingleTon();
                }
                return singleTon;
            }
        }
        return singleTon;
    }



}

class MainT3{
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        SingleTon singleTon = null;
        for(int i = 0; i<100;i++){
            executorService.submit(()->{
                SingleTon singleTonConcurrent = new SingleTon().getSingleTonConcurrent();
                System.out.println(singleTonConcurrent);
            });
        }




//        SingleTon singleTon1 = new SingleTon();
//        SingleTon singleTon1_1 = singleTon1.getSingleTon();
//
//        SingleTon singleTon2 = new SingleTon();
//        SingleTon singleTon2_1 = singleTon2.getSingleTon();
//        System.out.println(singleTon1_1 == singleTon2_1);
    }
}
