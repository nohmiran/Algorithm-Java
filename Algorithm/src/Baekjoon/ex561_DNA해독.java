package Baekjoon;

import java.util.Scanner;

public class ex561_DNA해독 {
  
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] a = scanner.next().toCharArray();
        char[][] b = new char[20][20];

        b[0][0] = b[6][19] = b[19][6] = b[0][2] = b[2][0] = 'A';
        b[2][2] = b[0][6] = b[6][0] = 'C';
        b[6][6] = b[2][19] = b[19][2] = b[0][19] = b[19][0] = 'G';
        b[19][19] = b[2][6] = b[6][2] = 'T';

        for (; --n > 0; a[n - 1] = b[a[n - 1] - 'A'][a[n] - 'A']) ;

        System.out.println(a[0]);
    }
}
