package innorules.n4;

import java.util.Scanner;
// 홀수 합 알고리즘 세가지
public class Solution {
	public int solution1(int input) {
		int answer = 0;
		for (int i = 1; i <= input; i++) {
			if (i % 2 == 1) {
				answer += i;
			}
		}
		return answer;
	}

	public int solution2(int input) {

		return sumOdd(input);
	}
	
    private int sumOdd(int input) {
        if (input <= 0) {
            return 0;
        }
        if (input % 2 == 1) {
            return input + sumOdd(input - 2);
        } else {
            return sumOdd(input - 1);
        }
    }

	public int solution3(int input) {
		 int count = (input + 1) / 2; 
	        return count * count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Solution sol = new Solution();

		// 인자 값은 지원자가 적절하게 수정하여 제출
		System.out.println(sol.solution1(n));
		System.out.println(sol.solution2(n));
		System.out.println(sol.solution3(n));

		sc.close();
	}
}
