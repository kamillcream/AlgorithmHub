class Solution {
    public int solution(int n) {
        int answer = 0; // i!
        int start = 1;
        while(answer <= n) { // i!가 n보다 작거나 같을 동안
            answer = factorial(start);
            if(answer > n) break;
            else start++;
        }
        return start - 1;
    }
    
    public int factorial(int n) {
        int res = 1;
        
        for(int i = 1 ; i <= n ;i++) {
            res *= i;    
        }
        return res;
    }
}