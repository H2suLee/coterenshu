package renshu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main1 {
/*
정수 배열 numbers가 주어진다.
이 배열에서 서로 다른 두 수를 더해서 만들 수 있는 모든 합을 구한 뒤,
중복을 제거하고 오름차순으로 정렬한 배열을 반환하라.

 “이중 반복문을 통해 모든 두 수의 합을 구하므로 O(n²)이고, 이후 Set을 리스트로 변환하여 정렬하는 과정이 O(m log m)입니다. m은 최대 n²이므로 전체 시간복잡도는 O(n² log n)입니다.”
 n2 = m 일때 O(n2) + O(m log m) = O(n2 log n)
 * 
 * */
	public int[] solution(int[] numbers) {
		
		Set<Integer> retSet = new HashSet<>();
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i+1; j < numbers.length; j++) {
				retSet.add(numbers[i]+numbers[j]);
			}
		}
		
		List<Integer> list = new ArrayList<>(retSet);
		Collections.sort(list);
		
		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//int money = sc.nextInt();

		Main1 sol = new Main1();

		int[] numbers = {2, 1, 3, 4, 1}; 

		// 인자 값은 지원자가 적절하게 수정하여 제출
		System.out.println(sol.solution(numbers));

		//sc.close();
	}
}
