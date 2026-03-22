package sliding;

import java.util.Scanner;
import java.util.Stack;

public class Main1 {

	/*
	문제 5 (투포인터 / 부분합)

	[설명]
	정수 배열 nums와 정수 target이 주어진다.

	배열에서 연속된 부분 배열(subarray)의 합이
	target 이상이 되는 **가장 짧은 길이**를 반환하라.

	없으면 0을 반환한다.


	[예시]
	입력: nums = [2,3,1,2,4,3], target = 7
	출력: 2   // [4,3]

	입력: nums = [1,4,4], target = 4
	출력: 1   // [4]

	입력: nums = [1,1,1,1,1,1,1,1], target = 11
	출력: 0


	[조건]
	- 배열 길이: 1 이상
	- 시간복잡도: O(n) 권장
	- 이중 반복문 금지


	[목표]
	- 투포인터 / 슬라이딩 윈도우 사용
	*/
	
	public int solution(int[] array, int target) {
		
		for(int n : array) {
			
		}
		
		return 0;
	}

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		//String input = sc.nextLine();
		
		Main1 sol = new Main1();

		int[] array = {4,3};
		int target = 7;
		System.out.println(sol.solution(array, target));

		//sc.close();
	}
}
