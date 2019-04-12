package org.esurovskiy;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class XContainer {
    private final AtomicBoolean atomicBoolean = new AtomicBoolean();
//    private volatile int x = 0;

    AtomicInteger integer = new AtomicInteger();

    boolean b = false;
    synchronized void increment() {
//        x++;
        atomicBoolean.compareAndSet(false, true);
        integer.addAndGet(1);
    }

    public int getX() {
        return integer.get();
    }
}
