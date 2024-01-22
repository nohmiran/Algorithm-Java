package Baekjoon;

import java.io.*;
import java.util.Arrays;

public class ex505_고급수학 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test = Integer.parseInt(br.readLine());

        for (int i = 1; i <= test; i++) {
            int [] triangleInfoArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
            int a = triangleInfoArray[0];
            int b = triangleInfoArray[1];
            int c = triangleInfoArray[2];

            if (c * c == a * a + b * b) {
                bw.write("Scenario #" + i + ":\n" + "yes\n\n");
            }else {
                bw.write("Scenario #" + i + ":\n" + "no\n\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
