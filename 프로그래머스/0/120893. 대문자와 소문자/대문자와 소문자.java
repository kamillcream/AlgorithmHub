class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()) {
            if(Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
            if(Character.isLowerCase(c)) sb.append(Character.toUpperCase(c));
        }
        return sb.toString();
    }
}