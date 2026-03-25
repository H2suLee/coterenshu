package twopoiner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1 {

	/*
	정수 배열 nums가 주어진다.

	배열에서 서로 다른 세 수를 선택하여
	합이 0이 되는 모든 조합을 구하라.
	
	input nums = [-1,0,1,2,-1,-4]
	output [[-1,-1,2],[-1,0,1]]
	
	*/
	/*
	 * 
	   
	 * */
	
	public List<List<Integer>> solution(int[] nums) {
	    List<List<Integer>> result = new ArrayList<>();
	    
	    Arrays.sort(nums);

	    for(int i = 0; i < nums.length - 2; i++) {
	        
	        // 중복 제거
	        if(i > 0 && nums[i] == nums[i - 1]) continue;
	        
	        int left = i + 1;
	        int right = nums.length - 1;

	        while(left < right) {
	            int sum = nums[i] + nums[left] + nums[right];

	            if(sum == 0) {
	                result.add(Arrays.asList(nums[i], nums[left], nums[right]));

	                // 중복 제거
	                while(left < right && nums[left] == nums[left + 1]) left++;
	                while(left < right && nums[right] == nums[right - 1]) right--;

	                left++;
	                right--;

	            } else if(sum < 0) {
	                left++;
	            } else {
	                right--;
	            }
	        }
	    }

	    return result;
	}

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		//String input = sc.nextLine();
		
		Main1 sol = new Main1();

		int[] array = {-1,0,1,2,-1,-4};
		System.out.println(sol.solution(array));

		//sc.close();
	}
}
