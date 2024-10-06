import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());

        int count = 0;

        for(int i = 0; i < n; i++) {
            String inputString = br.readLine();
            if(inputString.contains(s)) {
                count++;
            } else {
                for(int j = 0; j < s.length() - 1; j++) {
                    String subString = inputString.substring(11 - s.length() + j) + inputString.substring(0, j + 1);
                    if(subString.contains(s)) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}