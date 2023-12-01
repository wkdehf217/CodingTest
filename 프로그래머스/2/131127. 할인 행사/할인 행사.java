import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        List<String> wanted = new ArrayList<>();
        for (int i = 0; i < number.length; i++) {
            for (int j = 1; j < number[i] + 1; j++) {
                wanted.add(want[i]);
            }
        }

        for (int i = 0; i < discount.length-9; i++) {
            Boolean flag = true;
            HashMap<String, Integer> disMap = new LinkedHashMap<String, Integer>();
            for (int j = i; j < i+10; j++) {
                disMap.put(discount[j], disMap.getOrDefault(discount[j], 0) + 1);
            }
            for (String str : wanted) {
                disMap.put(str, disMap.getOrDefault(str,-1) - 1);
            }
            for (String key : disMap.keySet()) {
                if (disMap.get(key) != 0){
                    flag=false;
                    break;
                }
            }
            if(flag) answer++;
        }
        
        return answer;
    }
}