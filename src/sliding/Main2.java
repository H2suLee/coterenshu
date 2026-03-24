package sliding;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {

	/*
	 * 문자열 s가 주어진다.
	 * 
	 * 중복된 문자가 없는 부분 문자열(substring) 중에서 가장 긴 길이를 반환하라.
	 * 
	 * input abcabcbb
	 * 
	 * output 3
	 * 
	 */
	/*
	 * 중복없는 구간의 최대 길이를 구하는 문제입니다. 슬라이딩 윈도우 기법을 활용하겠습니다.
	 * 시작인덱스를 left, 끝인덱스를 right이라는 변수를 두고, 주어진 문자열의 길이만큼 반복문을 돌겠습니다.
	 * right변수를 점점 증가하면서, Set 자료구조와 contains연산을 통해 구간에 중복이 없을때까지 left 변수를 활용하여 중복을 제거하겠습니다.
	 * 그리고 길이를 갱신해가면서 끝에는 가장긴 길이를 반환하도록 하겠습니다.
	 * 시간복잡도는 right 이동이 최대 n번, left 이동이 최대 n번으로 On 입니다.
	 * 공간복잡도는 set의 최대크기를 따라 n 입니다.
	 * */
	public int solution(String s) {

		Set<Character> set = new HashSet<>();

		int left = 0;
		int max = 0;
		

		for (int right = 0; right < s.length(); right++) {

			char c = s.charAt(right);

			// 여기서 중복 처리
			while(set.contains(c)) {
				set.remove(s.charAt(left));
				left++;
			}
			
			set.add(c);

			// 길이 갱신 (max 값과 (끝인덱스 - 시작인덱스+1) 비교) 
			max = Math.max(max, right-left+1);

		}

		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		Main2 sol = new Main2();

		System.out.println(sol.solution(input));

		sc.close();
	}
}
