package hashSet;

import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main3 {
	// ===============================
	// 문제 C: 배열에서 두 수의 곱이 최대인 값 찾기 (HashMap 활용)
	// ================================
	/*
	[설명]
	정수 배열 nums가 주어질 때, 같은 숫자는 한 번만 사용하여
	두 수의 곱이 최대가 되는 값을 반환하라.

	[입력 예시]
	[1,5,2,5] → 5*2=10
	[3,3,3] → 3*3=9

	[조건]
	- 배열 길이 ≥ 2
	- HashMap 활용 가능
	- 시간복잡도: O(n)

	[목표]
	- 최대값 2개 추적
	*/
	public int solution(int[] input) {
		
		Set<Integer> set = new HashSet<>();
		
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int n : input) {
			if(set.contains(n)) {continue;}
			set.add(n);

			if(n>firstMax) {
				secondMax = firstMax;
				firstMax = n;
			} else if (n > secondMax) {
				secondMax = n;
			}
			
		}
		
		if(set.size()==1) {
			secondMax = firstMax;
		}
		
		/* 정렬을 사용하면 시간 복잡도 n log n 
		 * 
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list,Collections.reverseOrder());
		if(list.size() == 1) {
			answer = list.get(0) * list.get(0); 
		}else {
			answer = list.get(0) * list.get(1);
		}
		 * */
				
		return firstMax * secondMax;
	}

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//String input = sc.nextLine();
		
		Main3 sol = new Main3();
		
		int[] array = {3,3,3};

		System.out.println(sol.solution(array));

		//sc.close();
	}
}
