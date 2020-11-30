package chapter06;

public class ShopService {
    private static ShopService singletone = new ShopService();

    private ShopService(){

    }

    static ShopService getInstance(){
        return singletone;
    }
}
