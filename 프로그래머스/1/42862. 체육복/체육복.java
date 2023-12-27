import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] arr = new int[n];        
 
        for (int i : lost){            
            arr[i-1]--;
        } 
        for (int i : reserve){            
            arr[i-1]++;
        } 
 
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == -1) {
                if(i-1>=0 && arr[i-1] == 1) {
                    arr[i]++;
                    arr[i-1]--;
                }else if(i+1< arr.length && arr[i+1] == 1) {
                    arr[i]++;
                    arr[i+1]--;
                }else 
                    answer--;
            }
        }
        return answer;
    }
}

// import java.util.Arrays;

// class Solution {
//     public int solution(int n, int[] lost, int[] reserve) {
//         int answer = 0;
        
//         int[] list = new int[n];
//         Arrays.fill(list, 1);

//         for (int i : reserve) {
//             i--;
//             list[i]++;
//         }

//         for (int i : lost) {
//             i--;
//             list[i]--;

//             if (i == 0) {
//                 if (list[i + 1] > 1 && list[i] == 0) {
//                     list[i + 1]--;
//                     list[i]++;
//                 }
//             }

//             if (list[i - 1] > 1 && list[i] == 0) {
//                 list[i - 1]--;
//                 list[i]++;
//             } else if (list[i + 1] > 1 && list[i] == 0) {
//                 list[i + 1]--;
//                 list[i]++;
//             }
//         }

//         for (int i : list) {
//             if (i >= 1) {
//                 answer++;
//             }
//         }
        
//         return answer;
//     }
// }