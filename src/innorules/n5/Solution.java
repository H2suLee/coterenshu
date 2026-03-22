package innorules.n5;

import java.util.Scanner;
// 문자열 반환
public class Solution {
	public String solution(String input) {
		return new StringBuilder(input).reverse().toString();
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		// 인자 값은 지원자가 적절하게 수정하여 제출
		System.out.println(sol.solution(input));

		sc.close();
	}
}