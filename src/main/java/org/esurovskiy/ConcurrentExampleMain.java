package org.esurovskiy;

public class ConcurrentExampleMain {
    private static int x = 0;

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                x++;
            }
        });
        thread.start();
        System.out.println(x);
    }
}
