package main;

public class Temp {

    public Temp() {
        //new ThreadSafeSingleton();
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        threadSafeSingleton.zamaniYazdir();
    }

}
