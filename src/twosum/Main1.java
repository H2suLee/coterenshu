package twosum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		int[] answer = new int[2];
		
		// target - num[i] 의 값이 map 에 존재하는 지를 검사
		Set<Integer> set = new HashSet<Integer>();
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i<nums.length; i++) {
			
			
			if(list.contains(target - nums[i])) {
				list.
			}
			
			list.add(nums[i]);
			
			
		}
		

		return answer;
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
