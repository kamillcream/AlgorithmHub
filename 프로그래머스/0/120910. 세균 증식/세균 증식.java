class Solution {
    public int solution(int n, int t) {
        int res = n;
        for(int i = 0; i < t; i++) {
            res *= 2;
        }
        return res;
    }
}