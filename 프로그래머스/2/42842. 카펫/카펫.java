class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int addValue = (brown / 2) + 2; // 가로 + 세로
            int xy = brown + yellow; // 가로 * 세로

            int y = 0, x = 0;

            // y값은 x값보다 클 수 없음 (y 최소값 3)
            for (y = 3; y <= addValue / 2; y++)
            {
                // 조건에 따른 x, y값 세팅 (더한 값)
                x = addValue - y;

                // 조건을 만족하는지 체크 (곱한 값)
                if (xy == x * y)
                    break;
            }
            answer[0] = x;
        answer[1] = y;
            return answer;
        
    }
}
