package sliding;

public class Main3 {

	/*
	정수 배열 height가 주어진다.
	각 인덱스는 세로선의 높이를 의미한다.
	두 개의 선을 선택하여 물을 담을 때,
	담을 수 있는 최대 물의 양(넓이)을 구하라.
	
	입력 : height = [1,8,6,2,5,4,8,3,7]
	출력 : 49
	
	조건 : 두 선 사이의 거리 = 인덱스 차이
          물의 높이 = 두 선 중 더 낮은 높이
	*/
	/*
	 * 
	 * 투포인터와 슬라이딩 기법을 활용하여 풀겠습니다. 양 끝을 left, right로 잡고, 둘 중 원소값이 작은 값이 어떤 것인지 검사하여 작은 값을 움직이겠습니다. left<right 조건을 충족하는 만큼 순회하여, 최대N만큼만 움직이도록 하겠습니다.
	 * 그래서 두 포인터는 최대 n번씩 이동하므로 시간복잡도는 O(n), 추가적인 자료구조는 사용하지 않았기 때문에 공간복잡도는 O(1)입니다.
	  
	 * */
	
	public int solution(int[] array) {

		int left = 0; 
		int right = array.length-1;
		
		int maxWh = 0;
		
		int h;
		int w;
		int wh;
		
		while(left<right) {
			
			// 높이
			h = Math.min(array[left], array[right]);
			
			// 너비
			w = right - left;
			
			// 넓이
			wh = w*h;
			
			if(maxWh < wh) {
				maxWh = wh;
			}
			
			// array[left], array[right] 중 원소값이 작은 것을 움직이기
			if(array[left] < array[right]) {
				left++;
			}else{
				right--;
			}
			
			
			
			
		}
		
		return maxWh;
	}

	public static void main(String[] args) {
		Main3 sol = new Main3();
		int[] array = {1,8,6,2,5,4,8,3,7};
		System.out.println(sol.solution(array));
	}
}
