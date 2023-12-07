class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int[][] map = new int[park.length][park[0].length()];
        for(int i=0;i<park.length;i++){
            String[] str = park[i].split("");
            for(int j=0;j<str.length;j++){
                if(str[j].equals("O")) map[i][j] = 0;
                if(str[j].equals("X")) map[i][j] = 1;
            }
            if(park[i].contains("S")) {
                answer[0] = i;
                answer[1] = park[i].indexOf("S");
            }
            
        }
        for(int i=0;i<routes.length;i++){
            Boolean flag = true;
            int num = routes[i].charAt(routes[i].length() - 1) - '0';
            if(routes[i].charAt(0) == 'N'){
                if(answer[0] - num < 0) continue;
                for(int j=1;j<num+1;j++){
                    if(map[answer[0]-j][answer[1]] == 1) flag = false;
                }
                if(flag) answer[0] -= num;
                continue;
            }
            if(routes[i].charAt(0) == 'S'){
                if(answer[0] + num > park.length-1) continue;
                for(int j=1;j<num+1;j++){
                    if(map[answer[0]+j][answer[1]] == 1) flag = false;
                }
                if(flag) answer[0]+=num;
                continue;
            }
            if(routes[i].charAt(0) == 'W'){
                if(answer[1] - num < 0) continue;
                for(int j=1;j<num+1;j++){
                    if(map[answer[0]][answer[1]-j] == 1) flag = false;
                }
                if(flag) answer[1] -= num;
                continue;
            }
            if(routes[i].charAt(0) == 'E'){
                if(answer[1] + num > park[0].length()-1) continue;
                for(int j=1;j<num+1;j++){
                    if(map[answer[0]][answer[1]+j] == 1) flag = false;
                }
                if(flag) answer[1] += num;
            }
        }
        return answer;
    }
}
