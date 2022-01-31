package programmers;

import java.util.*;

class MockTest {
	public int[] solution(int[] answers) {
		int[][] people = {
				{1,2,3,4,5},
				{2,1,2,3,2,4,2,5},
				{3,3,1,1,2,2,4,4,5,5}
		};
        
        int[] cnt = new int[3];
      
        for(int i = 0; i < cnt.length; i++) {
        	for(int j = 0; j < answers.length; j++) {
        		if(people[i][j % people[i].length] == answers[j]) cnt[i]++;
        	}
        }
        
        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < cnt.length; i++) {
        	if(max == cnt[i]) list.add(i+1);
        }
        
        int[] answer = new int[list.size()];
        int n = 0;
        
        for(int num : list)
        	answer[n++] = num;
            
        return answer;
    }
	
	public static void main(String[] args) {
		HelloP1 p1 = new HelloP1();
		int[] n = {1,2,3,4,5};
		int[] res = p1.solution(n);
 		System.out.println(Arrays.toString(res));
	}
}
