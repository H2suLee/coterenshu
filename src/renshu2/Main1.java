package renshu2;

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

이중반복문
중복을 없애기 위해 set
리스트로 정렬
출력 배열 
 * */
	public int[] solution(int[] numbers) {
		
	    Set<Integer> intSet = new HashSet<>();
	    int sum = 0;
	    
	    // 반복문에서 합을 구하고 에
	    for(int i = 0; i < numbers.length; i++) {
	    	for(int j = i; j < numbers.length; j++) {
	    		sum = numbers[i] + numbers[j];
	    		intSet.add(sum);
	    	}
	    }
	    
	    // 리스트를 오름차순으로 정렬하고
	    List<Integer> intList = new ArrayList<>(intSet);
	    Collections.sort(intList);
	    
	    
	    // 배열에 담아서 반
		int[] answer = new int[intList.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = intList.get(i);
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
