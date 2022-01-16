package programmers;

import java.util.*;

class FindNum {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] numCheck = new boolean[10];
        
        for(int number : numbers) {
        	numCheck[number] = true;
        }
        
        for(int i = 0; i<numCheck.length; i++) {
        	if(!numCheck[i])
        		answer += i;
        }
        return answer;
    }
}