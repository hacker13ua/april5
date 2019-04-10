package org.esurovskiy;

public class ConcurrentExampleMain {
    public static void main(String[] args) throws InterruptedException {
        final XContainer xContainer = new XContainer();
        for (int j = 0; j < 10; j++) {
            Thread thread = new Thread(() -> {
                for (int i = 0; i < 1_000_000; i++) {
                    xContainer.increment();
                }
            });
            thread.start();
        }
        System.out.println("Start sleep");
        Thread.sleep(1000);
        System.out.println(xContainer.getX());
    }
}
