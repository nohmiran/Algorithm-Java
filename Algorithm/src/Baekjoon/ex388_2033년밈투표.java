package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex388_2033년밈투표 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int songCount = Integer.parseInt(reader.readLine());

        String str = "Never gonna give you up,"
                + "Never gonna let you down,"
                + "Never gonna run around and desert you,"
                + "Never gonna make you cry,"
                + "Never gonna say goodbye,"
                + "Never gonna tell a lie and hurt you,"
                + "Never gonna stop";

        for (int i = 0; i < songCount; i++) {
            String song = reader.readLine();
            if (!str.contains(song)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
