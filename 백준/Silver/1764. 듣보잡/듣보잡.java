import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> list = new ArrayList<>();

        // 읽기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < a + b; i++) {
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for(String key : map.keySet()){
            if(map.get(key) > 1){
                list.add(key);
            }
        }
        Collections.sort(list);

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
