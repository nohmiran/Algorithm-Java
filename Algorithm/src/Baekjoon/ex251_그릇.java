package Baekjoon;

import java.io.*;
import java.util.*;

public class ex251_그릇 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        int height = 10;
        
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                height += 5;
            } else {
                height += 10;
            }
        }
        System.out.print(height);
    }
}
