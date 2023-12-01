import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        // 원하는 제품 수 만큼 리스트 생성
        // banana 3개, apple 2개 이런식으로
        List<String> wanted = new ArrayList<>();
        for (int i = 0; i < number.length; i++) {
            for (int j = 1; j < number[i] + 1; j++) {
                wanted.add(want[i]);
            }
        }

        // 할인 일 수 -9 만큼 반복하면서
        // 플래그를 두고
        // Linkedhashmap을 사용해서 정렬되는 맵을 선언함
        // discount의 0~10번째 값을 Map에 넣고
        // wanted의 값을 Map에 넣어주는데, 이때 같은것이 있다면 -1, 없다면 -1을 넣음
        // = dismap에는 wanted의 pot이 없기 때문에 -1이 들어가게 됨.
        // = dismap은 chicken = 1, banana = -1, apple = 1, rice = 0, pork = 0, pot = -2
        // 고로 flag = false, 다음것으로 넘어감
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
