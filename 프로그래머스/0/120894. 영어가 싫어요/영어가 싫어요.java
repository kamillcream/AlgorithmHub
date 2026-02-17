class Solution {
    public long solution(String numbers) {
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(char c : numbers.toCharArray()) {
            sb.append(c);
            for (int i = 0; i < words.length; i++) {
                if (sb.toString().equals(words[i])) {
                    answer.append(i);
                    sb.setLength(0);
                    break;
                }
            }
        }
        return Long.parseLong(answer.toString());
    }
}