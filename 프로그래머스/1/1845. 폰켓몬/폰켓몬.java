import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int length = nums.length / 2;
        
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        int size = set.size();

        if(size >= length) {
            answer = length;
        } else {
            answer = size;
        }        
        
        return answer;
    }
}