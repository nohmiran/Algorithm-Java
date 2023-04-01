import java.util.*;

public class ex225_진법변환 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int num = sc.nextInt();
		int temp = 1;
		int result = 0;
		
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			
			if('A'<= c && c <= 'Z') {
				result += (c - 'A' + 10) * temp;
			}else {
				result += (c - '0') * temp;
			}
			temp *= num;
		}
		
		System.out.println(result);
		
	}
}
