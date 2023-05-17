import java.util.*;

public class ex264_소트인사이드 {
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int arr[]  = new int[10];
		int i = 0;
		
		while (num > 0) {
			arr[i] = num % 10;
			num /= 10;
			i++;
		}
		Arrays.sort(arr);
		
		for (int j = 9; j > 9 - i; j--) {
			System.out.print(arr[j]);
		}
	}
}
