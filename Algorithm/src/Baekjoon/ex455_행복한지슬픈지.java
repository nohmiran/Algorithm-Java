package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex455_행복한지슬픈지 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int happy = str.length() - str.replace(":-)", "").length();
        int sad = str.length() - str.replace(":-(", "").length();

        if (happy == 0 && sad == 0)
            System.out.println("none");
        else if (happy > sad)
            System.out.println("happy");
        else if (happy < sad)
            System.out.println("sad");
        else
            System.out.println("unsure");
    }
}
