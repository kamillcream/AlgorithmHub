import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int size = array.length;
        Arrays.sort(array);
        return array[size / 2];
    }
}