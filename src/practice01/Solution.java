package practice01;

import java.util.*;

public class Solution {
	public String solution(String[] participants, String[] completion) {

		String answer = "";
		Arrays.sort(participants); //오름차순 정리
		Arrays.sort(completion); //오름차순 정리

		int i=0;

		for(i =0; i<completion.length;i++){

			if(!participants[i].equals(completion[i])){
				return participants[i];
			}
		}

		return participants[i];
	}
}
