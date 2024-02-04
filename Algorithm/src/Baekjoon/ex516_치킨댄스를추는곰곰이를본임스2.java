package Baekjoon;

import java.io.*;

public class ex516_치킨댄스를추는곰곰이를본임스2 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int size = Integer.parseInt(bf.readLine());
        int result = 0;
        
        for (int i = 0; i < size; i++) {
            String[] arr = bf.readLine().split("\\-");
            int num = Integer.parseInt(arr[1]);
            if(num <= 90){
                result++;
            }
        }
        System.out.println(result);
        bw.flush();
        bw.close();
    }
}
