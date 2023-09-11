package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex380_24 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String startStr = br.readLine();
        String endStr = br.readLine();

        StringTokenizer startTokenizer = new StringTokenizer(startStr, ":");
        StringTokenizer endTokenizer = new StringTokenizer(endStr, ":");

        int startHour = Integer.parseInt(startTokenizer.nextToken());
        int startMinute = Integer.parseInt(startTokenizer.nextToken());
        int startSecond = Integer.parseInt(startTokenizer.nextToken());

        int endHour = Integer.parseInt(endTokenizer.nextToken());
        int endMinute = Integer.parseInt(endTokenizer.nextToken());
        int endSecond = Integer.parseInt(endTokenizer.nextToken());

        int startSeconds = (startHour * 3600) + (startMinute * 60) + startSecond;
        int endSeconds = (endHour * 3600) + (endMinute * 60) + endSecond;

        if (endSeconds < startSeconds) {
            endSeconds += 24 * 3600;
        }

        int difference = endSeconds - startSeconds;

        System.out.format("%02d:%02d:%02d", (difference / 3600), ((difference / 60) % 60), (difference % 60));
    }
}
