package chapter05;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0]="Java";
		strArray[1]="Java";
		strArray[2] = new String("Java");

		System.out.println(strArray[0] == strArray[1]);
		//동일한 객체를 참조하기 때문에 true

		System.out.println(strArray[0] == strArray[2]);
		//String 객체를 new 연산자로 생성하면 무조건 새로운 String 객체가 새로 생성되기 때문에
		//strArray[0] == strArray[2]는 서로 다른 객체를 가르키므로
		//서로 다른 객체를 참조하여 false가 반환된다
		//책 194쪽 참고

		System.out.println(strArray[0].equals(strArray[2]));
		//문자열을 비교하는 equals()함수를 사용하면 문자열만 비교한다.
	}

}
