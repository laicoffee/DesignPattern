import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author pw7563
 * @Date 2023/12/19 13:47
 * usage
 */
public class ThreadLocalDemo {
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };


    public class AAThreadLocal extends InheritableThreadLocal{

    }

    public static void main(String[] args) {
//        Thread thread = new Thread(()->{
//            int value = 1;
//            System.out.println("this is a therad");
//        });

        int[] a = {1,2,3};
        for(int i:a){
            System.out.println(i);
            break;
        }



        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                threadLocal.set(threadLocal.get() + 1);
                System.out.println("Thread 1 - Value: " + threadLocal.get());
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 10; i < 50; i++) {
                threadLocal.set(threadLocal.get() + 1);
                System.out.println("Thread 2 - Value: " + threadLocal.get());
            }
        });

        thread1.start();
        thread2.start();
    }
}

