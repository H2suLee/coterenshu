package stack;

import java.util.Scanner;
import java.util.Stack;

public class Main3 {
	// ================================
	// 문제 A: 가장 긴 팰린드롬 접두사 (Stack / 문자열)
	// ================================
	/*
	[설명]
	문자열 s가 주어질 때, 접두사 중에서 가장 긴 팰린드롬을 반환하라.

	[입력 예시]
	"levelup" → "level"
	"abc" → "a"

	[조건]
	- 문자열 길이 ≥ 1
	- Stack 사용 가능
	- 시간복잡도: O(n)
	- 대소문자 구분

	[목표]
	- Stack을 이용해 문자열 순회
	- 접두사 팰린드롬 확인
	*/

	public String solution(String input) {
		
		// 접두사를 담을셋
		//Set<String> set = new HashSet<>();
		
		// 팰린드롬을 확인할 스택
		Stack<Character> stack = new Stack<>();
		
		for(char c : input.toCharArray()) {
			stack.push(c);
		}
		
		
		
		return "";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		Main3 sol = new Main3();

		System.out.println(sol.solution(input));

		sc.close();
	}
}
