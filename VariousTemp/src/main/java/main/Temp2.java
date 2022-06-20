package main;

public class Temp2 {

    public Temp2() {
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        threadSafeSingleton.zamaniYazdir();
    }

}
