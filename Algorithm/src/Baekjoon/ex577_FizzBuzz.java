package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex577_FizzBuzz {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        String result = "";
        for (int i = 0; i < 3; i++) {
            String str = br.readLine();
            if (Character.isDigit(str.charAt(0))) {
                num = Integer.parseInt(str) + 3 - i;
                break;
            }
        }
        if (num % 15 == 0) {
            result = "FizzBuzz";
        } else if (num % 3 == 0) {
            result = "Fizz";
        } else if (num % 5 == 0) {
            result = "Buzz";
        } else {
            result = String.valueOf(num);
        }

        System.out.println(result);
    }
}
