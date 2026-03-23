package stack;

import java.util.Scanner;
import java.util.Stack;

public class Main4 {
	/*
정수 배열이 아니라, 문자열 s가 주어짐.

문자열 s는 '(', ')', '{', '}', '[', ']'로만 이루어져 있다.

조건:

여는 괄호는 반드시 같은 종류의 닫는 괄호로 닫혀야 한다.
올바른 괄호 순서여야 한다.

문제:

s가 올바른 괄호 문자열이면 true
아니면 false 반환
	*/

	public boolean solution(String input) {
		
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
		
		Main4 sol = new Main4();

		System.out.println(sol.solution(input));

		sc.close();
	}
}
