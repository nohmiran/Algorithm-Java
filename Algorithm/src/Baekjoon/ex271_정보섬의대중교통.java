package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex271_정보섬의대중교통 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int walk = Integer.parseInt(st.nextToken()); // 쟈철역까지 걷는 시간
        int bus = Integer.parseInt(st.nextToken());
        int lastTime = Integer.parseInt(st.nextToken()); // 막차쓰 오는 시간
        int subway = walk + (lastTime - walk);

        System.out.println(bus != subway? (bus < subway? "Bus" : "Subway") : "Anything");
    }
}
