package innorules.n3;

import java.util.Scanner;

public class Solution {
	public String solution(int input) {
		int pencil = 500;
		int ballpen = 700;
		int sharp = 900;

		int p = 0;
		int b = 0;
		int s = 0;

		int maxpencil = input / pencil;
		int maxballpen = input / ballpen;
		int maxsharp = input / sharp;
		System.out.println(maxpencil + "/" + maxballpen + "/" + maxsharp);
		
		int total = 0; // 총합
		int bal = 0; // 잔돈
		int minBal = input; // 잔돈 최소값
		StringBuilder sb = new StringBuilder();
		
		for (int x = 0; x < maxpencil; x++) {
			for (int y = 0; y < maxballpen; y++) {
				for (int z = 0; z < maxsharp; z++) {
					total = (pencil * x) + (ballpen * y) + (sharp * z);
					if (total > input) {
						continue;
					}

					bal = input - total;

					if (minBal > bal) {

						p = x;
						b = y;
						s = z;
						minBal = bal;

						if (bal == 0) {
							break;
						}
						
					}
				}
			}
		}
		
		if (p > 0) {
			sb.append("연필 " + p + "개");
		}

		if (sb.length() > 0) {
			sb.append(", ");
		}
		if (b > 0) {
			sb.append("볼펜 " + b + "개");
		}
		if (sb.length() > 0) {
			sb.append(", ");
		}
		if (s > 0) {
			sb.append("샤프 " + s + "개");
		}
		
		System.out.println(sb.toString());
		
		return "잔돈: " + minBal;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		Solution sol = new Solution();

		// 인자 값은 지원자가 적절하게 수정하여 제출
		System.out.println(sol.solution(money));

		sc.close();
	}
}
