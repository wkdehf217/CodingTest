import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> listA = new ArrayList<Integer>();
        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            // k보다 작거나 같으면 명예의 전당 등록
            // 이후 정렬해서 제일 작은점수 리턴
            if (i < k) {
                listA.add(score[i]);
                listA.sort(Comparator.naturalOrder());

                answer[i] = listA.get(0);
            } else {
                // 새로운 점수가 기존 점수보다 높으면 그 자리 대체
                // 이후 정렬해서 제일 작은점수 리턴
                if (listA.get(0) < score[i]) {
                    listA.set(0,score[i]);
                }
                listA.sort(Comparator.naturalOrder());
                answer[i] = listA.get(0);
            }
        
        
    }
        return answer;
}
}