package Baekjoon;

import java.io.*;

public class ex564_가변배열 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = bf.readLine().split(" ");
        
        int result = Integer.parseInt(arr[0]);
        int sum = 0;
        int plus = Integer.parseInt(arr[1]);
        int minus = Integer.parseInt(arr[2]);
        int size = plus + minus;
        
        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(bf.readLine());
            if(num == 1){
                if(result == sum){
                    result *= 2;
                }
                sum++;
            } else {
                sum--;
            }
        }
        System.out.println(result);
        bw.flush();
        bw.close();
    }
}
