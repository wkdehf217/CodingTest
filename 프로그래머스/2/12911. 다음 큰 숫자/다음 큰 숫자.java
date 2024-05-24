class Solution {
    public int solution(int n) {
        int answer = n + 1;
        
        String binary = Integer.toBinaryString(n); // 10진수 -> 2진수
        // System.out.println(binary);
        int cnt = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') cnt++;
        }
        // System.out.println(cnt);
        
        while(answer > n){
            String change = Integer.toBinaryString(answer); // 10진수 -> 2진수
            // System.out.println(binary);
            int aCnt = 0;
            for (int i = 0; i < change.length(); i++) {
                if (change.charAt(i) == '1') aCnt++;
            }
            if(aCnt == cnt) break;
            else answer++;
        }
        return answer;
    }
}