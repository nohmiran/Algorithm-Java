package Baekjoon;

import java.io.*;
import java.util.*;

public class ex566_요다 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuffer result = new StringBuffer();
        StringTokenizer st;

        for (int l = 0;l < num;l++) {
            StringBuffer temp = new StringBuffer();
            st = new StringTokenizer(br.readLine());
            int number = st.countTokens();

            for (int n = 0;n < number;n++) {
                if (n < 2) {
                    temp.append(st.nextToken());
                    if (n == 0) temp.append(" ");
                } else result.append(st.nextToken()).append(" ");
            }
            result.append(temp.toString());
            if (l < num - 1) result.append("\n");
        }
        System.out.println(result.toString());
    }
}
