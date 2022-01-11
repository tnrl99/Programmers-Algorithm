package programmers;

import java.util.*;

class NumberCard {
    public int solution(String s) {
        int answer = 0;
        
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < 10; i++) {
        	s = s.replace(word[i], Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}
