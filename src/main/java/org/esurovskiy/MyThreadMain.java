package org.esurovskiy;

public class MyThreadMain {
    public static void main(String[] args) {
        System.out.println("Start in thread "
                + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            final MyThread myThread = new MyThread();
            myThread.start();
        }
    }
}
