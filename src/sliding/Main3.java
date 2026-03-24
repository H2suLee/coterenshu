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
	  
	 * */
	
	public int solution(int[] array) {
		
		int max = Integer.MIN_VALUE;
		int nubi = 0;
		int left = array.length;
		
		int width = 0;
		int height = 0;
		int wh = 0;
		for(int right = 0; right < array.length; right++) {
			
			while() {
				left--;
			}
			// 높이 
			height = Math.min(array[right], array[left]);
			
			// 너비 
			width = right-left+1;
			
			// 넓이
			wh = height * width;
		
		}
		
		return 0;
	}

	public static void main(String[] args) {
		Main3 sol = new Main3();
		int[] array = {2,3,1,2,4,3};
		System.out.println(sol.solution(array));
	}
}
