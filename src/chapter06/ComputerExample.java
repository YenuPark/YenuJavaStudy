package chapter06;

public class ComputerExample {

	public static void main(String[] args) {
		Computer myCom = new Computer();

		int[] values1 = {1,2,3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1 : " + result1);


		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		//new 생성자로 새로운 배열을 생성하여 sum1 메소드의 매개변수로 전달한다.
		System.out.println("result2 : " + result2);


		int result3 = myCom.sum2(1,2,3);
		System.out.println("result3 : " + result3);


		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4 : " + result4);

	}

}
