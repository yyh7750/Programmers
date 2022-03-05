package 부족한금액계산;

class Solution {
    public long solution(int price, int money, int count) {

        long totalPrice = 0;
        
        for(long i = 1; i <= count; i++) {
        	totalPrice += price * i;
        }
     
        return (money - totalPrice >= 0) ? 0 : totalPrice - money;
    }
}