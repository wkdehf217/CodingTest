import java.util.Map;
import java.util.LinkedHashMap;

class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        
        while(true){
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            answer++;
            if(a == b)
                break;
        }
        
//        Map<Integer, Integer> map = new LinkedHashMap<>();

//         for (int i = 1; i <= n; i++) {
//             if (i == a || i == b) {
//                 map.put(i, 0);
//             } else {
//                 map.put(i, i);
//             }
//         }
//         int count = 0;
//         while (map.size() >= 2) {
//             //int size = map.size();
//             //for (int i = 1;i<=size;i+=2) {

//             for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//                 int i = entry.getKey();
//                 if (map.get(i) == map.get(i + 1)) {
//                     answer = count;
//                     break;
//                 }
//                 if (map.get(i) == 0) {
//                     map.remove(i+1);
//                     continue;
//                 }
//                 if(map.get(i + 1) == 0){
//                     map.remove(i);
//                     continue;
//                 }
//                 map.remove(i);
//             }
//             count++;
//         }



        return answer;
    }
}