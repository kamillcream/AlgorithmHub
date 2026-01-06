class Solution {
    public int solution(int n) {
        int div = n / 7;
        int remainder = n % 7;
        if (remainder > 0 && remainder < 7) {
            div += 1;
        }
        return div;
    }
}