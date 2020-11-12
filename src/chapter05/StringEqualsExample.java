package chapter05;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";

		if(strVar1==strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}

		else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}

		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");


		if(strVar3==strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}

		else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		//위의 strVa11과 strVar2처럼 동일한 문자열 리터럴로 String객체를 생성했을 경우에는 문자열 자체를 비교하므로 연산의 결과가 true로 반환된다.
		//여기서 else로 출력되는 이유는, 객체를 생성하면 객체는 해당 주소를 비교하기 때문에 strVar3와 strVar4의 주소를 판별하므로 참조가 다르게 나온다. 따라서 false반환

		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}

	}

}
