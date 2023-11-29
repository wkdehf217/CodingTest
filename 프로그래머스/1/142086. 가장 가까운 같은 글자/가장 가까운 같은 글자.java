import java.util.ArrayList;

class Solution {
    public int[] solution(String s) {
        
        String[] split = s.split("");
        int[] answer = new int[split.length];

        // 문자열을 잘라서 리스트에 넣는다
        ArrayList<String> list = new ArrayList<String>(split.length);

        // for문을 돌며 같은 문자가 없으면 -1을 추가하고 넘어가고
        // 있다면 위치값을 계산하여 answer에 넣어준다
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