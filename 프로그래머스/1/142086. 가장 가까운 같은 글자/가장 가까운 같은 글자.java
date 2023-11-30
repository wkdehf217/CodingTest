import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        String[] split = s.split("");
        int[] answer = new int[split.length];
        // 문자열 길이만큼 리스트 선언
        ArrayList<String> list = new ArrayList<String>(split.length);

        // for문을 돌며 같은 문자가 없으면 -1을 answer에,해당 문자를 리스트에 추가하고 넘어가고
        // 있다면 위치값을 계산하여 answer에 넣어준 다음
        // 리스트에 해당 문자를 추가하면서 기존에 있던 문자를 aa로 바꿔줘 다시 검색되지 않게 바꾼다
        for (int i = 0; i < split.length; i++) {
            if (list.contains(split[i])) {
                answer[i] = i - list.indexOf(split[i]);
                list.set(list.indexOf(split[i]), "aa");
                list.add(i, split[i]);
            } else {
                list.add(i, split[i]);
                answer[i] = -1;
            }
        }
        return answer;
    }
}