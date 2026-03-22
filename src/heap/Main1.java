package heap;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Main1 {

	/*
	문제 6 (Heap / K번째 수)

	[설명]
	정수 배열 nums와 정수 k가 주어진다.

	배열에서 **k번째로 큰 수**를 반환하라.
	(1번째는 가장 큰 수)

	단, 정렬로 전체 정렬하지 말고
	시간복잡도 O(n log k) 정도가 되도록 Heap을 활용


	[예시]
	입력: nums = [3,2,1,5,6,4], k = 2
	출력: 5

	입력: nums = [3,2,3,1,2,4,5,5,6], k = 4
	출력: 4


	[조건]
	- 배열 길이: 1 이상
	- k ≤ 배열 길이
	- 시간복잡도: O(n log k) 권장


	[목표]
	- 최소힙(Min-Heap) 사용
	- k개까지만 관리해서 최적화
	*/
	public int solution(int[] input, int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int n : input) {
			pq.add(n); 
			
			// pq.size() 와 k를 비교해서 사이즈를 넘으면 가장 작은 값 제거
			if(pq.size() > k) {
				pq.poll();
			}
		}
		
		return pq.peek();
	}

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//String input = sc.nextLine();
		
		Main1 sol = new Main1();
		
		int[] array = {3,2,1,5,6,4};
		int target = 2;

		System.out.println(sol.solution(array, target));

		//sc.close();
	}
}
