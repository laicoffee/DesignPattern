package 异步任务;

/**
 * @Author pw7563
 * @Date 2023/11/10 15:54
 * usage
 */
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsyncExample {

    public static void main(String[] args) {
        // 启动异步任务
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            // 模拟一个耗时操作
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello, ";
        });

        // 注册回调函数，当异步任务完成时执行
        future.thenAccept(result -> System.out.println(result + "World!"));

        // 主线程不被阻塞
        System.out.println("Main thread is not blocked.");

        // 阻塞等待异步任务完成
        try {
            future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
