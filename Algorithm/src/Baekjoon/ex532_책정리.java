package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex532_책정리 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] nm = br.readLine().split(" ");
        String[] box = br.readLine().split(" ");
        String[] book = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int sumBox = 0;
        int sumBook = 0;
        
        for(int i = 0; i < n; i++) {
            sumBox += Integer.parseInt(box[i]);
        }

        for(int i = 0; i < m; i++) {
            sumBook += Integer.parseInt(book[i]);
        }

        int result = sumBox - sumBook;

        System.out.println(result);
        bw.flush();
        bw.close();
    }
}
