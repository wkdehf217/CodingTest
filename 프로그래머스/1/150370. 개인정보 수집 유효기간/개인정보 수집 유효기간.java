import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        int dayForM = 28;
        int todayY = Integer.parseInt(today.substring(0,4));
        int todayM = Integer.parseInt(today.substring(5,7));
        int todayD = Integer.parseInt(today.substring(8,10));

        int totalD = (todayY*dayForM*12) + (todayM*28) + todayD;
        List<Integer> answerArr = new ArrayList<>();
        HashMap<Character,Integer> termsMap = new HashMap<>();
        for(String term : terms){
            char termO = term.charAt(0);
            int termM = Integer.parseInt(term.substring(2));
            termsMap.put(termO,termM);
        }
        for(int i=0; i<privacies.length; i++){
            char privacyO = privacies[i].charAt(11);
            int privacyY = Integer.parseInt(privacies[i].substring(0,4));
            int privacyM = Integer.parseInt(privacies[i].substring(5,7));
            int privacyD = Integer.parseInt(privacies[i].substring(8,10));
            int totalPrivacyD = (privacyY*12*dayForM) + (privacyM*dayForM) + privacyD;
            int termM = termsMap.get(privacyO);
            int termDay = termM * dayForM;
            if(totalPrivacyD+termDay <=totalD){
                answerArr.add(i+1);
            }
        }

        return answerArr;
    }
}


// import java.text.ParseException;
// import java.text.SimpleDateFormat;
// import java.util.*;

// class Solution {
    
//     public int[] solution(String today, String[] terms, String[] privacies) {
    
//         int[] answer = new int[privacies.length];
        
//         String[] splitedPrivacies = new String[privacies.length];
//         String[] splitedPrivaciesTerms = new String[privacies.length];
//         String[] splitedTerms = new String[terms.length];
//         String[] splitedTermsNum = new String[terms.length];

//         for (int i = 0; i < privacies.length; i++) {
//             String[] split = privacies[i].split(" ");
//             splitedPrivacies[i] = split[0];
//             splitedPrivaciesTerms[i] = split[1];
//         }

//         for(int i=0;i< terms.length;i++){
//             String[] split = terms[i].split(" ");
//             splitedTerms[i] = split[0];
//             splitedTermsNum[i] = split[1];
//         }

//         for (int i=0;i< privacies.length;i++) {
//             try {

//                 SimpleDateFormat transFormat = new SimpleDateFormat("yyyy.MM.dd");
//                 Date date1 = transFormat.parse(today);
//                 Date date2 = transFormat.parse(splitedPrivacies[i]);

//                 int dif = (int) ((date1.getTime()-date2.getTime()) / (24*60*60*1000));
//                 for(int j=0;j<splitedTerms.length;j++){
//                     if(splitedPrivaciesTerms[i].equals(splitedTerms[j])){
//                         int num = Integer.parseInt(splitedTermsNum[j]);
//                         if(dif > num*28){
//                             answer[i] = i;
//                         }
//                     }
//                 }
//             } catch (Exception e) {

//                 System.out.println(e.getMessage());
//             }
//         }
//         return answer;
//     }
// }