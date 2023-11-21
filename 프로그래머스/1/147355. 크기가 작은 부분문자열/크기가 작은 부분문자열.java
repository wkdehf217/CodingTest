class Solution {
    
    public int solution(String t, String p) {
        int answer = 0;

        String[] tString = t.split("");
        String[] tCase = new String[t.length()];

        int start = 0;
        for (int i = 0; i < t.length() - p.length()+1; i++) {
            String str = "";
            for (int j = start; j < start + p.length(); j++) {
                str += tString[j];
            }
            tCase[i] = str;
            start++;
        }
        Long sec = Long.parseLong(p);
        for (String a : tCase) {
            if(a==null)continue;
            Long first = Long.parseLong(a);

            if (first <= sec) answer++;
        }
        
        return answer;
    }
}




 