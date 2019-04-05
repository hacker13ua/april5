package org.esurovskiy;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class OverloadEx {
    static volatile long x = 0;

    public static void main(String[] args) {
        Integer integer = new Integer(1);
        Integer integer2 = new Integer(2);
        integer *= 2;
        integer2 *= 2;
        System.out.println(integer);
        System.out.println(integer2);
        x += 2;
    }

    public static void doJob(Object o) {
        System.out.println("doJob " + o);
    }

    public static void doJob(String o) {
        System.out.println("do String Job " + o);
    }
}
