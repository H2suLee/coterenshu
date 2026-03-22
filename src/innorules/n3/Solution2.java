package innorules.n3;

import java.util.Scanner;

public class Solution2 {
	public String solution(int input) {
		
		// 품목당 금액 할당
		int pencil = 500;
		int pen = 700;
		int sharp = 900;
		
		int sum = 0;        // 구매금액
		int bal = 0;    // 잔돈
		int minBal = input; // 최소 잔돈
		
		// 최소 잔돈에 따른 품목별 개수
		int minPencil = 0;
		int minPen = 0;
		int minSharp = 0;
		
		
		// 루프길이를 정의
		// 5000원이 들어오면, 연필을 최대한 10개 살수 있고, 볼펜을 7개, 샤프를 5개 살수 있음.
		
		// 반복문 돌면서 모두 검색
		// 품목값 <> 입력값 비교
		for(int i = 0; i< input / pencil; i++ ) {
			for(int j = 0; j< input / pen; j++ ) {
				for(int k = 0; k< input / sharp; k++ ) {
					
					// 구매금액
					sum = (pencil * i) + (pen * j) + (sharp * k);
					
					// 구매금액합계가 입력값 초과이면 roop를 떠나기
					if(sum > input) {
						continue;
					}

					// 잔돈 = 낸돈 - 구매금액 
					bal = input - sum;
					
					
					// 최소 잔돈
					if(minBal > bal) {
						minBal = bal;
						minPencil = i;
						minPen = j;
						minSharp = k;
						if(bal == 0) {
							break;
						}
					}
					
				}
				
			}
			
			
		}
		
		String retStr = "연필 " + minPencil + "개, 볼펜 " + minPen + "개, 샤프" + minSharp + "개/잔돈 : " + minBal; 
		return retStr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		Solution2 sol = new Solution2();

		// 인자 값은 지원자가 적절하게 수정하여 제출
		System.out.println(sol.solution(money));

		sc.close();
	}
}
