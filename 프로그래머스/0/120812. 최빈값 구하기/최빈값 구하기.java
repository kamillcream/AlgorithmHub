import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int maxCount = 0;
        int answer = 0;
        
        for(int number : array) {
            int count = countMap.getOrDefault(number, 0) + 1;
            if(count > maxCount) {
                maxCount = count;
                answer = number;
            } else if(count == maxCount) {
                answer = -1;
            }
            countMap.put(number, count);
        }
        return answer;
        
    }
}