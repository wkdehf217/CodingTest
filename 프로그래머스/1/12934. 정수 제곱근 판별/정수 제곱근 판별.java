class Solution {
    public long solution(long n) {
//         long answer = 0;
//         Boolean flag = false;
//         for(int i=1;i<=n/2;i++){
//             if(i*i == n){
//                 answer = (i+1)*(i+1);
//                 flag = true;
//                 break;
//             }
//         }
        
//         if(!flag) answer = -1;
        
//         return answer;
        // n이 음수인 경우 제곱수가 아님
        if (n < 0) return -1;
        
        // n이 0인 경우 제곱근도 0
        if (n == 0) return -1;
        
        // n이 양수인 경우
        // i * i == n을 만족하는 i를 찾음
        for (long i = 1; i * i <= n; i++) {
            if (i * i == n) {
                // 제곱수인 경우
                // 다음 정수의 제곱을 반환
                return (i + 1) * (i + 1);
            }
        }
        
        // 제곱수가 아닌 경우
        return -1;
    }
}

