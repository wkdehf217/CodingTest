class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i=0;i<a.length;i++){
            int c = a[i] * b[i];
            answer+=c;
        }
        
        
        return answer;
    }
}