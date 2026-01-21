class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int xPos = dot[0];
        int yPos = dot[1];
        
        if(xPos > 0 && yPos > 0) answer = 1;
        else if(xPos > 0 && yPos < 0) answer = 4;
        else if(xPos < 0 && yPos > 0) answer = 2;
        else if(xPos < 0 && yPos < 0) answer = 3;
        return answer;
    }
}