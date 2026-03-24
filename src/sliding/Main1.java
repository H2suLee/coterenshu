package sliding;

public class Main1 {

	/*
	문제 5 (투포인터 / 부분합)

	[설명]
	정수 배열 nums와 정수 target이 주어진다.

	배열에서 연속된 부분 배열(subarray)의 합이
	target 이상이 되는 **가장 짧은 길이**를 반환하라.

	없으면 0을 반환한다.


	[예시]
	입력: nums = [2,3,1,2,4,3], target = 7
	출력: 2   // [4,3]

	입력: nums = [1,4,4], target = 4
	출력: 1   // [4]

	입력: nums = [1,1,1,1,1,1,1,1], target = 11
	출력: 0


	[조건]
	- 배열 길이: 1 이상
	- 시간복잡도: O(n) 권장
	- 이중 반복문 금지


	[목표]
	- 투포인터 / 슬라이딩 윈도우 사용
	*/
	/*
	 * 
	    이 문제는 배열에서 연속된 부분 배열의 합이 target 이상이 되는 가장 짧은 길이를 구하는 문제로, 슬라이딩 윈도우(투포인터)를 사용해 O(N)에 해결합니다.

		right 포인터를 이동시키며 합(sum)을 늘리고, sum >= target이 되는 순간 해당 구간은 유효하므로 길이를 갱신합니다. 이후 left를 이동시키며 합을 줄이면서 더 짧은 구간이 가능한지 확인합니다. 이 과정을 반복하며 최소 길이를 찾습니다.
		
		시간복잡도는 left, right가 각각 최대 N번 이동하므로 O(N), 입출력 외 추가적인 메모리를 안쓰기 때문에 공간복잡도는 O(1)입니다.
		조건을 만족하는 구간이 없으면 0을 반환합니다.
		
	 * */
	
	public int solution(int[] array, int target) {
		
		int left = 0;
		int min  = Integer.MAX_VALUE;
		int sum = 0;
		for(int right=0; right < array.length; right++) {
			
			sum += array[right];
			
			while(sum>=target) {
				min = Math.min(min, right - left + 1); // 줄이기 전에 갱
				sum -= array[left];
				left++;
				
			}
			
		}
			
		
		return min==Integer.MAX_VALUE?0:min;
	}

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		//String input = sc.nextLine();
		
		Main1 sol = new Main1();

		int[] array = {2,3,1,2,4,3};
		int target = 7;
		System.out.println(sol.solution(array, target));

		//sc.close();
	}
}
