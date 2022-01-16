package programmers;

import java.util.*;

class CraneGame {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> moveStack = new Stack<>(); 

        for(int move : moves) {
        	for(int i = 0; i < board.length; i++) {
        		if(board[i][move-1] != 0){
                    if(!moveStack.empty() && moveStack.peek() == board[i][move-1]) {
        				moveStack.pop();
    					answer += 2;
        			}
        			else{
        				moveStack.push(board[i][move-1]);
        			}
        			board[i][move-1] = 0;
        			break;
                }
        	}
        }
        return answer;
    }
}