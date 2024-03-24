package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex555_치킨댄스를추는곰곰이를본임스 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); // 치킨 개수
        String[] split = br.readLine().split(" ");

        int cokeCount = Integer.parseInt(split[0]); // 콜라 개수
        int beerCount = Integer.parseInt(split[1]); // 맥주 개수
        int result = (cokeCount / 2) + beerCount;

        if (result > num) {
            result = num;
        }
        System.out.println(result);
    }
}
