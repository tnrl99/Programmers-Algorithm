package programmers;

import java.util.*;

class Solution {
	public String solution(String new_id) {
        String answer = "";
        
        // 1단계 : new_id의 모든 대문자를 대응되는 소문자로 치환
        answer = new_id.toLowerCase();
        // 2단계 : new_id에서 알파벳 소문자, 숫자, 뺄셈(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
        answer = answer.replaceAll("[^a-z0-9_.-]", "");
        // 3단계 : new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        answer = answer.replaceAll("[.]{2,}", ".");
        // 4단계 : new_id에서 마침표(.)가 처음에 위치하면 제거
        answer = answer.replaceAll("^[.]|[.]$", "");
        // 5단계 : new_id가 빈문자열이라면, new_id에 "a"를 대입
        if(answer.equals("")) {
        	answer += "a";
        }
        /* 6단계 : new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 
        모두 제거 후, 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.)문자 제거 */
        if(answer.length() >= 16) {
        	answer = answer.substring(0, 15);
        	answer = answer.replaceAll("[.]$", "");
        }
        // 7단계 : new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복
        while(answer.length() < 3) {
        	answer += answer.charAt(answer.length()-1);
        }
        return answer;
    }
}
