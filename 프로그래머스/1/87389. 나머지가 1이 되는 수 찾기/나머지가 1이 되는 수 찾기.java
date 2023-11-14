class Solution {
    public int solution(int n) {
        int answer = 0;
        int divine = 2;
        
        while(divine<n){
            int temp = n % divine;
            if(temp == 1) 
            {
                answer = divine;
                break;
            }
            else divine++;
        }
        return answer;
    }
}