class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int numberSize = numbers.length;
        
        for(int i = 0; i < numberSize ; i++){
            answer += numbers[i];
        }
        
        return answer / numberSize;
    }
}