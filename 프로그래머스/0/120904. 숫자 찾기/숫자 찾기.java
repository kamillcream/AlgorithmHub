class Solution {
    public int solution(int num, int k) {
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        char charK = (char)(k + '0');
        
        int idx = 1;
        for(char c : chars) {
            if(c == charK) return idx;
            idx++;
        }
        return -1;
    }
}