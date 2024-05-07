import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        int[] ch = new int[arr.length];
        for(int i=0; i<arr.length;i++){
          ch[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(ch);

        answer += Integer.toString(ch[0]);
        answer += " " + Integer.toString(ch[ch.length-1]);

        
        return answer;
    }
}