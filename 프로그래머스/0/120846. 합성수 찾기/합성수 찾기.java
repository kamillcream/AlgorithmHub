class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n;i++) {
            if(isCombined(i)) {
                answer++;
            }
        }
        return answer;
    }
    
    private boolean isCombined(int n) {
        int div = 0;
        for(int i = 1 ; i <= n ; i++) {
            if( n % i == 0) div++;
            if(div >= 3) break;
        }
        if(div >= 3) return true;
        return false;
    }
}