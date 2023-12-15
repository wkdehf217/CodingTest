import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        int count = 0;

        // true 인 곳만 체크해서 넓이를 구하려고 함
        // Boolean 초기화랑 boolean 초기화 차이
        boolean[][] map = new boolean[101][101];

        // 읽기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 반복문 돌면서 map에 체크
            // 입력받은 위치부터 10칸씩
            for (int j = a; j < a + 10; j++) {
                for (int k = b; k < b + 10; k++) {
                    if (!map[j][k]) {
                        map[j][k] = true;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);


    }
}



