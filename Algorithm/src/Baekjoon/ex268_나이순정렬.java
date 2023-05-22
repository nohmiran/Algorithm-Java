import java.util.*;

public class ex268_나이순정렬 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
		String[] arr = new String[201];
		Set<Integer> ages = new HashSet<>();
        
		int num = sc.nextInt();
        
		for (int i = 0; i < num; i++) {
            
			int age = sc.nextInt();
			String name = sc.next();
            
			if (arr[age] == null) {
				arr[age] = age + " " + name + "\n";
			} else {
				arr[age] += age + " " + name + "\n";
			}
			ages.add(age);
		}
		List<Integer> list = new ArrayList<>(ages);

		Collections.sort(list);

		for (int age : list) {
			System.out.print(arr[age]);
		}
	}
}
