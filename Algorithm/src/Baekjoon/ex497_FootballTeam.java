import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex497_FootballTeam {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;
        while (true) {
            str = br.readLine();
            if (str == null) {
                break;
            }

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'e') {
                    sb.append("i");
                } else if (ch == 'i') {
                    sb.append("e");
                } else if (ch == 'E') {
                    sb.append("I");
                } else if (ch == 'I') {
                    sb.append("E");
                } else {
                    sb.append(ch);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
