class Solution {
    
    int cnt = 0;
    public int solution(int[] number) {
        int answer = 0;
        
        int start = 0;
        int n = number.length;
        int r = 3;        
        boolean visited[] = new boolean[13];
        
        
        
        dfs(number,visited,start,n,r);        
        answer =  cnt;
        return answer;
    }
    
    public void dfs(int[] arr, boolean[] visited, int start, int n, int r) {       
        if(r == 0) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    sum += arr[i];
                }
            }            
            if(sum == 0) 
            {   
                cnt++;
                //sum -= arr[start];
                return;
            }
        } 

        for(int i=start; i<n; i++) {
            visited[i] = true;
            dfs(arr, visited, i + 1, n, r - 1);
            visited[i] = false;            
        }
    }
}



