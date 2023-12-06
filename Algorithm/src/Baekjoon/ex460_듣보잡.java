package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class ex460_듣보잡 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken(" ")); // 듣잡
        int m = Integer.parseInt(st.nextToken()); // 보집

        // 듣잡 명단과 출현 횟수 저장
        Map<String, Integer> people = new HashMap<>();

        // 듣잡 명단 저장
        for (int i = 0; i < n; i++) {
            people.put(br.readLine(), 1);
        }

        // 보잡 명단과 출현 횟수 업데이트
        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            people.put(name, people.getOrDefault(name, 0) + 1);
        }

        // 듣보잡 명단 구하기
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (String s : people.keySet().stream().sorted().collect(Collectors.toList())) {
            if (people.get(s) == 2) { // 듣보잡 명단인 경우
                count++;
                sb.append(s).append("\n");
            }
        }
        System.out.println(count);
        System.out.println(sb);
    }
}
