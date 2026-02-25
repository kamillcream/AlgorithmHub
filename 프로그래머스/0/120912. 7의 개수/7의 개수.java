class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int n : array) {
            String str = String.valueOf(n);
            answer += str.length() - str.replace("7", "").length();
        }
        return answer;
    }
}