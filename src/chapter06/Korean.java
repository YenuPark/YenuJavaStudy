package chapter06;

public class Korean {
	String nation = "대한민국";
	String name;
	String ssn;

	public Korean(String n, String s) {
		name = n;
		ssn = s;

		//만약
		//this.name = name;
		//this.ssn = ssn; 으로 한다면 오류가 발생한다
		//왜냐하면 동일한 이름의 매개변수가 사용 우선순위가 높기 때문이다
		//따라서 필드에 접근할 수가 없다.

	}

}
