import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<String> strList = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String s = br.readLine();

            if(strList.contains(s)) {
                continue;
            }

            strList.add(s);
        }

        Collections.sort(strList, (o1, o2) -> {
            if(o1.length() == o2.length()){
                return o1.compareTo(o2);
            }
            else {
                return o1.length() - o2.length();
            }
        });

        for (String s : strList) {
            System.out.println(s);
        }
    }
}