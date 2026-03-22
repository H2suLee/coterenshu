package hashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Main2 {

	// ================================
	// 문제 B: 배열 내 중복 제거 후 정렬 (HashSet)
	// ================================
	/*
	[설명]
	정수 배열 nums가 주어질 때, 중복을 제거하고 오름차순으로 정렬한 배열을 반환하라.

	[입력 예시]
	[3,1,2,3,2] → [1,2,3]
	[5,5,5] → [5]

	[조건]
	- 배열 길이 ≥ 1
	- HashSet 사용
	- 추가 배열 가능
	- 시간복잡도: O(n log n)

	[목표]
	- 중복 제거: HashSet
	- 정렬: Collections.sort() 또는 Stream
	*/
	
	public int[] solution(int[] nums) {
		
		Set<Integer> set = new HashSet<>();
		
		// Set에 담아서 중복을 제
		for(int n : nums) {
			set.add(n);
		}
		
		// Set을 Collections 를 통해 정렬
		List<Integer> list = new ArrayList<>(set); 
		Collections.sort(list);
		
		
		// 반환을 위해 배열에 담
		nums = new int[list.size()];
		for(int i = 0 ; i < list.size(); i++) {
			nums[i] = list.get(i);
		}
		return nums;
	}

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//String input = sc.nextLine();
		
		Main2 sol = new Main2();
		
		int[] array = {1,2,3};
		
		System.out.println(sol.solution(array));

		//sc.close();
	}
}
