package chapter06;

public class CalculatorExample {

    public static void main(String[] args) {
        Carculator myCalcu = new Carculator();

        double result1 = myCalcu.areaRectangle(10);
        double result2 = myCalcu.areaRectangle(10, 20);
        System.out.println(result1);
        System.out.println(result2);
    }
}