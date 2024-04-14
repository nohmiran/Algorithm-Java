import java.util.*;

public class ex567_사칙연산 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			long a = sc.nextLong();
			String str = sc.next();
			long b = sc.nextLong();
			String t = sc.next();
			long c = sc.nextLong();
			long result = 0;
			if(str.equals("+")) {
				result = a + b;
			} else if(str.equals("-")) {
				result = a - b;
			} else if(str.equals("*")) {
                result = a * b;
            } else if(str.equals("/")) {
				result = a / b;
			}
            t = result == c ? "correct" : "wrong answer";
			System.out.println(t);
		}
	}
}
