class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] x = {0,0,0,0,0,0,0,0,0,0};
        int[] y = {0,0,0,0,0,0,0,0,0,0};
        for(int i=0; i<X.length();i++){
           x[X.charAt(i)-48] += 1;
        }
        for(int i=0; i<Y.length();i++){
           y[Y.charAt(i)-48] += 1;
        }

        for(int i=9; i >= 0; i--){
            for(int j=0; j<Math.min(x[i],y[i]); j++){
                answer.append(i);
            }
        }
        if("".equals(answer.toString())){
           return "-1";
        }else if(answer.toString().charAt(0)==48){
           return "0";
        }else {
            return answer.toString();
        }
    }
}

// import java.lang.StringBuilder;
// import java.util.*;
// class Solution {
//     public String solution(String X, String Y) {
//         String answer = "";
        
//         Integer[] xToInt = new Integer[X.length()];
//         Integer[] yToInt = new Integer[Y.length()];

//         String[] xSplit = X.split("");
//         String[] ySplit = Y.split("");

//         for (int i = 0; i < X.length(); i++) {
//             xToInt[i] = Integer.parseInt(xSplit[i]);
//         }

//         for (int i = 0; i < Y.length(); i++) {
//             yToInt[i] = Integer.parseInt(ySplit[i]);
//         }
        
//         for (int i = 0; i < X.length(); i++) {
//             for (int j = 0; j < Y.length(); j++) {
//                 if (Objects.equals(xToInt[i], yToInt[j]) && yToInt[j] != -1) {
//                     answer += String.valueOf(xToInt[i]);
//                     yToInt[j] = -1;
//                     break;
//                 }
//             }
//         }
        
//         String answer2 = "";
//         if(answer.isEmpty()) answer2 = "-1";
//         else if(Integer.valueOf(answer) == 0) answer2 = "0";
//         else{
//             String[] splitAnswer = answer.split("");
//             Arrays.sort(splitAnswer,Collections.reverseOrder());

//             for (String s : splitAnswer) {
//                 answer2 += s;
//             }
//         }
        
        
//         return answer2;
//     }
//}
