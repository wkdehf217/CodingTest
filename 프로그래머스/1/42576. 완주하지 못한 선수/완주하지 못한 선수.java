import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";        
        // 다루기 쉽게 리스트로 변경
        // ArrayList<String> list = new ArrayList<>(Arrays.asList(completion));        
        
//         // 비교해서 있다면 완주자 목록에서 빼고
//         // 없다면 미완주자 리턴
//         // 효율성 테스트..?
//         for(String str : participant){
//             if(list.contains(str)) {
//                 list.remove(str);
//             }
//             else{
//                 answer = str;
//             }
//         }
        
//         Arrays.sort(participant);
//         Arrays.sort(completion);
//         ArrayList<String> list = new ArrayList<>(Arrays.asList(completion));
//         list.add("");
        
//         for(int i = 0; i < participant.length; i++) {
//             System.out.println(participant[i]);
//             System.out.println(list.get(i));
//             System.out.println("");
//             if(participant[i] != list.get(i)) {
//                 answer = participant[i];
//                 break;
//             }
//         }
        
       
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0;i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                break;
            }
        }
        if(answer == ""){
            answer = participant[participant.length-1];
        }
        
        return answer;
    }
}
