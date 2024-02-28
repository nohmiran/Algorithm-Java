package Baekjoon;

import java.io.*;

public class ex536_11月 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num1 = Integer.parseInt(bf.readLine());
        int num2 = Integer.parseInt(bf.readLine());
        int sum = num1 + (num2 * 7);
        if(sum > 30){
            System.out.println("0");
        } else {
            System.out.println("1");
        }
        bw.flush();
        bw.close();
    }
}
