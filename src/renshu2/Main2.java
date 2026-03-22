package renshu2;

import java.util.Scanner;
import java.util.Stack;
/*
 문자열 s가 주어진다.
이 문자열에서 같은 문자가 연속해서 두 번 이상 등장하면 제거한다.
제거 후 새로 인접해진 문자도 다시 검사한다.

최종적으로 모든 연속 중복이 제거된 문자열을 반환하라.


문자열 길이 ≥ 1
Stack 사용 가능 LIFO
시간복잡도 O(n) 권장
스택 순회는 순서대로, pop 일때는 역순 
 * */
public class Main2 {
    public String solution(String s) {
    	StringBuilder sb = new StringBuilder();
    	
    	// 스택
    	Stack<Character> stack = new Stack<>();
    	
    	// 반복문
    	for(char c : s.toCharArray()) {
    		
    		// 중복인 지 검사
    		if(!stack.isEmpty() && c == stack.peek()) {
    			stack.pop();
    		}else {
    			stack.push(c);	
    		}
    		
    		
    	}
    	
    	for(char c : stack) {
    		sb.append(c);
    	}
    	
        return sb.toString();
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		Main2 sol = new Main2();
		// 인자 값은 지원자가 적절하게 수정하여 제출
		System.out.println(sol.solution(input));

		sc.close();
	}
}
