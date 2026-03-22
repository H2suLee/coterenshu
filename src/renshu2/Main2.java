package renshu2;

import java.util.Stack;
/*
 문자열 s가 주어진다.
이 문자열에서 같은 문자가 연속해서 두 번 이상 등장하면 제거한다.
제거 후 새로 인접해진 문자도 다시 검사한다.

최종적으로 모든 연속 중복이 제거된 문자열을 반환하라.


문자열 길이 ≥ 1
Stack 사용 가능 LIFO
시간복잡도 O(n) 권장
 * */
public class Main2 {
    public String solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}
