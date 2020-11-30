package chapter06;

public class Singletone {

    private static Singletone singletone = new Singletone();

    private Singletone(){
    }

    //getInstance()는 외부에서 호출할 수 있는 정적 메소드
    static Singletone getInstance(){
        return singletone;
    }
}
