package org.esurovskiy;

public class ConcurrentExampleMain {
    private volatile static int x = 0;

    public static void main(String[] args) throws InterruptedException {
        for (int j = 0; j < 10; j++) {
            Thread thread = new Thread(() -> {
                System.out.println("Thread started");
                for (int i = 0; i < 1000000; i++) {
                    x++;
                }
            });
            thread.start();
        }
        System.out.println("Start sleep");
        Thread.sleep(100);
        System.out.println(x);
    }
}
