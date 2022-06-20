package main;

import java.util.Date;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        System.out.println("Instance created!" + new Date());
    }

    //synchronized
    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            System.out.println("Instance will be create!" + new Date());
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    public void zamaniYazdir() {
        System.out.println(new Date());
    }

}