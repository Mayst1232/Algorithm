import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String check = br.readLine();
            int count = 0;

            if(check.equals("0")) {
                sb.deleteCharAt(sb.length()-1);
                break;
            } else {
                for(int i = 0; i < check.length() / 2 ; i++) {
                    if(check.charAt(i) == check.charAt(check.length() - 1 - i)) {
                        count++;
                    }
                }
            }

            if(count == check.length() / 2) {
                sb.append("yes");
            } else {
                sb.append("no");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.close();
    }
}