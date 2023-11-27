class Solution {
    public String solution(int a, int b) {
        String answer = "";
        //1  2  3  4  5  6  7  8  9  10  11  12
        //31 29 31 30 31 30 31 31 30 31  30  31  
        // 윤년 : 2월 29일 추가, 2월과 8월이 같은 요일으로 시작
        // 1 3 5 7 8 10 12월은 31일
        int c = 0;
        int num = 0;
        for(int x = 1; x < a; x++){
            if(x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12){
                num += 31;
            }
            else if(x==2){
                num += 29;
            }else{
                num += 30;
            }
        }
        
        num += b-1;
        c = num %7;
        System.out.println(c);
            switch(c){
                case 0: answer = "FRI";
                    break;
                case 1: answer = "SAT";
                    break;
                case 2: answer = "SUN";
                    break;
                case 3: answer = "MON";
                    break;
                case 4: answer = "TUE";
                    break;
                case 5: answer = "WED";
                    break;
                case 6: answer = "THU";
                    break;
            }        
        
        return answer;
        }
        
    
}