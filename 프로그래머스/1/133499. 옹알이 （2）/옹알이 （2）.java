class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String bal : babbling){
            if(bal.contains("ayaaya") || bal.contains("yeye") || bal.contains("woowoo") || bal.contains("mama")) continue;
            bal = bal.replace("aya"," ");
            bal = bal.replace("ye"," ");
            bal = bal.replace("woo"," ");
            bal = bal.replace("ma"," ");
            bal = bal.replace(" ","");
            if(bal.length() == 0) answer++;
        }
        return answer;
    }
    
    
}