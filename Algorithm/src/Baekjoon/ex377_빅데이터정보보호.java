package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex377_빅데이터정보보호 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String str = br.readLine();
        
        int bigdata = 0;
        int security = 0;

        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            if (c == 'b') {
                bigdata++;
            } else if (c == 's') {
                security++;
            }
        }

        String result = (bigdata > security) ? "bigdata?"
                : (security > bigdata) ? "security!" 
                    : "bigdata? security!";
        System.out.print(result);
    }
}
