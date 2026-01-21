class Solution {
    public int[][] solution(int[] num_list, int n) {
        int chunkSize = num_list.length / n;
        int[][] answer = new int[chunkSize][n];
        int idx = 0;
        for(int i = 0; i < num_list.length; i+=n) {
            for(int j = 0; j < n ;j++) {
                answer[idx][j] = num_list[i+j];
            }
            idx++;
        }
        return answer;
    }
}