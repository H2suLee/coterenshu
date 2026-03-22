package heap;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Main2 {
	
	// ================================
	// 문제 D: 최대 힙 시뮬레이션 (Heap / PriorityQueue)
	// ================================
	/*
	[설명]
	정수 배열 nums가 주어질 때, 배열을 순회하며 최대 힙을 구성하고
	각 단계에서 힙의 루트 값을 출력하라.

	[입력 예시]
	[3,1,5,2] → [3,3,5,5]

	[조건]
	- 배열 길이 ≥ 1
	- PriorityQueue 사용
	- 시간복잡도: O(n log n)

	[목표]
	- 최대 힙 구현: PriorityQueue with Comparator.reverseOrder()
	- add 후 peek 출력
	*/
	
		public void solution(int[] input) {
			
			PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
			
			for(int n : input) {
				pq.add(n);
				System.out.println(pq.peek());
			}
		
	}

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//String input = sc.nextLine();
		
		Main2 sol = new Main2();
		
		int[] array = {3,1,5,2};
		
		sol.solution(array);

		//sc.close();
	}
}
