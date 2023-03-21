package Baekjoon;

import java.io.*;
import java.util.*;

public class ex213_과자 {
	
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int coin = Integer.parseInt(st.nextToken()); // 과자 한 개의 가격
        int count = Integer.parseInt(st.nextToken()); // 사려고 하는 과자의 개수
        int money = Integer.parseInt(st.nextToken()); // 현재 동수쓰 호주머니 안의 돈
        int price = coin * count; // 제과점에 내야하는 가격
        
        // 동수가 부모님께 받아야 하는 돈을 구하면 success..
        if (price <= money) { // 제과점에 결제해야 하는 값이 현재 가진 돈보다 작으면
            System.out.print(0); // 부모님께 받을 돈은 0원
        } else { // 그렇지 않다면
            System.out.print(price - money); // 제과점에 결제해야 하는 가격에서 동수가 현재 가지고 있는 돈을 뺀 나머지를 부모님께 받아야해요ㅠ
        }
    }
}
