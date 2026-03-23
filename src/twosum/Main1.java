package twosum;

import java.util.Map;
import java.util.HashMap;

public class Main1 {

	/*
	정수 배열 nums와 정수 target이 주어진다.

	서로 다른 두 인덱스 i, j에 대해
	nums[i] + nums[j] == target을 만족하는
	두 인덱스를 배열로 반환하라.
	
	같은 원소를 두 번 사용할 수 없다.
	정답은 하나만 존재한다고 가정한다.
	*/
	public int[] solution(int[] nums, int target) {
		
		// target - num[i] 의 값이 Map 에 존재하는 지를 검사
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i<nums.length; i++) {
			
			
			if(map.containsKey(target - nums[i])) {
				
				return new int[] {i, map.get(target-nums[i])};
				
			}
			
			map.put(nums[i], i);
			
		}
		
		
		return new int[] {};
	}

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//String input = sc.nextLine();
		
		Main1 sol = new Main1();
		
		int[] nums = {3,2,4};
		int target = 6;

		System.out.println(sol.solution(nums, target));

		//sc.close();
	}
}
