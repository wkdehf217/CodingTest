import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        String[] report1 =  Arrays.stream(report).distinct().toArray(String[]::new);
        int[] answer = new int[id_list.length];
        String[] splitReport = new String[report1.length];
        String[] splitReportWho = new String[report1.length];

        // HashMap 쓰면 될듯
        // 앞 뒤를 잘라서 각각 저장        
        for (int i = 0; i < report1.length; i++) {
            String[] split = report1[i].split(" ");
            splitReport[i] = split[0];
            splitReportWho[i] = split[1];
        }
        
        // map에다가 뒤에있는 값 기준으로 없으면 1, 중복값일 때 +1 해서 저장해두기
        HashMap<String, Integer> map = new HashMap<String, Integer>();        
        for (int i = 0; i < report1.length; i++) {
            if (map.get(splitReportWho[i]) == null) {
                map.put(splitReportWho[i], 1);
            } else {
                int x = map.get(splitReportWho[i]);
                map.put(splitReportWho[i], x + 1);
            }
        }
        
        // 맵에서 뒤에있는 값 가져온게 k 이상이면
        // map2에다가 제보한사람 / 중복이면 +1해서 저장
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();
        for (int i = 0; i < splitReportWho.length; i++) {
            if (map.get(splitReportWho[i]) >= k) {
                map2.put(splitReport[i], map2.getOrDefault(splitReport[i], 0) + 1);
            }
        }

        // 가져오기
        for(int i=0;i< id_list.length;i++){
            if(map2.get(id_list[i]) == null){
                answer[i] = 0;
            }else{
                answer[i] = map2.get(id_list[i]);
            }
        }
        
        return answer;
    }
}