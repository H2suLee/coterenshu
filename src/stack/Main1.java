package stack;

import java.util.Scanner;
import java.util.Stack;

public class Main1 {

	/*
	
	[설명]
	문자열 s가 주어진다.

	같은 문자가 연속으로 2개 나오면 제거한다.
	이 과정을 더 이상 제거할 수 없을 때까지 반복한다.

	최종 문자열을 반환하라.


	[예시]
	입력: "baabaa"
	출력: ""

	입력: "cdcd"
	출력: "cdcd"


	[조건]
	- 문자열 길이: 1 이상
	- 시간복잡도: O(n) 권장

	[목표]
	- Stack(LIFO) 사용


	[힌트]
	- 최근 문자와 비교
	- 제거 후 다시 붙은 문자도 검사
	*/
	public String solution(String input) {
		
		StringBuilder sb = new StringBuilder();
		
		// 스택과 반복문을 사용
		Stack<Character> stack = new Stack<>();
		
		for(char c : input.toCharArray()) {
			if(!stack.isEmpty() && stack.peek() == c) {
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
		
		Main1 sol = new Main1();

		System.out.println(sol.solution(input));

		sc.close();
	}
}
