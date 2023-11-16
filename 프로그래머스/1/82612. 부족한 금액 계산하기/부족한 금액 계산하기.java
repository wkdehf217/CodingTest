class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long temp = 0;
        
        for(int i= 1;i<count+1;i++){
            temp += price*i;          
        }
        if(money - temp >= 0) return 0;
        else return temp - money;
    }
}