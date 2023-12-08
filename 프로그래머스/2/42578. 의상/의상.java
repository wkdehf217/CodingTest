import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;

        
        HashMap<String, Integer> map = new HashMap<>();
        String[] str = new String[clothes.length];

        // key에 대분류 value에 숫자 '1' 넣기.
        // key가 겹치면 value+1
        for (int i = 0; i < clothes.length; i++) {
            str[i] = clothes[i][1];
            // 중복이 아니면 value에 1을 넣고
            if (map.get(clothes[i][1]) == null) {
                map.put(clothes[i][1], 1);
            }
            // 중복이면 value + 1 을 해줌
            else if (map.get(clothes[i][1]) != null) {
                int x = map.get(clothes[i][1]);
                map.put(clothes[i][1], x+1);
            }
        }

        String[] str2 =  Arrays.stream(str).distinct().toArray(String[]::new);

        // value 값들을 더해주는 과정
        int value = 1;
        for (int i = 0; i < str2.length; i++) {
            value *= (map.get(str2[i])+1);
        }

        answer = value -1;
        


        return answer;
    }
}

// import java.util.*;

// public class Main {

//     public static void main(String[] args) {
//         int answer = 0;
//         String[][] clothes = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
//         HashMap<String, String> map = new HashMap<>();

//         for(int i=0;i<clothes.length;i++){

//             String clothType = clothes[i][1];
//             String cloth = clothes[i][0];

//             map.put(clothType, map.getOrDefault(clothType,"") +"/" +cloth);
//         }

//         for(int i=0;i<map.size();i++){
//             for(int j=0;j<map[i].)
//         }
// //
// //        for (String key : map.keySet()){
// //            String[] val = map.get(key).split("/");
// //            for(int i=0;i<val.length-1;i++){
// //                answer++;
// //            }
// //
// //        }

//         System.out.println(answer);
//     }
// }