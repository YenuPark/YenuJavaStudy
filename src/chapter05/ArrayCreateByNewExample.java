package chapter05;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+ i +"] : "+ arr1[i]);
		}//int[] arr1 = new int[3]; 선언만 했기 때문에 int의 초기값인 0이 저장된다.
		
		
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		
		for(int i =0; i<3; i++) {
			System.out.println("arr1["+ i + "] : "+ arr1[i]);
		}
		
		double[] arr2 = new double[3];		
		for(int i =0; i<3; i++) {
			System.out.println("arr2["+ i + "] : "+ arr2[i]);
		}//double[] arr2 = new double[3]; 선언만 했기 때문에 double의 초기값인 0.0이 저장된다.
		
		arr2[0]=0.10;
		arr2[1]=0.20;
		arr2[2]=0.30;
		
		for(int i =0; i<3; i++) {
			System.out.println("arr2["+ i + "] : "+ arr2[i]);
		}
		
		
		String[] arr3 = new String[3];
		for(int i =0; i<3; i++) {
			System.out.println("arr3["+ i + "] : "+ arr3[i]);
		}//String[] arr3 = new String[3]; ���� �߱� ������ String�� �ʱⰪ�� null�� ����ȴ�.
		
		arr3[0]="1월";
		arr3[1]="2월";
		arr3[2]="3월";
		
		for(int i =0; i<3; i++) {
			System.out.println("arr3["+ i + "] : "+ arr3[i]);
		}

	}

}
