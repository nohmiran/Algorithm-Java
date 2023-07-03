import java.util.Scanner;

public class ex311_개표 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int count1 = 0;
		int count2 = 0;
		String str = sc.next();
        
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'A')
				count1++;
			else if(str.charAt(i) == 'B')
				count2++;
		} if(count1 > count2) {
			System.out.print("A");
        } else if (count1 < count2){
			System.out.print("B");
        } else {
			System.out.print("Tie");
        }
	  }
}
