package twosum;

import java.util.HashSet;
import java.util.Set;

public class Main2 {

	/*
	문제 3 (Two Sum / HashMap or Set)

	[설명]
	정수 배열 nums와 정수 target이 주어진다.

	배열에서 서로 다른 두 수를 선택해서
	그 합이 target이 되면 true를 반환하라.

	없으면 false를 반환하라.


	[예시]
	입력: nums = [2,7,11,15], target = 9
	출력: true   // (2 + 7)

	입력: nums = [3,2,4], target = 6
	출력: true   // (2 + 4)

	입력: nums = [1,2,3], target = 7
	출력: false


	[조건]
	- 배열 길이: 2 이상
	- 시간복잡도: O(n) 권장
	- 이중 반복문 금지


	[목표]
	- 한 번 순회로 해결


	[힌트]
	- 현재 값 n이 있을 때
	- target - n 이 이미 등장했는지 확인
	*/
	public boolean solution(int[] input, int target) {
		
		
		Set<Integer> set = new HashSet<>();
		for(int n : input) {
						
			if(set.contains(target-n)) {
				return true;
			}
			set.add(n);
		}
		
		return false;
	}

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//String input = sc.nextLine();
		
		Main2 sol = new Main2();
		
		int[] array = {1,2,3};
		int target = 7;

		System.out.println(sol.solution(array, target));

		//sc.close();
	}
}
