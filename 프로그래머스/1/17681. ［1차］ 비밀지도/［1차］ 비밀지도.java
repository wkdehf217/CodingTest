// class Solution {
//     public String[] solution(int n, int[] arr1, int[] arr2) {        
//         String[] answer = new String[n];
        
//         for (int i = 0; i < n; i++) {
//           int a = arr1[i];
//           int b = arr2[i];
//           String str = String.format("%0" + n + "d", Integer.parseInt(Integer.toBinaryString(a | b)));
//           str = str.replace("1", "#");
//           str = str.replace("0", " ");
//           answer[i] = str;
//         }
        
//         return answer;
//     }
// }
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {        
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            int combined = arr1[i] | arr2[i];
            StringBuilder strBuilder = new StringBuilder();
            
            for (int j = n - 1; j >= 0; j--) {
                if ((combined & (1 << j)) > 0) {
                    strBuilder.append("#");
                } else {
                    strBuilder.append(" ");
                }
            }
            
            answer[i] = strBuilder.toString();
        }
        
        return answer;
    }
}