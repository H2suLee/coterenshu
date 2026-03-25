package sliding;

public class Main4 {

	/*
	정수 배열 height가 주어진다.
	
	각 인덱스는 높이를 의미하며,
	비가 온 뒤에 고일 수 있는 물의 총량을 구하라.
	
	입력 : height = [0,1,0,2,1,0,1,3,2,1,2,1]
	출력 : 6
	입력 : height = [4,2,0,3,2,5]
	출력 : 9
	입력 : height = [0,2,0]
	출력 : 0 
	
	조건 : 각 칸에 고일 수 있는 물의 양을 모두 더해야 함
          시간복잡도 O(N) 권장
	*/
	/*
	  
	 * */
	
	public int solution(int[] height) {
		int left = 0;
	    int right = height.length - 1;

	    int leftMax = 0;
	    int rightMax = 0;

	    int sum = 0;

	    while(left < right) {
	        if(height[left] < height[right]) {
	            if(height[left] >= leftMax) {
	                leftMax = height[left];
	            } else {
	                sum += leftMax - height[left];
	            }
	            left++;
	        } else {
	            if(height[right] >= rightMax) {
	                rightMax = height[right];
	            } else {
	                sum += rightMax - height[right];
	            }
	            right--;
	        }
	    }

	    return sum;
	}

	public static void main(String[] args) {
		Main4 sol = new Main4();
		int[] array = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(sol.solution(array));
	}
}
