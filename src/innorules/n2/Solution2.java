package innorules.n2;
import java.util.Scanner;

public class Solution2 {

    // 한글 2byte, 영문 1byte 기준 분리
    public void solution(String input, int splitByte) {
        StringBuilder sb = new StringBuilder();
      
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("바이트 수 입력: ");
        int byteSize = sc.nextInt();

        Solution2 sol = new Solution2();
        sol.solution("이노룰스Innorules", byteSize);

        sc.close();
    }
}
