class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int zeroCnt = 0;
        String[] strArray = new String[lottos.length];

        for (int i = 0; i < lottos.length; i++) {
            strArray[i] = String.valueOf(lottos[i]);
            if (strArray[i].equals(String.valueOf(0))) {
                zeroCnt++;
            }
        }

        for(int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if (strArray[j].equals(String.valueOf(win_nums[i]))) {
                    cnt++;
                }

            }
        }
        int high = cnt + zeroCnt;
        int low = cnt;
         
        switch(high){
            case 0 : answer[0] = 6;
                break;
            case 1 : answer[0] = 6;
                break;
            case 2 : answer[0] = 5;
                break;
            case 3 : answer[0] = 4;
                break;
            case 4 : answer[0] = 3;
                break;
            case 5 : answer[0] = 2;
                break;
            case 6 : answer[0] = 1;
                break;
        }
        
        switch(low){
            case 0 : answer[1] = 6;
                break;
            case 1 : answer[1] = 6;
                break;
            case 2 : answer[1] = 5;
                break;
            case 3 : answer[1] = 4;
                break;
            case 4 : answer[1] = 3;
                break;
            case 5 : answer[1] = 2;
                break;
            case 6 : answer[1] = 1;
                break;
        }
        
        return answer;
    }
}