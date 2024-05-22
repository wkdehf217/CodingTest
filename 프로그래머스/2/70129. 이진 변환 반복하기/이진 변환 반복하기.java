import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(s.length() != 1){
            int cnt = 0;
            
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '0') answer[1]++;
                else cnt++;
            }
            
        
            // 6을 이진변환해야함
            String change = "";
            while(cnt != 1){
                change += cnt % 2;
                cnt = cnt / 2;
            }
            change += '1';
            StringBuffer sb = new StringBuffer(change);  
            s = sb.reverse().toString();
            answer[0]++;
        }
        
        return answer;
    }
}