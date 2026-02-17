import java.util.*;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        List<Character> answer = new ArrayList<>();
        for (char c : count.keySet()) {
            if (count.get(c) == 1) answer.add(c);
        }

        Collections.sort(answer);

        StringBuilder sb = new StringBuilder();
        for (char c : answer) sb.append(c);
        return sb.toString();
    }
}