package org.esurovskiy;

public class RunnableMain {
    public static void main(String[] args) {
        RunnableExample runnableExample = new RunnableExample();
        Thread thread = new Thread(
                () -> System.out.println("runnable "
                        + Thread.currentThread().getName()));
        thread.start();
    }
}
