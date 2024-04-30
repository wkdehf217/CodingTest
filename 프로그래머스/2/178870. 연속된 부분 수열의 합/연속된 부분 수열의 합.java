import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {0,0};
        int min = 1000000000;
        
        int start=0;
        int end=0;
        int num=0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        while(start<sequence.length) {
            
            // num이 k보다 작다면 end의 값을 추가하고 end를 증가
            while(end<sequence.length && num<k) {
                num+=sequence[end];
                end++;
            }

			// 합이 k라면 map에 담기
            if(num==k) {
                map.put(start,end);
            }
            
            // start 포인트를 뒤로 옮긴다
            num -= sequence[start];
            start++;
        }
        
        // map에 넣어둔 값 비교
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int front = entry.getKey();
            int back = entry.getValue();
            if((back-front) < min) {
                min = back-front;
                answer[1]=back-1;  // 주의!! end에 1이 증가된 값이므로 -1 해줘야함.
                answer[0]=front;
            }
        }        
        
        return answer;
    }
}