package innorules.n2;
import java.util.Scanner;

public class Solution {

    // 한글 2byte, 영문 1byte 기준 분리
    public void solution(String input, int splitByte) {
        StringBuilder sb = new StringBuilder();
        
        // input 스트링을 반복문을 돌면서 char 를 추출하고
        // byte 계산을 통해서 결과를 출력
        
        int currentByte = 0;
        int charByte = 0;
        char currentChar = 0;
        
        for(int i = 0; i < input.length(); i++) {
        	currentChar = input.charAt(i);
        	
        	// currentChar 가 몇 바이트인지 계산해서 charByte에 할당
        	if('가'<=currentChar && '힣'>=currentChar) {
        		charByte = 2;
        	}else {
        		charByte = 1;        		
        	}
        	
        	sb.append(currentChar);
        	// currentByte, splitByte, charByte 계산
        	if(currentByte + charByte >= splitByte) {
        		System.out.println(sb.toString());
        		currentByte = 0;
        		sb.setLength(0);
        	}
        	
        	
        	currentByte += charByte;
        	
        }
        
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("바이트 수 입력: ");
        int byteSize = sc.nextInt();

        Solution sol = new Solution();
        sol.solution("이노룰스Innorules", byteSize);

        sc.close();
    }
}
