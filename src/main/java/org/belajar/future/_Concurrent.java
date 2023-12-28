package org.belajar.future;

import java.util.concurrent.*;

public class _Concurrent {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<String> future = executor.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                return "Hello World!";
            }


        });
        System.out.println("Waiting for the result...");
        String result = future.get();
        System.out.println(result);
        executor.shutdown();
    }
}
