package Baekjoon;

import java.util.*;

public class ex331_뒤집힌덧셈 {
    
    public static int rev(int n) {
        String s = "";
        while(n > 0) {
            s += n % 10;
            n /= 10;
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(rev(rev(x) + rev(y)));
    }

}
