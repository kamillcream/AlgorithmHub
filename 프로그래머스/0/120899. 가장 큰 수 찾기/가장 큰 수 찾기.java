class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int maxValue = array[0];
        int maxIdx = 0;
        
        for(int i = 1 ; i < array.length; i++) {
            if(maxValue < array[i]) {
                maxValue = array[i];
                maxIdx = i;
            }
        }
        answer[0] = maxValue;
        answer[1] = maxIdx;
        return answer;
    }
}