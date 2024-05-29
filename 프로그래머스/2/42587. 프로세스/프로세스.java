class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int len = priorities.length;
        
        for(int j=0;;j++) {
            int max=priorities[j%len];
            for(int i=j;i<len+j;i++) {
                if(priorities[i%len]>max) {
                    max=priorities[i%len];
                    j=i;  //수정
                }
            }
            
            priorities[j%len]=0;
            answer++;
            
            if(j%len==location)  {
                break;
            }
        }
        
        return answer;
    }
}