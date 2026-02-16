class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        int idx = 1;
        for(Character c : cipher.toCharArray()) {
            if(idx == code) {
                sb.append(c);
                idx = 0;
            }
            idx++;
        }
        return sb.toString();
    }
}