import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            int sqrt = (int)Math.sqrt(i); //제곱근 구하는 함수
            ArrayList<Integer> list  = new ArrayList<>();
            
            for (int j = 1; j <= sqrt; j++) {
                if (i % j == 0) {
                    list.add(j); //약수 중 작은 수 
                    
                    if (i / j != j) {
                        list.add(i / j); //약수 중 큰 수 저장
                    }
                } 
            }
            if (list.size() > limit) {
                answer += power;
            } else {
                answer += list.size();
            }
        }
        return answer;
    }
}