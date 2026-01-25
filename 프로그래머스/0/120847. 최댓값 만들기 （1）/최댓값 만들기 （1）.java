import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int size = numbers.length;
        return numbers[size-1] * numbers[size-2];
    }
}