package stack;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {

	/*
	문제 4 (괄호 유효성 검사 / Stack)

	[설명]
	문자열 s가 주어진다.

	문자열은 다음 문자들로만 이루어져 있다:
	'(', ')', '{', '}', '[', ']'

	괄호가 올바르게 짝지어져 있으면 true,
	아니면 false를 반환하라.


	[예시]
	입력: "()"
	출력: true

	입력: "()[]{}"
	출력: true

	입력: "(]"
	출력: false

	입력: "([)]"
	출력: false

	입력: "{[]}"
	출력: true


	[조건]
	- 문자열 길이: 1 이상
	- 시간복잡도: O(n)


	[목표]
	- Stack(LIFO) 사용


	[힌트]
	- 여는 괄호는 push
	- 닫는 괄호 나오면 짝 검사
	- 마지막에 스택이 비어 있어야 함
	*/
	
	public boolean solution(String input) {
		
		// 여는 괄호
		// 닫는 괄호
		Stack<Character> stack = new Stack<>();
		
		
		for(char c : input.toCharArray()) {
			
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
			}else {
				if(stack.isEmpty()) {
					return false;
				}
				
				if((c == ')' && stack.peek() == '(')|| (c == '}' && stack.peek() == '{') || (c == ']' && stack.peek() == '[')) {
					stack.pop();					
				}else {
					return false;
				}
			}
			
		}
		
		
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		Main2 sol = new Main2();

		System.out.println(sol.solution(input));

		sc.close();
	}
}
