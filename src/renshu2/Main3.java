package renshu2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
정수 배열 nums가 주어진다.
이 배열에서 **가장 많이 등장한 숫자(최빈값)**를 반환하라.

단, 최빈값이 여러 개면 가장 작은 값을 반환한다.

정렬로 빈도 계산 ❌

이중 반복문 ❌
 * */
public class Main3 {
	public int solution(int[] nums) {

		// 해쉬맵
		Map<Integer, Integer> map = new HashMap<>();

		int value;
		int maxValue = 0;
		int answer = Integer.MAX_VALUE;
		
		for (int n : nums) {
			value = 1;
			if (map.containsKey(n)) {
				value = map.get(n) + 1;
			}
			map.put(n, value);
			
			if(value > maxValue) {
				maxValue = value;
				answer = n;
				
			}else if(value == maxValue) {
				answer = Math.min(n, answer);
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		Main3 sol = new Main3();
		int[] nums = { 3, 3, 3, 5, 5, 6, 7, 8, 8, 1, 1, 2, 2, 1, 2, 4, 2,3 };
		System.out.println(sol.solution(nums));
	}
}
