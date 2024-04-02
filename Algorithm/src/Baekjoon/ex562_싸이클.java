package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ex562_싸이클 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        int temp = n;
        
        while (true) {
            if (list.contains(temp)) {
                System.out.println(list.size() - list.lastIndexOf(temp));
                break;
            }
            list.add(temp);
            temp = temp * n % p;
        }
    }
}
