package Baekjoon;

import java.io.*;

public class ex542_자석체인 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numMagnets = Integer.parseInt(br.readLine());
        String magnetStates = br.readLine();
        boolean isConnected = true;
        
        char prevMagnet = magnetStates.charAt(0);
        for (int i = 1; i < magnetStates.length(); i++) {
            char currentMagnet = magnetStates.charAt(i);
            if (prevMagnet == currentMagnet) {
                isConnected = false;
                break;
            }
            prevMagnet = currentMagnet;
        }
        bw.write(isConnected ? "Yes\n" : "No\n");
        bw.flush();
        bw.close();
    }
}
