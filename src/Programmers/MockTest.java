package Programmers;

import java.util.ArrayList; //ArrayList쓸 때 항상 import

class MockTest {

    ArrayList<Integer> answer1 = new ArrayList<>();

    public int max(int oc, int tc, int thc){ //맞춘 개수 최댓값 반환 함수

        int m = oc;
        if(m<=tc)
            m=tc;
        if(m<=thc)
            m=thc;

        return m; //최댓값 m 반환
    }

    public int[] solution(int[] answers) {

        //수포자들의 답 찍기 방식 배열에 만들기
        int one[] = {1,2,3,4,5};
        int two[] = {2,1,2,3,2,4,2,5};
        int three[] = {3,3,1,1,2,2,4,4,5,5};

        //수포차들의 맞춘 문제 갯수
        int oc = 0;
        int tc = 0;
        int thc = 0;

        for(int i=0; i<answers.length; i++){
            if(answers[i]==one[i%5])
                oc++;
            if(answers[i]==two[i%8])
                tc++;
            if(answers[i]==three[i%10])
                thc++;
        }

        int[] m = {oc, tc, thc}; //맞춘갯수 저장 배열

        int max = max(oc, tc, thc); //max함수로 m리턴

        for(int j=0; j<3; j++){
            if(m[j]==max)
                answer1.add(j+1); //ArrayList answer1에 저장
        }

        //List에서 Array로 바꾸기
        int answer[] = new int[answer1.size()]; //ArrayList배열명.size()
        int size= 0;


        // for문에서 : (콜론)의 의미는, answer1에서 객체를 꺼내서 temp에 하나씩 넣겠다는 것
        // b에 더이상 꺼낼 객체가 없을 때 까지
        for(int temp: answer1)
            answer[size++]=temp;

        return answer;
    }
}