package org.esurovskiy;

public class XContainer {
    private final Object object = new Object();
    private volatile int x = 0;

    void increment() {
        synchronized (object) {
            x++;
        }
    }

    public int getX() {
        return x;
    }
}
