import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = array[0]; 
        for(int number : array) {
            int prevGap = Math.abs(n - answer);
            int newGap = Math.abs(n - number);
            if(newGap < prevGap) answer = number;
        }
        
        return answer;
    }
}