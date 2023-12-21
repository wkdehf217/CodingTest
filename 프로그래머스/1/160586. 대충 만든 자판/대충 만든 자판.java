import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {


        List<HashMap<Character, Integer>> mapList = new ArrayList<>();


        int n = targets.length;

        int keymapSize = keymap.length;

        for(int i = 0; i<keymapSize; i++){

            HashMap<Character, Integer> countMap = new HashMap<>();

            for(int j = 0 ; j < keymap[i].length(); j++){
                if(!countMap.containsKey(keymap[i].charAt(j))){
                    countMap.put(keymap[i].charAt(j),j+1);
                }
                else{
                    continue;
                }
            }


            mapList.add(countMap);

        }

        int[] answer = new int[n];

        for(int i = 0; i<n; i++){
            int count = 0;
            for(int j = 0; j<targets[i].length(); j++){
                char c = targets[i].charAt(j);
                int min = 1000;
                int temp = 0;
                for(int x = 0 ; x < keymapSize; x++){
                    temp = mapList.get(x).getOrDefault(c,1000);
                    if(temp<min){
                        min = temp;
                    }
                }
                if(min == 1000){
                    //continue; // continue가 아니라 break
                    count = 0; // answer값을 -1로 바꿔주기위해 count다시 초기화
                    break;
                }
                count += min;

            }

            if(count == 0){
                answer[i] = -1;
            }
            else{
                answer[i] = count;
            }


        }

        return answer;

    }
}
// import java.util.*;

// class Solution {
//     public int[] solution(String[] keymap, String[] targets) {
//         int[] minTouch = new int['Z' - 'A' + 1];
//         Arrays.fill(minTouch, 200);
//         for (String key : keymap) {
//             for (int i = 0; i < key.length(); i++) {
//                 minTouch[key.charAt(i) - 'A'] = Math.min(minTouch[key.charAt(i) - 'A'], i + 1);
//             }
//         }
//         int[] answer = new int[targets.length];
//         for (int i = 0; i < targets.length; i++) {
//             String target = targets[i];
//             int sum = 0;
//             boolean canMake = true;
//             for (int j = 0; j < target.length(); j++) {
//                 if (minTouch[target.charAt(j) - 'A'] == 200) {
//                     canMake = false;
//                     break;
//                 }
//                 sum += minTouch[target.charAt(j) - 'A'];
//             }
//             answer[i] = canMake ? sum : -1;
//         }
//         return answer;
//     }
// }