package programmers;

import java.util.*;

class Keypad {
    public String solution(int[] numbers, String hand) {
        int[][] numberSet = { {3, 1}, {0, 0}, {0, 1}, {0, 2}, {1, 0}, {1, 1},
    	    		{1, 2}, {2, 0}, {2, 1}, {2, 2} };
    	
    	String answer = "";
        
        int[] stateLeft = {3, 0}; // 왼손 위치
        int[] stateRight = {3, 2}; // 오른손 위치
        
        for(int i = 0; i < numbers.length; i++) {
        	int n = numbers[i];
        	
        	if(n == 1 || n == 4 || n == 7) {
        		answer += "L";
        		stateLeft = numberSet[n]; // 왼손 위치 갱신
        	}
        	else if(n == 3 || n == 6 || n == 9) {
        		answer += "R";
        		stateRight = numberSet[n]; // 오른손 위치 갱신
        	}
        	else {
        		int xdisLeft = Math.abs(numberSet[n][0] - stateLeft[0]);
        		int ydisLeft = Math.abs(numberSet[n][1] - stateLeft[1]);
        		int resLeft = xdisLeft + ydisLeft;
        		
        		int xdisRight = Math.abs(numberSet[n][0] - stateRight[0]);
        		int ydisRight = Math.abs(numberSet[n][1] - stateRight[1]);
        		int resRight = xdisRight + ydisRight;
        		
        		
        		if(resLeft > resRight) {
        			answer += "R";
            		stateRight = numberSet[n];
        		}
        		else if(resLeft < resRight) {
        			answer += "L";
            		stateLeft = numberSet[n];
        		}
        		else {
        			if(hand.equals("left")) {
        				answer += "L";
                		stateLeft = numberSet[n];
        			}
        			else if(hand.equals("right")) {
        				answer += "R";
                		stateRight = numberSet[n];
        			}
        		}

        	}
        	
        }
        return answer;
    }
}