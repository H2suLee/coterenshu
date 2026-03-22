package hashMap;

import java.util.Map;
import java.util.HashMap;

public class Main1 {

/*
문제 2 (HashMap / 카운팅)

[설명]
정수 배열 nums가 주어진다.

각 숫자의 등장 횟수를 계산해서
가장 많이 등장한 숫자(최빈값)를 반환하라.

단, 최빈값이 여러 개면
가장 작은 값을 반환하라.


[예시]
입력: [1,1,2,2,3]
출력: 1

입력: [4,4,4,2,2,2,1]
출력: 2


[조건]
- 배열 길이: 1 이상
- 값 범위: 제한 없음
- 시간복잡도: O(n) 권장
- 정렬 사용 금지
- 이중 반복문 금지


[목표]
- HashMap으로 카운팅
- 한 번의 순회로 해결


[힌트]
- Map.getOrDefault 활용
- max 값과 answer를 같이 관리
*/
	public int solution(int[] input) {
		
		int answer = 0;
		Map<Integer, Integer> map = new HashMap<>();
		
		int value =  Integer.MIN_VALUE;
		int maxValue = 0;
				
		for(int n : input) {
			value = map.getOrDefault(n, 0) + 1;
			map.put(n, value);
			
			if(value > maxValue) {
				maxValue = value;
				answer = n;
			}else if(value == maxValue) {
				answer = Math.min(answer, n);
			}
			
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//String input = sc.nextLine();
		
		Main1 sol = new Main1();
		
		int[] array = {4,4,4,2,2,2,1};

		System.out.println(sol.solution(array));

		//sc.close();
	}
}
