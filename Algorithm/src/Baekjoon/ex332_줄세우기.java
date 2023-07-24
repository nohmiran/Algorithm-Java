import java.util.ArrayList;
import java.util.Scanner;

public class ex332_줄세우기 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
		ArrayList<Integer> list = new ArrayList<>();
		int test = sc.nextInt();
		
		for(int i = 0; i < test; i++) {
			int num = sc.nextInt();
			
			if(num == 0) { // 입력받은 수가 0이라면
                list.add(i + 1); // 현재 인덱스(i)에 1을 더한 값을 ArrayList에 추가
            } else { // 0이 아니라면
                list.add(list.size() - num, i + 1); // ArrayList에 현재 인덱스(i) + 1 값을 num만큼 뒤에 삽입
            }
		}
		
		for(int i :list) {
			System.out.print(i+" ");
        }
	}
}
