package chapter06;

public class Car3 {

	String company = "현대자동차";
	String model;;
	String color;
	int maxSpeed;
	int speed;


	Car3(){

	}

	Car3(String model){
		this(model, "은색", 250);
		//this()는 자신의 다른 생성자를 호출하는 코드, 생성자의 첫 줄에서만 사용 가능
		//model 매개변수를 찾기 위해 다른 Car 생성자 찾아서 실행
	}

	Car3(String model, String color){
		//model과 color 매개변수를 찾기 위해 다른 Car 생성자 찾아서 실행
		this(model, color, 250);
	}

	Car3(String model, String color, int maxSpeed){
		//즉, 모든 생성자들의 공통 실행 코드
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}

}
