package chapter05;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};

		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}

		System.out.println("총합 : "+ sum1);

		int sum2 = add(new int[] {83, 90, 87});
		//만약 add(new int[] {83, 90, 87}); 대신에 add(scores)를 대입하면 오류가 발생한다
		//그 이유는 메소드의 매개값이 변수일 경우에는 반드시 new연산자를 사용해야한다.
		System.out.println("총합 : " + sum2);
		System.out.println();

	}

	public static int add(int[] scores) {

		int sum=0;
		for(int i=0; i<3; i++) {
			sum+= scores[i];
		}

		return sum;
	}

}
