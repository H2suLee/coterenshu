package renshu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
정수 배열 nums가 주어진다.
이 배열에서 **가장 많이 등장한 숫자(최빈값)**를 반환하라.

단, 최빈값이 여러 개면 가장 작은 값을 반환한다.

정렬로 빈도 계산 ❌

이중 반복문 ❌
 * */
public class Main3 {
    public int solution(int[] nums) {
    	Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        int maxCount = 0;
        int answer = Integer.MAX_VALUE;
    	
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                answer = num;
            } else if (count == maxCount) {
                answer = Math.min(answer, num);
            }
        }
    	
        return answer;
    }
    
}
