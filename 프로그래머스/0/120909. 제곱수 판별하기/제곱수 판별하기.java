import java.util.*;

class Solution {
    public int solution(int n) {
        int res = (int) Math.sqrt(n);
        return res * res == n ? 1 : 2;
    }
}