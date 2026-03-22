package innorules.n6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// 트리 구조 비교
public class Solution {
	public String solution() {
        Map<Integer, Integer> original = new HashMap<>();
        original.put(2, 1);
        original.put(3, 1);
        original.put(4, 3);
        original.put(5, 3);
        original.put(6, 3);

        Map<Integer, Integer> compare = new HashMap<>();
        compare.put(2, 1);
        compare.put(5, 1);
        compare.put(3, 2);
        compare.put(4, 3);
        compare.put(6, 5);

        List<Integer> result = new ArrayList<>();

        for (int node : original.keySet()) {
            List<Integer> path1 = getPath(node, original);
            List<Integer> path2 = getPath(node, compare);

            if (!path1.equals(path2)) {
                result.add(node);
            }
        }

        Collections.sort(result);
        return result.toString(); // 문자열 반환
	}
	
    private List<Integer> getPath(int node, Map<Integer, Integer> parentMap) {
        List<Integer> path = new ArrayList<>();
        while (parentMap.containsKey(node)) {
            path.add(node);
            node = parentMap.get(node);
        }
        path.add(node); // root
        Collections.reverse(path);
        return path;
    }


	public static void main(String[] args) {
		Solution sol = new Solution();

		// 인자 값은 지원자가 적절하게 수정하여 제출
		System.out.println(sol.solution());
	}
}