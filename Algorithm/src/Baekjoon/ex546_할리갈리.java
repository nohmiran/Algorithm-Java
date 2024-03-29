package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ex546_할리갈리 {
    
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            String key = st.nextToken();
            int value = Integer.parseInt(st.nextToken());
            
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + value);
            }else {
                map.put(key, value);
            }
        }
        
        boolean containsValueFive = false;
        for(String key : map.keySet()) {
            if(map.get(key) == 5) {
                containsValueFive = true;
            }
        }
        System.out.print(containsValueFive ? "YES" : "NO");
    }
}
