package chapter06;

public class SingletoneExample {
    public static void main(String[] args) {

        /*
         * Singleton obj1 = new Singletone();
         * Singleton obj2 = new Singletone();
         * 이렇게 객체를 생성하면 컴파일 에러난다
         * 싱글톤은 하나의 객체만 생성가능함
         * */

        Singletone obj1 = Singletone.getInstance();
        Singletone obj2 = Singletone.getInstance();

        if (obj1 == obj2) {
            System.out.println("같은 Singleton 객체입니다.");
        } else {
            System.out.println("다른 Singleton 객체입니다.");
        }
    }
}
