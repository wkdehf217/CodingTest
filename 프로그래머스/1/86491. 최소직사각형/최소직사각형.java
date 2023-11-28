class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        // 가로와 세로중 큰것을 앞으로 정렬
        for(int i= 1;i<sizes.length+1;i++){
            if(sizes[i-1][0]<sizes[i-1][1]){
                int temp = sizes[i-1][0];
                    sizes[i-1][0] = sizes[i-1][1];
                    sizes[i-1][1] = temp;
            }
        }
        int maxWidth = 0;
        int maxHeight = 0;
        
        // 정렬된 값 기준으로 제일 큰 가로값과 제일 큰 세로값을 구함
        for(int i= 1;i<sizes.length+1;i++){
            if(sizes[i-1][0]>maxWidth){
                maxWidth = sizes[i-1][0];
            }
            if(sizes[i-1][1]>maxHeight){
                maxHeight = sizes[i-1][1];
            }            
        }
        
        answer = maxWidth * maxHeight;
        return answer;
    }
}