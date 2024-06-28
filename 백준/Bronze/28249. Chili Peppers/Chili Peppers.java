import java.util.*;
import java.io.*;

public class Main {
    public static int parse(String s) {
      return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> chili = new HashMap<>();
        chili.put("Poblano", 1500);
        chili.put("Mirasol", 6000);
        chili.put("Serrano", 15500);
        chili.put("Cayenne", 40000);
        chili.put("Thai", 75000);
        chili.put("Habanero", 125000);

        int n = parse(br.readLine());
        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += chili.get(br.readLine());
        }

        System.out.println(sum);
    }

}