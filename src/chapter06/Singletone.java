package chapter06;

public class Singletone {

    private static Singletone singletone = new Singletone();

    private Singletone(){
    }

    static Singletone getInstance(){
        return singletone;
    }
}
