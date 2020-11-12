package chapter06;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "011225-1234567");
		//박자바는 매개변수 n을 통해서 전달되고
		//번호는 매개변수 s를 통해서 전달된다

		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);


		Korean k2 = new Korean("김자바", "930525-065421");
		//김자바는 매개변수 n을 통해서 전달되고
		//번호는 매개변수 s를 통해서 전달된다

		System.out.println("k2.name : "+ k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}

}
