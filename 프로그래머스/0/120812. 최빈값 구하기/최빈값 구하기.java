import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        int maxCount = 0;
        
        for(int num : array) {
            int count = map.getOrDefault(num, 0) + 1;
            if(count > maxCount) {
                maxCount = count;
                answer = num;
            } else if(count == maxCount) {
                answer = -1;
            }
            map.put(num, count);
        }
        return answer;
    }
}