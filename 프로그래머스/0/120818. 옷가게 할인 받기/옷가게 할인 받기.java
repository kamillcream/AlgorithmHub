class Solution {
    public int solution(int price) {
        int discountRate = 0;
        
        if(price >= 100000 && price < 300000) {
            discountRate = 5;
        } else if(price >= 300000 && price < 500000) {
            discountRate = 10;
        } else if(price >= 500000) {
            discountRate = 20;
        }
        return price * (100 - discountRate) / 100;
    }
}