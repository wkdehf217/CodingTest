class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String[] arr = s.split("");
        int aCnt = 0;
        int bCnt = 0;
        for(String str : arr){
            if(aCnt<0) {
                answer = false;
                return answer;
            }
            if(str.equals("(")) aCnt++;
            if(str.equals(")")) aCnt--;
        }
        if(aCnt != 0 || arr[arr.length-1].equals("(")) answer = false;

        return answer;
    }
}